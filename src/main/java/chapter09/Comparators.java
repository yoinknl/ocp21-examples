package chapter09;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Comparators {

  record Verkoop(String kavelNummer, int jaartal) {}

  public static void main(String[] args) {

    List<Verkoop> list = new ArrayList<>();



    list.sort((v1, v2) -> {

      if (v1.kavelNummer.compareTo(v2.kavelNummer) == 0) {

        return Integer.compare(v1.jaartal, v2.jaartal);

      } else {

        return v1.kavelNummer.compareTo(v2.kavelNummer);

      }

    });


    list.sort((v1, v2) -> {


      var result1 = Comparator.comparing(Verkoop::kavelNummer).compare(v1, v2);

      if (result1 != 0) {
        return result1;
      }

      var result2 = Comparator.comparing(Verkoop::jaartal).compare(v1, v2);

      return result2;
    });

    list.sort(
        Comparator.comparing(Verkoop::kavelNummer)
            .thenComparing(Verkoop::jaartal)
    );







  }





}
