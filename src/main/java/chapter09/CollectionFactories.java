package chapter09;

import java.util.*;
import java.util.function.Predicate;

public class CollectionFactories {

  private final Set<String> allowedValues = Set.of("a", "b", "c");

  public static void main(String[] args) {
    Set<String> set = new HashSet<String>();
    set.add("a");
    set.add("b");

    Set<String> setFromFactory = Set.of("a", "b");

    final List<String> a1 = List.of("a", "b", "c");

    final Map<String, Integer> a = Map.of("a", 5);

  }


  public <T> int countElementsGenerically(List<T> list) {
    return list.size();
  }

  public int countElements(List<?> list) {
    return list.size();
  }

  public int sumElements(List<? extends Number> list) {
    int sum = 0;

    for (Number o : list) {
      sum += ((Number) o).intValue();
    }

    return sum;
  }

  final Predicate<Number> deVoorwaardeDieJeMoetTesten = null;

  final Predicate<Integer> mijnEigenVoorwaarde = null;

  public void findElement(List<Integer> list, Predicate<? super Integer> predicate) {
    predicate.test(list.get(0));
  }

  public void test() {
    findElement(List.of(1,2 ,3), deVoorwaardeDieJeMoetTesten);
    findElement(List.of(1, 2, 3), mijnEigenVoorwaarde);
  }





  static void testMe() {

    List<String> strings = new ArrayList<String>();
    strings.add("tweet");

    List<Object> objects = new ArrayList<Object>(strings);
    addSound(strings);
    addSound(objects);


  }

  static void addSound(List<? super String> list) {
    Object ding = list.get(0);
    ding.toString();

    list.add("Quck");
  }





}
