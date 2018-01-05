package com.company.challenge2;

import java.util.Scanner;

public class Main {
  public static String LongestWord(String sen) {
    String longest = "";
    String temp = "";
    int maxLength = 0;
    for (int i = 0; i < sen.length(); i++) {
      Character c = sen.charAt(i);
      if (('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z')) {
        temp += c;
      } else {
        if (maxLength < temp.length()) {
          longest = temp;
          maxLength = temp.length();
        }
        temp = "";
      }
    }

    if (maxLength < temp.length()) {
      longest = temp.toString();
    }

    return longest;
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print(LongestWord(s.nextLine()));
  }
}
