package com.example;

import java.util.stream.Collectors;

public class StringMethodExample {

  public static void main(String[] args) {
    System.out.println(" ".isBlank());
    System.out.println("".isBlank());
    System.out.println(" ".isEmpty());
    System.out.println("".isEmpty());

    System.out.println("1\n2\n3".lines().collect(Collectors.toList()));

    /**
     * But we already have trim(). Then what’s the need of strip()?
     * strip() is “Unicode-aware” evolution of trim().
     *
     * When trim() was introduced, Unicode wasn’t evolved. Now,
     * the new strip() removes all kinds of whitespaces leading and trailing(check the
     * method Character.isWhitespace(c) to know if a unicode is whitespace or not)
     */
    System.out.println("           luram             ".strip());
    System.out.println("           luram             ".stripLeading());
    System.out.println("           luram             ".stripTrailing());

    System.out.println("=".repeat(5));
  }

}
