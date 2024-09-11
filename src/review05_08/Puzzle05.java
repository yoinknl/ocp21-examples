package review05_08;

/**
 * Before running this Puzzle, look at the code and try to decide what it is going to print. Look for the comments that
 * start with 'Question:' and try to answer those questions. Once you think you know the answer, run the application and
 * see if you got it right. If things break, try to think how you could fix it.
 */
public class Puzzle05 {

  static class Vehicle {

  }

  static abstract class Car extends Vehicle {
    static double calculateBaseTaxForCar(Car c) {
      return c.getNumberOfSeats() * c.getGrossWeight() * 0.01;
    }

    abstract int getNumberOfSeats();
    abstract int getGrossWeight();
  }

  static class SUV extends Car {
    static double calculateBaseTaxForCar(Car c) {
      return 14.0;
    }

    int getNumberOfSeats() {
      return 6;
    }

    int getGrossWeight() {
      return 2500;
    }
  }

  static class Sportscar extends Car {
    static double calculateBaseTaxForCar(Car c) {
      return 20.0;
    }

    int getNumberOfSeats() {
      return 2;
    }
    int getGrossWeight() {
      return 1200;
    }
  }

  static class Sedan extends Car {
    static double calculateBaseTaxForCar(Car c) {
      return 12.0;
    }

    int getNumberOfSeats() {
      return 4;
    }
    int getGrossWeight() {
      return 1700;
    }
  }

  public static void main(String[] args) {
    // Question: What do the following lines print:
    var sc = new Sportscar();
    Car abstractSportscar = sc;
    System.out.println(sc.getGrossWeight());
    System.out.println(abstractSportscar.getGrossWeight());

    System.out.println(Sportscar.calculateBaseTaxForCar(sc));
    System.out.println(abstractSportscar.calculateBaseTaxForCar(abstractSportscar));
  }

  // DON'T SCROLL DOWN YET!
  // !!!!!!!!!!!!!!!!!!!!!!
  // !!!!!!!!!!!!!!!!!!!!!!
  // !!!!!!!!!!!!!!!!!!!!!!
  // !!!!!!!!!!!!!!!!!!!!!!

}

/**
 * Here in this example I finally came up with a "real world" way why you might want to use hiding.
 * In this example, we use Car to calculate the base tax for a vehicle. The hierarchy of Vehicles is
 * open to be extended to allow new types of cars with new characteristics to be added to the system.
 * What we don't want, is the base calculate to change. So the calculateBaseTaxForCar is made static
 * and the fact that we define the abstractSportscar as a Car and not a var, means we will _always_
 * use our own implementation of calculateBaseTaxForCar. No matter the actual type of the object, we
 * will always get our predictable formula (given that the referenced instance methods stick to their
 * contract ofcourse).
 */
