package review14_15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AnimalsDb {

  public static final String CREATE_ANIMALS = """
      create table pets
      (
          name    varchar,
          species varchar,
          age     integer
      );
      """;

  public static final String CREATE_CHECKUPS = """
      create table checkups
      (
          pet_id          integer,
          name            varchar,
          next_checkup    long
      )
      """;

  public static final String LOAD_ANIMALS = """
      insert into pets (name, species, age) VALUES
         ('Bobby', 'dog', 3),
         ('Prutser', 'cat', 12),
         ('Floepie', 'cat', 6),
         ('Baloe', 'hamster', 1),
         ('Luna', 'hamster', 0),
         ('Naan', 'dog', 7),
         ('Dux', 'dog', 5),
         ('Lucky', 'cat', 9),
         ('Jyn', 'cat', 4),
         ('Spooky', 'cat', 6);
      """;

  public static Connection createNewEmptyDatabase() throws SQLException {
    var conn = DriverManager.getConnection("jdbc:sqlite::memory:");

    conn.prepareStatement(CREATE_ANIMALS).execute();
    conn.prepareStatement(CREATE_CHECKUPS).execute();

    return conn;
  }

  public static Connection createNewDatabase() throws SQLException {
    var conn = createNewEmptyDatabase();

    conn.prepareStatement(LOAD_ANIMALS).execute();

    return conn;
  }

}
