package chapter07;

public class Fox {

  private class Den {}

  public void goHome() {
    new Den();
  }

  public static void visitFriend() {
    new Fox().new Den();  // DOES NOT COMPILE

    var fox = new Fox();

    fox.new Den();
  }



  public static void main(String[] args) {

    // Static context, nothing in memory yet

    Fox fox = new Fox();

    fox.goHome();
    new Fox().goHome();
//    Fox.goHome(fox);




  }
}

//class Squirrel {
//  public void visitFox() {
//    new Den();  // DOES NOT COMPILE
//  }
//}
//
