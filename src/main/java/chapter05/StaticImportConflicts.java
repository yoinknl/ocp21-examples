package chapter05;

import static chapter05.helpers.Rope.*;
import static chapter05.helpers.Swing.*;

public class StaticImportConflicts {

  public static void main(String[] args) {
    // This is not going to work: it's ambiguous
    //System.out.println(LENGTH);


    // The same goes for the methods
    //swing();
  }

}
