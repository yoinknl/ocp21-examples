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



  public void myVarArgs(int... numbers) {
    for (int i = 0; i < numbers.length; i++) {

    }
  }

}
