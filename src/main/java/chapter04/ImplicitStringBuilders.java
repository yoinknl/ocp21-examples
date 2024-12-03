package chapter04;

public class ImplicitStringBuilders {

  public static void main(String[] args) {
    int numFish = 4;
    String fishType = "tuna";
    // Java translates any String with the "+" operator to a StringBuffer with append-calls
    String anotherFish = numFish + " " + 1;
    String anotherFishCompiled = new StringBuilder().append(numFish).append(" ").append(1).toString();
//    String anotherFish2 = "" + (numFish + 1);
//    String anotherFish2Compiled = new StringBuilder("").append(numFish).append(1).toString();
    System.out.println(anotherFish + " " + fishType);
    System.out.println(numFish + " " + 1);


  }
}
