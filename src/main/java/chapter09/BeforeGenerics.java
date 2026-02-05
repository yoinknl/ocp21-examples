package chapter09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.IntFunction;

public class BeforeGenerics {

  record Kat() {}

  record Pair<A, B>(A a, B b) {}

  class MyList<T> {

//    static T myElement;

//    public T[] toArray() {
//      var myArray = new T[10];
//
//    }
  }

  public static void main(String[] args) {



    List myStrings = new ArrayList();


    myStrings.add(new Kat());
    myStrings.add(4);
    myStrings.add("a");
    myStrings.add("b");
    myStrings.add("c");
    myStrings.add("d");


    final Object o = myStrings.get(0);

    String myString = (String)myStrings.get(0);


    var myStringList = new ArrayList<String>();


    myStringList.add("a");

    myStringList.toArray(String[]::new);


    List<Kat> myKatList = new ArrayList<Kat>();

    myKatList.add(new Kat());




    Map<String, List<Pair<String, Integer>>> myMap = new HashMap<>();
  }



}
