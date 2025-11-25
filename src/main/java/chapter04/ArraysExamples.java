package chapter04;

import java.time.LocalTime;
import java.util.Arrays;

public class ArraysExamples {

  public static void main(String[] args) {


    int[][] scores = new int[5][];
    scores[0] = new int[2];
    scores[1] = new int[8];
    scores[2] = new int[4];

    /*

     [0] = [ ][ ]
     [1] = [ ][ ][ ][ ][ ][ ][ ][ ]
     [2] = [ ][ ][ ][ ]
     [3] = null
     [4] = null

     */

    Object[][][] cubbies = new Object[3][1][5];

//    String beans[] = new beans[6];
    String beans[] = new String[6];

    java.util.Date[][] dates0     = new java.util.Date[2][];
    java.util.Date[]   dates[]    = new java.util.Date[2][];
    java.util.Date[]   []dates1   = new java.util.Date[2][];
    java.util.Date     dates2[][] = new java.util.Date[2][];
    java.util.Date     []dates3[] = new java.util.Date[2][];

    // Please don't do this...
    java.util.Date[][] []moreDates[] = new java.util.Date[2][][][];

//    int[][] types = new int[];
    int[][] java = new int[][]  { new int[1], new int[2] };

    /*
     [0] = [ ]
     [1] = [ ][ ]
     */

    int[][][] firstZero = new int[0][][];

    int[] intsA = { 1, 2, 3 };
    int[] intsB = { 1, 2, 3 };

    // New copy of your array, safe for returning
    Arrays.copyOf(intsA, intsA.length);

    System.out.println(intsA.equals(intsB));
    System.out.println(Arrays.equals(intsA, intsB));

    testThisArray(new int[] { 2, 3, 4});
//    testThisArray({ 2, 3, 4});

  }

  public static void testThisArray(int[] vals) {

  }

}

/*

 "aaa" = char[] { 'a', 'b', 'b', 'a', 'c', 'c', 'a' }

 */
