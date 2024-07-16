package chapter04;

import java.time.LocalDate;
import java.time.Month;

public class DateTimeExamples {
  public static void main(String[] args) {
    var date = LocalDate.of(2022, Month.APRIL, 30);
    date.plusDays(2);
    date.plusYears(3);
    System.out.println(date.getYear() + " " + date.getMonth()
                       + " " + date.getDayOfMonth());



    var date3 = LocalDate.of(2022, Month.APRIL, 30).plusDays(2).plusYears(3);
    
    var date2 = LocalDate.of(2022, Month.APRIL, 30)
      .plusDays(2)
      .plusYears(3);
    System.out.println(date2.getYear() + " " + date2.getMonth()
                       + " " + date2.getDayOfMonth());
  }
}
