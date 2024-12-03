package chapter02;

public class NumberPromotion {

  public static void main(String[] args) {
    byte apples = 5;
    short oranges = 10;

    float bananasF = apples + oranges;
    int bananasI = apples + oranges;
    double bananasD = apples + oranges;

    // Widens to int
//    short bananasS = apples + oranges;
//    byte bananasB = apples + oranges;
  }

}
