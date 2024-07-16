package chapter03;//import java.lang.management.MemoryType;

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
//      case null:
//        System.out.println("Case: null");
    }


//    MemoryType mtype = MemoryType.HEAP;
//
//
//    var val = switch (mtype) {
//      case HEAP -> "Het is de HEAP";
//      case NON_HEAP -> "Het is niet de HEAP";
//    };
  }










}



