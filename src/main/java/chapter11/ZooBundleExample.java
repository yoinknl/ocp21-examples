package chapter11;

import java.util.Locale;
import java.util.ResourceBundle;

public class ZooBundleExample {

  public static void main(String[] args) {
     Locale.setDefault(Locale.of("en", "US"));

     var locale = Locale.of("en", "CA");
     ResourceBundle rb = ResourceBundle.getBundle("zoo", locale);

     System.out.print(rb.getString("hello"));
     System.out.print(". ");
     System.out.print(rb.getString("name"));
     System.out.print(" ");
     System.out.print(rb.getString("open"));
     System.out.print(" ");
     System.out.print(rb.getString("visitors"));
    System.out.println(rb.getString("test"));

  }
}
