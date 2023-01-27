public class PrimeNumber {
    public static void main(String[] args) {
      int n = 2, count = 0, sum = 0;
      while (count < 100) {
        if (isPrime(n)) {
          sum += n;
          count++;
        }
        n++;
      }
      System.out.println("Sum of the first 100 prime numbers: " + sum);
    }
  
    public static boolean isPrime(int num) {
      if (num <= 1) {
        return false;
      }
      for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) {
          return false;
        }
      }
      return true;
    }
  }  