package review01_04;

public class Puzzle06 {

  int temp = 1;

  {
    int a = 2;
    temp += a;
  }

  public int runMe(int temp) {
    return temp;
  }

  public static void main(String[] args) {
    int temp = 5;

    var p = new Puzzle06();

    // Question: What will this statement print?
    System.out.println(p.runMe(temp - 1));

  }
}
