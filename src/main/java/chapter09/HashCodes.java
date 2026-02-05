package chapter09;

import java.util.*;
import java.util.stream.Stream;

public class HashCodes {


  public static void main(String[] args) {


    Stream.of("hello", "hi", "HI", "Hi")
        .forEach(v -> System.out.printf("%5s - %8d - %d\n", v, v.hashCode(), v.hashCode() % 5));



//    System.out.println("Hoi".hashCode());
//    System.out.println("Hoi".hashCode() %  5);
//
//    System.out.println("hoi".hashCode());
//    System.out.println("hoi".hashCode() %  5);
//
//    System.out.println("holadajeeee".hashCode());
//    System.out.println("holadajeeee".hashCode() %5);
//

//    HashMap<String, String> map = new HashMap<>();
//
//    var k1 = new Kavel();
//    k1.kavelnummer = "B100";
//    k1.eigenaar = "Nick";
//    var k2 = new Kavel();
//    k2.kavelnummer = "B101";
//    k2.eigenaar = "JH";
//
//
//    System.out.println(k1.hashCode());
//    System.out.println(k2.hashCode());
//    System.out.println(k1.equals(k2));
//
//
//    List<Kavel> kavelsGesorteerdOpEigenaar = new ArrayList<>();
//
//    kavelsGesorteerdOpEigenaar.add(k1);
//    kavelsGesorteerdOpEigenaar.add(k2);
//
//    kavelsGesorteerdOpEigenaar.stream()
////        .sorted((kavelA, kavelB) -> kavelA.eigenaar.compareTo(kavelB.eigenaar))
////        .sorted(new KavelEigenaarComparator())
//
//
//        // <T, U extends Comparable<? super U>>
//        // comparing(Function<? super T, ? extends U> keyExtractor)
//        // type van "Kavel::getEigenaar" === Function<Kavel, String>
//        // T === Kavel (of parent class van Kavel)
//        // U === String (of parent class van String)
////        .sorted(Comparator.comparing(Kavel::getEigenaar))
//        // T === Kavel
//        // U === String
////        .sorted(Comparator.comparing(Bezit::getEigenaar))
//
//
//
//        .sorted(Comparator.comparing(Kavel::getEigenaar, Comparator.comparing(Eigenaar::voornaam)))
//
//
//
//        .forEach(System.out::println);
  }

  record Eigenaar(String bsn, String voornaam) implements Comparable<Eigenaar> {

    @Override
    public int compareTo(Eigenaar o) {
      return voornaam.compareTo(o.voornaam);
    }
  }

  interface Bezit {
    Eigenaar getEigenaar();
  }

  public static class Kavel implements Comparable<Kavel>, Bezit {

    public String kavelnummer;

    public Eigenaar eigenaar;
    public String locatie;

    @Override
    public Eigenaar getEigenaar() {
      return eigenaar;
    }

    @Override
    public boolean equals(Object o) {
      if (o == null || getClass() != o.getClass()) return false;

      Kavel kavel = (Kavel) o;
      return Objects.equals(kavelnummer, kavel.kavelnummer) && Objects.equals(eigenaar, kavel.eigenaar) && Objects.equals(locatie, kavel.locatie);
    }

    @Override
    public int hashCode() {
      int result = Objects.hashCode(kavelnummer);
      result = 31 * result + Objects.hashCode(eigenaar);
      result = 31 * result + Objects.hashCode(locatie);
      return result;
    }

    @Override
    public int compareTo(Kavel o) {
      return kavelnummer.compareTo(o.kavelnummer);
    }
  }

  static class KavelEigenaarComparator implements Comparator<Kavel> {
    @Override
    public int compare(Kavel o1, Kavel o2) {
      // [-1..MIN_INT]  =>  o1 <  o2
      // 0              =>  o1 == o2
      // [+1..MAX_INT]  =>  o1 >  o2
      return o1.eigenaar.compareTo(o2.eigenaar);
    }
  }

  public record Gebruiker(String naam, int leeftijd) {

    @Override
    public boolean equals(Object obj) {
      return naam.equals(((Gebruiker) obj).naam);
    }

    public int hashCode() {
      return 1;
    }

  }

}
