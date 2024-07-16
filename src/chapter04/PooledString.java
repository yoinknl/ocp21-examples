package chapter04;

import java.util.HashMap;
import java.util.Map;

public class PooledString {

  private static final Map<String, PooledString> pool = new HashMap<>();


  private final String s;

  public PooledString(String s) {
    this.s = s;

    // Put myself in the pool if there is no instance for this value yet
    if (!pool.containsKey(s)) {
      pool.put(s, this);
    }
  }


  public PooledString intern() {
    if (pool.containsKey(this.s)) {
      return pool.get(this.s);
    } else {
      pool.put(this.s, this);
      return this;
    }
  }


  public static void main(String[] args) {

    var ps1 = new PooledString("Hello");
    var ps2 = new PooledString("Hello");

    System.out.println(ps1 == ps2);
    System.out.println(ps1 == ps2.intern());

    pool.computeIfAbsent("Blaat", (key) -> {


      return new PooledString(ps1.s);
    });

//    ps1 = new chapter04.PooledString("Iets Anders");

  }

}
