package chapter07;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListeners {


  public static class MyActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      System.out.println("Action Performed");
    }
  }

  public static void main(String[] args) {
    var myButton = new Button();

    myButton.addActionListener(new MyActionListener());

    myButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.out.println("Button pressed");
      }
    });

    myButton.addActionListener((event) -> System.out.println("Lambda pressed!"));

  }

}
