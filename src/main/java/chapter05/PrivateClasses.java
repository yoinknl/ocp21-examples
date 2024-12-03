package chapter05;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrivateClasses {

  private class MyHandler implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

    }


  }

  public void registerHandlerOnThin(JButton button) {
    button.addActionListener(new MyHandler());
  }

  private record Pos(int x, int y) {}

  public int calculateSpacesClosesToEachOther(int[][] grid) {



    return 0;
  }

  public static void main(String[] args) {
    
  }

}

class AnotherHiddenClass {

}
