package review09_10;

import java.util.Comparator;
import java.util.TreeSet;

public class Puzzle07 {

    // What does this program print?
    //
    // A. [10, 30, 300, 400, 5000]
    // B. [300, 10, 30, 5000, 400]
    // C. [400, 300, 10, 30, 5000]
    // D. [400, 5000, 30, 10, 300]
    // E. [5000, 30, 10, 300, 400]
    // F. [5000, 400, 300, 30, 10]
    // G. The order is undefined

    record Animal(String name, int weight) implements Comparable<Animal>, Comparator<Animal> {
        @Override
        public int compareTo(Animal other) {
            return Integer.compare(this.weight(), other.weight());
        }

        @Override
        public int compare(Animal a2, Animal a1) {
            return a1.name().compareTo(a2.name());
        }

        @Override
        public final String toString() {
            return "" + weight();
        }
    }

    public static void main(String[] args) {
        TreeSet<Animal> a = new TreeSet<>(new Animal("Dog", 30));
        a.add(new Animal("Elephant", 5000));
        a.add(new Animal("Dog", 30));
        a.add(new Animal("Cat", 10));
        a.add(new Animal("Bear", 300));
        a.add(new Animal("Zebra", 400));

        System.out.println(a);
    }
}
