package com.company.challenge3;

import java.util.ArrayList;

public class Main {
  public static String LetterChanges(String str) {
    StringBuilder replaceString = new StringBuilder();
    ArrayList<Character> vowelsLower = new ArrayList<>();
    vowelsLower.add('a');
    vowelsLower.add('o');
    vowelsLower.add('e');
    vowelsLower.add('i');
    vowelsLower.add('u');

    for (int i = 0; i < str.length(); i++) {
      Character c = str.charAt(i);
      if (('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z')) {
        c = (char) ((int)c + 1);
        if (c > 'z') {
          c = 'a';
        } else if (c > 'Z' && c < 'a') {
          c = 'A';
        }

        if (vowelsLower.contains(c)) {
          c = (char)((int) c - 32);
        }
        replaceString.append(c);
      } else {
        replaceString.append(c);
      }
    }
    return replaceString.toString();
  }
}
