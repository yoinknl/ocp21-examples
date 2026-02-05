package chapter07;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class MyOwnList extends AbstractList<String> {

  public enum MyEnum {

    VAL1, VAL2;

    private int counter = 0;

    public void bla() {
      counter++;
    }


  }


  public interface MyNewInterface {

    private void standaardGedrag() {

      System.out.println("Deze werkt nog niet in deze versie!");
      throw new UnsupportedOperationException();
    }

    default void actie1() { standaardGedrag(); }
    default void actie2() { standaardGedrag(); }
    default void actie3() { standaardGedrag(); }
    default void actie4() { standaardGedrag(); }
    default void actie5() { standaardGedrag(); }


  }


  @Override
  public String get(int index) {
    return "";
  }

  @Override
  public int size() {
    return 0;
  }
}
