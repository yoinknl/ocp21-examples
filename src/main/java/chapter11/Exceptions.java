package chapter11;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.ClosedFileSystemException;
import java.security.cert.CertificateParsingException;
import java.text.NumberFormat;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Exceptions {

  public void whatHappensNext() throws IOException {


  }


  public void withResource() {

    try {
      final FileInputStream fileInputStream = new FileInputStream("");
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    }


    var f = DateTimeFormatter.ofPattern("hh' o''clock'");

//    try (var input = new FileInputStream("")) {
//
//    }


  }

  public String formatOClock(Instant instant) {
    return DateTimeFormatter.ofPattern("hh").format(instant) + " o'clock";
  }

  public void nullPointers() {
    var huey = (String) null;
    Integer dewey = null;
    Object louie = null;

    if (louie == huey.substring(dewey.intValue())) {        //                + lhs: louie
      System.out.println("Quack!");                        //                |
    }                                                      //   if ( cond ) -+ operand: ==
    //                |
    //                + rhs: call(huey, substring, arg) - arg: call(dewey, intValue)
  }



  public void multiCatch() {

    try {
      new FileInputStream("");
    } catch (FileNotFoundException | ClosedFileSystemException ee) {
      System.out.println(ee);
    } catch (IOException ioe) {
      // Doe niks
    }


  }


  public static void main(String[] args) {
//    System.out.println(NumberFormat.getCurrencyInstance(Locale.of("nl", "NL"))
//        .format(2.4));

    printDitDing(Long.valueOf(8));
  }



  public static void printDitDing(Object whatever) {
    if (whatever instanceof String)
      System.out.println((String) whatever);
    else
      System.out.println(whatever.toString());
  }


}
