package chapter07;

public class EvilAbstractClass {
    // The next line is just plain EVIL

  public static abstract class Herbivore {
    int amount = 10;

    public abstract void chew(); {
      System.out.println("nomnom");
    }
  }

  public static class IsAPlant extends Herbivore {
    Object eatGrass(int season) {
      return null;
    }

    public void chew() {
      System.out.println("chompchomp");
    }

    public static void main(String[] args) {
      new IsAPlant().chew();
    }
  }

}
