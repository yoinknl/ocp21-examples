package chapter07;

public class InhertingDefaultMethods {




  public interface Walk {
    default int getSpeed() { return 5; }
  }

  public interface Run {
    default int getSpeed() { return 10; }
  }

  public static class Cat implements Walk, Run {
    @Override
    public int getSpeed() { return 1; }

    public int getWalkSpeed() {
      return Walk.super.getSpeed();
    }
  }



}
