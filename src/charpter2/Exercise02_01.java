package charpter2;

public class Exercise02_01 {
  // Main method
  public static void main(String[] args) {
    java.util.Scanner input = new java.util.Scanner(System.in);
    // Enter a temperature in Celsius
    System.out.print("Enter a temperature in Celsius: ");
    double celsius = input.nextDouble();

    // Convert it to Fahrenheit
    double fahrenheit = (9.0 / 5) * celsius + 32;

    // Display the result
    System.out.println(celsius + " Celsius is " +
      fahrenheit + " Fahrenheit");
  }
}
