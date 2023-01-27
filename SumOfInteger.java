import java.util.Scanner;

public class SumOfInteger {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter an integer: ");
    int num = scanner.nextInt();

    int sum = 0;

    while (num != 0) {
      int lastDigit = num % 10;
      sum += lastDigit;
      num /= 10;
    }

    System.out.println("Sum of digits: " + sum);
  }
}
