package chapter05;

public class VarArgs {





  public void addAll(int a, int b) {
    addAllInternal(new int[] {a, b});
  }

  public void addAll(int a, int b, int c) {
    addAllInternal(new int[] {a, b, c});
  }

  private void addAllInternal(int[] as) {
    for (int i = 0; i < as.length; i++) {

    }
  }

  public void myVarArgs(int a, int... numbers) {
    System.out.println("Method a");
  }

  public void myVarArgs(int... numbers) {
    System.out.println("Method a");
    for (int i = 0; i < numbers.length; i++) {

    }
  }

  public static void main(String[] args) {
    final VarArgs varArgs = new VarArgs();

    // Having ambiguous varags overloads is confusing:
    varArgs.myVarArgs();
//    varArgs.myVarArgs(1);
    varArgs.myVarArgs(1, new int[] {2});
//    varArgs.myVarArgs(1, 2, 3);
  }

  public void myMethodWithoutVarArgs(int n1) {}
  public void myMethodWithoutVarArgs(int n1, int n2) {}
  public void myMethodWithoutVarArgs(int n1, int n2, int n3) {}
  public void myMethodWithoutVarArgs(int n1, int n2, int n3, int n4) {}

}
