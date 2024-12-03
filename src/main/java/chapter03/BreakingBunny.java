package chapter03;

public class BreakingBunny {


  public static void main(String[] args) {
    int count = 0;
    BUNNY: for(int row = 1; row <=3; row++)
      RABBIT: for(int col = 0; col <3 ; col++) {
        if((col + row) % 2 == 0)
          // continue / break / ... ?
        count++;
      }
    System.out.println(count);

  }


}

/*

 Iteration 1:
   row == 1
   col == 0
   count -> 1
 Iteration 2:
   row == 1
   col == 1
   break BUNNY ? -> count == 1 -> WRONG
   break RABBIT ? -> continue to row == 2 (Iteration 3)
   continue RABBIT ? -> continue to col == 2 (Iteration 3b)
   continue BUNNY ? -> continue to row == 2 (Iteration 3c)
 Iteration 3:
   row == 2
   col == 0
   break RABBIT -> continue to row == 3 (Iteration 4)
 Iteration 4:
   row == 3
   col == 0
   count -> 2
 Iteration 5:
   row == 3
   col == 1
   break RABBIT -> going to print with count ==2 -> CORRECT


 Iteration 3b:
   row == 1
   col == 0
   count -> 2
 Iteration 4b:
   row == 1
   col == 1
   continue RABBIT -> continue to col = 2
 Iteration 5b:
   row == 2
   col == 0
   continue RABBIT
 Iteration 6b
   count -> 3 -> WRONG


  Iteration 3c:
    row == 2
    col == 0
    continue BUNNY
  Iteration 4c:
    row == 3
    col == 0
    count -> 2 -> CORRECT (Because row is now 3 and it breaks)



// Shorter, but maybe not better explanation? 😅

 1
    0 count++
    1 > exit
 2
    0 > exit
    1 count ++ ? > nee
 3
    0 count++
    1 > exit




 */
