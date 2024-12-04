package review14_15;

public class Puzzle03 {

  /* Read the following code and try to answer the question below on line 32.
   */
  public static void main(String[] args) throws Exception {

    var conn = AnimalsDb.createNewEmptyDatabase();

    var selectPs = conn.prepareStatement("SELECT age FROM pets");
    var insertPs = conn.prepareStatement("INSERT INTO pets (name, species, age) VALUES (?, ?, ?)");

    conn.setAutoCommit(false);

    try (conn; selectPs; insertPs) {

      conn.setSavepoint();

      insertPs.setString(1, "Henk");
      insertPs.setString(2, "dog");
      insertPs.setInt(3, 11);

      conn.setSavepoint();

      insertPs.setInt(3, 14);

      conn.setSavepoint();

      insertPs.execute();

      // How many records will be printed here and which?
      try (var rs = selectPs.executeQuery()) {
        while (rs.next()) {
          System.out.println("Age: " + rs.getInt(1));
        }
      }

    }
  }
}
