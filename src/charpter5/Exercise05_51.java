package charpter5;

import java.util.Scanner;

public class Exercise05_51 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter two strings
    System.out.print("Enter the first string: ");
    String s1 = input.nextLine();
    System.out.print("Enter the second string: ");
    String s2 = input.nextLine();

    String result = "";

    for (int i = 0; i < s1.length(); i++)
    {
      if (s1.charAt(i) == s2.charAt(i))
        result += s1.charAt(i);
      else
        break;
    }

    if (result.length() > 0) {
      System.out.println("The common prefix is " + result);
    }
    else {
      System.out.println(s1 + " and " + s2 + " have no common prefix");
    }
  }
}
