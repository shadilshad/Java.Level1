package Other;
import java.time.LocalDateTime;
public class Enumm{
   enum Level{
    LOW,
    MEDIUM,
    HIGH
   }
   public static void main(String[] args) {
    Level l1 = Level.MEDIUM;
    LocalDateTime LT = LocalDateTime.now();
System.out.println(LT);
   switch (l1) {
    case LOW:
        System.out.println("Ur level is low");
        break;
    case MEDIUM:
        System.out.println("Your level is medium");
    break;
        case HIGH:
       
        System.out.println("Your level is high");
           break;

        default:
            System.out.println("Invalid");
        break;
   }
 }
}