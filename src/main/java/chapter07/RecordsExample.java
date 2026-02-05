package chapter07;

public class RecordsExample {

  record ImmutableInt(int value) {

    ImmutableInt {
      INSTANCE_COUNTER++;
    }

    static int INSTANCE_COUNTER = 0;

  }


  public static void main(String[] args) {
    var myInt = new ImmutableInt(5);
    var myInt1 = new ImmutableInt(6);
    var myInt2 = new ImmutableInt(7);
    var myInt3 = new ImmutableInt(8);

    System.out.println(ImmutableInt.INSTANCE_COUNTER);

  }

}
