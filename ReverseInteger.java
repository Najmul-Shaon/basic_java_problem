import java.util.Scanner;

public class ReverseInteger {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String original = scanner.nextLine();

    String reversed = "";
    for (int i = original.length() - 1; i >= 0; i--) {
      reversed += original.charAt(i);
    }

    System.out.println("The reversed string is: " + reversed);
  }
}
