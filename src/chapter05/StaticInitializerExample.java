package chapter05;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StaticInitializerExample {


  private final static Map<Integer, String> statusCodeToMessage;

  static {
    var messages = new HashMap<Integer, String>();
    messages.put(404, "Not Found");
    messages.put(400, "Bad Request");
    messages.put(403, "Unauthorized");
    messages.put(500, "Internal Server Error");
    // ...
    messages.put(200, "OK");

    statusCodeToMessage = Collections.unmodifiableMap(messages);
  }



}
