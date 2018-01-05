package com.company.challenge4;

import java.util.Scanner;

public class Main {
  public static int SimpleAdding(int num) {
    int result = (num + 1) * (num / 2);
    if (num % 2 != 0) {
      result += (num / 2) + 1;
    }
    return result;
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print(SimpleAdding(s.nextInt()));
  }
}
