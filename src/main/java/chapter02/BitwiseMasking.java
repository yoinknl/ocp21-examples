package chapter02;

public class BitwiseMasking {


  public static final int MONDAY = 0b0;
  public static final int TUESDAY = 0b1;
  public static final int WEDNESDAY = 0b10;
  public static final int THURSDAY = 0b11;
  public static final int FRIDAY = 0b100;


  public static void main(String[] args) {


    int fieldA =  0b11010011;
    int dayMask = 0b00000111;
    //            0b00000011;
    //            0b11010000

    int otherValue = (fieldA & 0b11111000) >> 3;

    int dayOfWeek = fieldA & dayMask;

    if (dayOfWeek == MONDAY) {
      //
    } else if (dayOfWeek == TUESDAY) {}
    else if (dayOfWeek == WEDNESDAY) {}
    else if (dayOfWeek == THURSDAY) {}
    else if (dayOfWeek == FRIDAY) {}
    else {
      // Unknown value
    }






  }

}
