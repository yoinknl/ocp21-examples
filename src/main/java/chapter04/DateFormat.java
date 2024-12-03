package chapter04;

import java.time.format.DateTimeFormatter;

public class DateFormat {

  public static void main(String[] args) {
    var f = DateTimeFormatter.ofPattern("hh 'o''clock'");

  }
}
