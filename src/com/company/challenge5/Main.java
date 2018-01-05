package com.company.challenge5;

import java.util.Scanner;

public class Main {
  public static String LetterCapitalize(String str) {
    StringBuilder result = new StringBuilder();
    String[] strings = str.split(" ");
    for (String string : strings) {
      string = string.substring(0, 1).toUpperCase() + string.substring(1);
      result.append(string + " ");
    }

    return result.toString().trim();
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print(LetterCapitalize(s.nextLine()));
  }
}
