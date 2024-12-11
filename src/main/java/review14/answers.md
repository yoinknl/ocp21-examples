
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


## Puzzle 05

`new PrintWriter(new FileWriter(f))` or use `write()` on `FileWriter` directly.


## Puzzle 06

`new PrintWriter(new OutputStreamWriter(stream))`

