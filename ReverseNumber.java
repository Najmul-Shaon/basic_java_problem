import java.util.Scanner;

public class ReverseNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    String str = Integer.toString(num);
    String reversed = "";
    for (int i = str.length() - 1; i >= 0; i--) {
      reversed += str.charAt(i);
    }
    int reversedNum = Integer.parseInt(reversed);
    System.out.println("Reversed Number: " + reversedNum);
  }
}
