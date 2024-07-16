package chapter04;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class NumberFormatter {
  public static void main(String[] args) {
    Locale.setDefault(new Locale("nl"));

    String pattern = "#,###,000.0#";
    var message = DoubleStream.of(5.21, 8.49, 1234, 20_000_000_000L)
        .mapToObj(v -> new DecimalFormat(pattern).format(v))
        .collect(Collectors.joining("> <"));
    System.out.println("<"+message+">");

  }
}
