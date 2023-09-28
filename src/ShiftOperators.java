public class ShiftOperators {

  public static void main(String[] args) {


    printBinary(10);
    printBinary(6);
    printBinary(10 ^ 6);


//    printBinary(1);
//    printBinary(1 >> 4);
//    printBinary(1 << 4);
//    printBinary(100);
//    printBinary(100 << 4);
//    printBinary(100 >> 4);
//
//    printBinary(1);
//    printBinary(1 >>> 4);
//    printBinary(1 >>> 40);
//
//    printBinary(100);
//    printBinary(-100);
//    printBinary(-100 >> 4);
//    printBinary(-100 >>> 4);

  }

  private static void printBinary(int i) {


    final String binaryString = Integer.toBinaryString(i);

    for (int j = 0; j < (32 - binaryString.length()) ; j++) {
      System.out.printf("0");
    }

    System.out.println( binaryString + ": " + i);
  }

}
