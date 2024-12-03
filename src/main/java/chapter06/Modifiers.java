package chapter06;

public abstract class Modifiers {





  public static void m1() {}
  static public void m2() {}

  final public void m3() {}

  protected abstract void m4();

  abstract protected void m5();

  abstract void m6();

  static void m7() {}

  private void m8() {
  }

  abstract class ExtendedModifiers extends Modifiers {

    // @Override Nope, it doesn't override
    private void m8() {
    }

  }

  public static void main(String[] args) {

  }


  /*


  modifier* type naam() {}

  [modifier[, modifier]*] type naam() {}


   */

}
