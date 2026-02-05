package chapter11;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CompileOrRuntimeParsing {

  public static void main(String[] args) {

    var f = DateTimeFormatter.ofPattern("hh' o''clock'");
    System.out.println(f.format(LocalTime.now()));

  }
}
