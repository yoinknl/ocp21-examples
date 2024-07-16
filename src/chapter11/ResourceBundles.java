package chapter11;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundles {






  // Dolphins.properties
  // name=The Dolphin
  // age=0
  //
  // Dolphins_en.properties
  // name=Dolly
  // age=4
  // sex=Male
  //
  // Dolphins_fr.properties
  // name=Dolly


  public static void main(String[] args) {
    var fr = new Locale("fr");                   // <- Dolphins_fr.properties, Dolphins.properties
    Locale.setDefault(new Locale("en", "US"));   // <- Dolphins_en.properties, Dolphins.properties

    var b = ResourceBundle.getBundle("Dolphins", fr);

    b.getString("name");
    b.getString("age");
    b.getString("sex");
  }



}
