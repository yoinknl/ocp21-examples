package dep_inversion.with;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.function.*;

public class LambdaScopes {

  long grootGetal = 1_000_000;
  long reallyUgle = 1___________2;
  long[] longs = {1, 0, 0, 0, 0, 0, 0, 0, 2};
  String[] strings = {"", ""};


  public void remove(List<Character> chars) {
    char end = 'z';
    Predicate<Character> predicate = c -> {
      char start = 'a'; return start <= c && c <= end; };

    char c  = 'c';
    // INSERT LINE HERE
  }

  public void optiondemo() throws FileNotFoundException {

    Optional<String> maybeAString = Optional.empty();

    maybeAString.orElseThrow(() -> new FileNotFoundException());

  }

  public static boolean var(BinaryOperator<Boolean> bo) {
    return bo.apply(true, false);
  }

  public static void main(String[] args) {


    var a = var((var var, var b) -> false);

  }

  public static void interfaces() {
//      Supplier<String> x = String::new; // new String()
//      Function<String, String> y = m.andThen(n);
//      UnaryOperator<String> z = a -> a + a;
  }

  // s.compose(t)
  // s(t(x))


  record User(){}
  record Account() {}

  interface UserAccountFunction extends BiFunction<User, Account, Boolean> {}

  public static void main2(String[] args) {
    UserAccountFunction checkLoginFunction;
  }

}
