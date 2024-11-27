package chapter14;

import java.io.*;
import java.util.List;

public class SerializableCircularReference {

  public static class Zebra implements Serializable {
    private transient String name = "George";
    private static String birthPlace = "Africa";
    private transient Integer age;
    List<Zebra> friends = new java.util.ArrayList<>();

    {
      age = 10;
    }

    public Zebra() {
      this.name = "Sophia";
    }

  }

    public static void main(String[] args) throws Exception {
      var zebra1 = new Zebra();
      var zebra2 = new Zebra();

      zebra1.friends.add(zebra2);
      zebra2.friends.add(zebra1);

      final File tempFile = File.createTempFile("ocp17", "chapter14_zebras");

      try (var out = new ObjectOutputStream(new FileOutputStream(tempFile))) {
        out.writeObject(zebra1);
        out.writeObject(zebra2);
      }

      // Read back the file

      try (var in = new ObjectInputStream(new FileInputStream(tempFile))) {
        Zebra z1 = (Zebra) in.readObject();
        Zebra z2 = (Zebra) in.readObject();

        System.out.println(z1);
        System.out.println(z2);
      }

    }


  }
