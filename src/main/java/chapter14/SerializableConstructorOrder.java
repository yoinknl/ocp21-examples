package chapter14;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SerializableConstructorOrder {

  public static class Bird {
    protected transient String name;
    protected Connection connection;

    public void setName(String name) { this.name = name; }

    public String getName() { return name; }

    public Bird() throws SQLException {
      this.name = "Matt";
      // This is why we call the constructor of the first non-serializable class in the inheritance
      // hierarchy. It's not exactly best practice anymore, but it is possible and makes sure that
      // the Connection is not serialized, but re-created when the Eagle-object is deserialized.
      this.connection = DriverManager.getConnection("jdbc:sqlite");
    }
  }

  public static class Eagle extends Bird implements Serializable {

    public int wingspan = 400;

    { this.name = "Olivia"; }

    public Eagle() throws SQLException {
      this.name = "Bridget";
    }
  }




  public static void main(String[] args) throws Exception {
    var e = new Eagle();
    e.name = "Adeline";
    e.wingspan = 800;

    final File tempFile = File.createTempFile("ocp17", "chapter14_testje");

    try (var out = new ObjectOutputStream(new FileOutputStream(tempFile))) {
      out.writeObject(e);
    }

    // Read back the file

    try (var in = new ObjectInputStream(new FileInputStream(tempFile))) {
      final Eagle object = (Eagle) in.readObject();

      System.out.println(object.name);
      System.out.println(object.wingspan);
    }

  }
}
