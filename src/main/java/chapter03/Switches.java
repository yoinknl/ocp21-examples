package chapter03;//import java.lang.management.MemoryType;

import java.sql.SQLOutput;

public class Switches {

  public enum Role {
    EMPLOYEE,
    OFFICEMANAGER,
    DIRECTOR,
    CONSULTANT
  }


  public static void main(String[] args) {


    Role personRole = Role.OFFICEMANAGER;

    switch (personRole) {
      case OFFICEMANAGER:
      case DIRECTOR:
        System.out.println("Yes, you are authorized");
        break;
      case EMPLOYEE:
      case CONSULTANT:
        System.out.println("No, you are not authorized");
    }



    String value = args[0];

    String result = null;
    switch(value) {
      case "Hello":
        System.out.println("Case: Hello");
        result = "1";
      case "Niet Hello":
        System.out.println("Case: Not Hello");
        result = "2";
        break;
// In java 21 the following is possible, but adding a null-case also requires a default
//      case null:
//        System.out.println("Case: null");
//        break;
//      default:
//        System.out.println("DEFAULT!");
    }


//    MemoryType mtype = MemoryType.HEAP;
//
//
//    var val = switch (mtype) {
//      case HEAP -> "Het is de HEAP";
//      case NON_HEAP -> "Het is niet de HEAP";
//    };
  }




  private void noWayInHell(String helpMe) {

    // Yes we can, but please don't
    switch( switch(helpMe) {
      case "Hello" -> 4;
      case "World" -> 5;
      case "Niet Hello" -> 6;
      default -> 0;
    }) {
      case 0:
        System.out.println("OMG!");
        break;
      case 4:
        System.out.println("WHY !?");
        break;
      case 5:
        System.out.println("PLEASE DON'T !?");
        break;
      case 6:
        System.out.println("三三ᕕ( ᐛ )ᕗ");
    }




  }


  public void determineSomethingSomethingNumber(Number number) {
    String result = switch (number) {
      case Integer i when i > 0 -> "Int groter dan 0";
      case Integer i -> "Int kleiner dan of gelijk aan 0";
      case Float f -> "Float";
      default -> "Iets anders";
    };
  }


  public void doWeNeedDefaultWithBoolean(boolean b) {

//    String result = switch (b) {
//      case true -> "Yay";
//      case false -> "Nay";
//    };
  }


}



