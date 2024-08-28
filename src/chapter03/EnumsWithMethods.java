package chapter03;

public class EnumsWithMethods {

    enum FOOD {
      BERRIES { public boolean isHealthy() { return true; } },
      INSECTS {
        public boolean isHealthy() { helper(); return true; }
        public void helper() { System.out.println("JAHOE!"); }
      },
      FISH { public boolean isHealthy() { return true; } },
      ROOTS { public boolean isHealthy() { return true; } },
      COOKIES { public boolean isHealthy() { return true; } },
      HONEY { public boolean isHealthy() { return true; } };
      public abstract boolean isHealthy();

      public void doIetsMagisch(FOOD f) {
        INSECTS.isHealthy();
        // NOPE
        // INSECTS.helper();
      }
    }

    public static void main(String[] args) throws Exception {
      System.out.print(FOOD.INSECTS);
      System.out.print(FOOD.INSECTS.ordinal());
      System.out.print(FOOD.INSECTS.isHealthy());
      System.out.print(FOOD.COOKIES.isHealthy());

      // WHAT!?
      FOOD.INSECTS.getClass().getMethod("helper").invoke(FOOD.INSECTS);

    }


    // Note: the INSECTS#helper() method is unavailable, because it is implemented in an
    // anonymous inner class. The type of it is therefore not reachable and we cannot call
    // the helper() method from anywhere, other than the anonymous class it is defined in.
    // The only workaround is reflection

}
