public class largest {
    public static void main(String[] args) {
      double num1 = 205;
      double num2 = 30;
      double num3 = 20;
  
      if (num1 > num2 && num1 > num3) {
        System.out.println("The largest number is: " + num1);
      } else if (num2 > num1 && num2 > num3) {
        System.out.println("The largest number is: " + num2);
      } else {
        System.out.println("The largest number is: " + num3);
      }
    }
  }
  