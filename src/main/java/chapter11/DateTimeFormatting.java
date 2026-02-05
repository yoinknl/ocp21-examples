package chapter11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatting {


  public static void main(String[] args) {



    DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);


    System.out.println(formatter.format(LocalDateTime.now()));

  }
}
