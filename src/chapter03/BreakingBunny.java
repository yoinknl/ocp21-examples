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
