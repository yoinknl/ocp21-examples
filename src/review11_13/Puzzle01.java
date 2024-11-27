package review11_13;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Puzzle01 {

  private static void doTheFirstThing() throws FileNotFoundException {}

  private static void doTheSecondThing() throws NullPointerException {}

  private static int doTheThirdThing() throws EOFException {
    return 1;
  }


  public static void main(String[] a) {
    try {
      doTheFirstThing();
      doTheSecondThing();
      var f = doTheThirdThing();
    } catch (Exception e) {
      // Which of these other catch clauses would be legal here:

      // A.
//       } catch (IOException e) {

      // B.
//       } catch (FileNotFoundException | IOException e) {

      // C.
//       } catch (IOException | NullPointerException e) {

      // D.
//      } catch (FileNotFoundException | EOFException e) {

      // E.
//       } catch (Exception f) {

      // F.
//       } catch (Exception a) {

    }
  }



}
