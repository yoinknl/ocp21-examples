
## Puzzle 01

The `Character.toUpperCase(c)` is not casting the input to a `char`. This mean the `Character`
method is not interpreting it as a character. Instead it is interpreting it as a Unicode 
codepoint. Adding a cast to `(char)` fixes this.

The loop is reading 2 characters every iteration, but the loop-condition does not account for
this. The String "mississippi" has 11 characters, causing the last iteration to append the
value for `-1` to the String, rather than terminating.

### The Fix

Casting the `c` variable to `(char)` fixes the first problem. The other problem actually requires us
to rewrite the loop somewhat. Either we check if there are at least 2 more characters left in the stream
and then read the last character after the stream. Or, we iterate per character and keep an even/odd counter
to decide if we append the regular or the Uppercase character.

## Puzzle 02

The file will actually continue to copy "Hello World" to itself, causing an infinite loop if it is not
terminated somehow. The `bytesWritten`-condition is the one that prevents this from happening.

If you remove the append `true` from the `FileOutputStream`-constructor, the file gets truncated before
anything can be read from it. This causes the file to empty by the end of the loop.

## Puzzle 03

There will only be one record in the table, since we only called `execute()` once on the INSERT prepared
statement. The most recently set values on the prepared statement will then be inserted, therefore we will
see the program print "Age: 14".

The `setSavepoint()` calls here don't actually do anything. They create savepoints, but since we do not
rollback, they have no influence on the end result.


## Puzzle 04

The first error is the setting of the value 4 as the second parameter on the `eligiblePetsPs`. There is
no second parameter and this piece of code is making it look like you can set two values for the parameter.
To get the pets of age 3 _and_ 4, we should add `OR age = ?` to the SQL clause to make it work.

The other problem is actually not about JDBC, but about the Date/Time API. We are doing `plusDays(7)`, but
not saving the result of that call. That is why the checkup is scheduled on TODAY at 10:00.


## Puzzle 05

`new PrintWriter(new FileWriter(f))` or use `write()` on `FileWriter` directly.


## Puzzle 06

`new PrintWriter(new OutputStreamWriter(stream))`

