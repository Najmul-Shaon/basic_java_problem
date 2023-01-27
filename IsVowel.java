public class IsVowel {
    public static void main(String[] args) {
      char c = 'C';
  
      switch(c) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
          System.out.println(c + " is a vowel.");
          break;
        default:
          System.out.println(c + " is a consonant.");
      }
    }
  }
  