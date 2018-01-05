package com.company.challenge1;

import java.util.Scanner;

public class Main {
  public static int FirstFactorial(int num) {

    // code goes here
    /* Note: In Java the return type of a function and the
       parameter types being passed are defined, so this return
       call must match the return type of the function.
       You are free to modify the return type. */
    int result = 1;
    for (int i = 1; i <= num; i++) {
      result *= i;
    }
    return result;

  }

  public static void main(String[] args) {
    // keep this function call here
    Scanner s = new Scanner(System.in);
    System.out.print(FirstFactorial(s.nextInt()));
  }
}
