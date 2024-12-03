package chapter11;

public class NullPointers {
  public static void main(String[] args) {
    var huey = (String)null;
    Integer dewey = null;
    Object louie = null;
    if(louie == huey.substring(dewey.intValue())) {
      System.out.println("Quack!");
    }
  }
}
