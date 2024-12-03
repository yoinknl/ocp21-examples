package review01_04;

/**
 * Before running this Puzzle, look at the code and try to decide what it is going to print. Look for the comments that
 * start with 'Question:' and try to answer those questions. Once you think you know the answer, run the application and
 * see if you got it right. If things break, try to think how you could fix it.
 */
public class Puzzle03 {

  public static void main(String[] args) {


    var max1 = Math.floor(Integer.MAX_VALUE * 2);
    var max2 = Math.floor(Integer.MAX_VALUE * 2L);
    var max3 = Math.floor(Integer.MAX_VALUE * 2.0);


    // Question: will the values of max1, max2 and max3 be the same value? If not, what's the difference?
    System.out.println(max1);
    System.out.println(max2);
    System.out.println(max3);




  }


}
