package chapter07;

public class InnerPrivates {

  public static class Movie {
    private int butter = 5;

    private Movie() {
    }

    protected class Popcorn {
      private Popcorn() {
      }

      private int amountOfSalt = 100;

      public static int butter = 10;

      public void startMovie() {
        System.out.println(butter);
//        System.out.println(new Soda().amount);
      }
    }

    public static void main(String[] args) {
      var movie = new Movie();
      Movie.Popcorn in = new Movie().new Popcorn();
      in.startMovie();
      System.out.println(in.amountOfSalt);
    }
  }


}

class Soda {
  private int amount = 1900;
}

