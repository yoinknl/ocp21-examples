package review14_15;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class Puzzle04 {

  /* The following code should query all pets of ages 3 and 4 and then schedule a checkup for them a
   * week from now at 10:00. There are however 2 things wrong with this code, can you find them?
   */
  public static void main(String[] args) throws Exception {

    // This database contains several rows in the `pets` table. Each row has these fields:
    // id: int
    // name: String
    // species: String
    // age: int
    var conn = AnimalsDb.createNewDatabase();

    var eligiblePetsPs = conn.prepareStatement("SELECT rowid, name, species, age FROM pets WHERE age = ?");
    var insertPs = conn.prepareStatement("INSERT INTO checkups (pet_id, name, next_checkup) VALUES (?, ?, ?)");
    var checkups = conn.prepareStatement("SELECT * FROM checkups");

    try (conn; eligiblePetsPs; insertPs) {
      // Query pets with age 3 and 4
      eligiblePetsPs.setInt(1, 3);
      eligiblePetsPs.setInt(2, 4);

      try (var pets = eligiblePetsPs.executeQuery()) {
        while (pets.next()) {
          // For each eligible pet, schedule a checkup next week at 10:00
          insertPs.setInt(1, pets.getInt("rowid"));
          insertPs.setString(2, pets.getString("name"));

          var nextCheckup = LocalDate.now().atTime(10, 00);
          nextCheckup.plusDays(7);

          // For simplicity, let's all assume we live in UTC
          insertPs.setLong(3, nextCheckup.toInstant(ZoneOffset.UTC).getEpochSecond());
          insertPs.execute();
        }
      }

      // Print the created checkup appointments
      try (var rs = checkups.executeQuery()) {
        while (rs.next()) {
          var petName = rs.getString("name");
          var checkupTime = Instant.ofEpochSecond(rs.getLong("next_checkup")).toString();
          System.out.printf("Pet: %20s - Checkup at: %s\n", petName, checkupTime);
        }
      }

    }
  }
}
