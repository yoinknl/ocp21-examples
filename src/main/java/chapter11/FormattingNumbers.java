package chapter11;

import java.text.DecimalFormat;

public class FormattingNumbers {


  public static void main(String[] args) {

    var value = 10980.5;
    var value2 = 87634876.434556;

//    Locale.setDefault(new Locale("en", "US"));

    final DecimalFormat format1 = new DecimalFormat("###,###,###.00000");
    final DecimalFormat format2 = new DecimalFormat("000,000,000.#####");


    System.out.println(format1.format( value ));
    System.out.println(format1.format( value2 ));

    System.out.println();

    System.out.println(format2.format( value ));
    System.out.println(format2.format( value2 ));


  }


}
