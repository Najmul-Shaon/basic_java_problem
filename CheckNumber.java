import java.util.Scanner;

public class CheckNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    int result = num % 2 == 0 ? 1 : 0;
    System.out.println(result);
  }
}
