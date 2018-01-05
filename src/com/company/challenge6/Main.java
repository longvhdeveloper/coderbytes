package com.company.challenge6;

import java.util.Scanner;

public class Main {
  public static String SimpleSymbols(String str) {
    boolean isValid = false;
    char left = '\0';
    char right = '\0';
    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if ('a' <= c && c <= 'z') {
        if (i > 0)
          left = str.charAt(i - 1);
        if (i < str.length() - 1)
          right = str.charAt(i + 1);
        if (left == '+' && right == '+') {
          isValid = true;
        } else {
          isValid = false;
          break;
        }
      }
    }

    return isValid ? "true" : "false";
  }

  public static void main(String[] args) {
    // keep this function call here
    Scanner s = new Scanner(System.in);
    System.out.print(SimpleSymbols(s.nextLine()));
  }
}
