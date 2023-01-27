import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
  public static void main(String[] args) {
    LocalDateTime current = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    String formattedDate = current.format(formatter);
    System.out.println("Current Date and Time: " + formattedDate);
  }
}
