package edu.luc.cs271.linkedstack;

import java.util.Scanner;

public class ReverseLines {

  public static void main(String[] args) {

    final Scanner input = new Scanner(System.in);
    String line;

    LinkedStack<String> stackReverse = new LinkedStack<String>();
    while ((line = input.nextLine()) != null) {
      stackReverse.push(line);
    }

    input.close();

    while (!stackReverse.isEmpty()) {
      System.out.println(stackReverse.pop());
    }
  }
}
