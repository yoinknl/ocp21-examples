package chapter08;

import java.util.function.Supplier;

public class LazyEvaluation {



  public static class LazyValue<T> {
    public LazyValue(Supplier<T> valueCreator) {
      this.valueCreator = valueCreator;
    }

    private final Supplier<T> valueCreator;
    private T INSTANCE = null;

    public T get() {
      if (INSTANCE == null) {
        INSTANCE = valueCreator.get();
      }

      return INSTANCE;
    }
  }


  public static void main(String[] args) {


    var moeilijkeString = new LazyValue<String>(() -> "Heel" + "veel" + "string " + "concats" + "die" + "ik" + "niet " +
        "altijd" + "wil" + "uitvoeren");


    moeilijkeString.get();
    moeilijkeString.get();
    moeilijkeString.get();
    moeilijkeString.get();
    moeilijkeString.get();

  }


}
