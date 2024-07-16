package chapter02;

public class BitwiseNegate {

  public static void main(String[] args) {

    int positief = 843756;
    int negatief = -4;

    System.out.println("" + positief + " in binary and negated:");
    System.out.println(Integer.toBinaryString(positief));
    System.out.println(Integer.toBinaryString(~positief));
    System.out.println(~positief);

    System.out.println("" + negatief + " in binary and negated:");
    System.out.println(Integer.toBinaryString(negatief));
    System.out.println(Integer.toBinaryString(~negatief));
    System.out.println(~negatief);


    System.out.println();

    char a = 97;
    System.out.println(a);
    System.out.println(Integer.toBinaryString(a));
    System.out.println(~a); // The ~ operator changes the value a to an int and becomes signed
    System.out.println(Integer.toBinaryString(~a));

  }
}
