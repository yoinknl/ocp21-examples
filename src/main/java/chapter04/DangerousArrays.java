package chapter04;

import java.util.ArrayList;

public class DangerousArrays {


  public static void main(String[] args) {
    String[] strings = new String[] { "joepie" };
    Object[] objects = strings;


    Object[] objects2 = new Object[1];
    objects2[0] = new ArrayList();

    objects[0] = new ArrayList<>();
  }

}
