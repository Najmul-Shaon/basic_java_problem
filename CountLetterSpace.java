import java.util.Scanner;

public class CountLetterSpace {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String input = scanner.nextLine();

    int letters = 0;
    int spaces = 0;
    int digits = 0;
    int others = 0;

    for (int i = 0; i < input.length(); i++) {
      char ch = input.charAt(i);
      if (Character.isLetter(ch)) {
        letters++;
      } else if (Character.isSpaceChar(ch)) {
        spaces++;
      } else if (Character.isDigit(ch)) {
        digits++;
      } else {
        others++;
      }
    }

    System.out.println("Letters: " + letters);
    System.out.println("Spaces: " + spaces);
    System.out.println("Numbers: " + digits);
    System.out.println("Others: " + others);
  }
}