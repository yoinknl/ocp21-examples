package chapter11;

import java.util.Locale;
import java.util.ResourceBundle;

public class HelloInternationalWorld {


  public static void main(String[] args) {
    var de = new Locale("de");
    Locale.setDefault(new Locale("fr", "FR"));

    var b = ResourceBundle.getBundle("chapter11.labels", de);
    var b2 = ResourceBundle.getBundle("chapter11.labels");

    System.out.println(b.getString("title"));
    System.out.println(b.getString("cancel"));
    System.out.println(b.getString("uberLabel"));

    // This won't work because it's not in _de and not in the base file
    // System.out.println(b.getString("goodbye"));

    System.out.println(b2.getString("goodbye"));
  }

}
