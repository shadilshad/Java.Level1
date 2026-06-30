package placement;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            
            System.out.println("what year?");
            int year = sc.nextInt();

            if(year%4==0 || year%400==0){
                System.out.println("its a leap year");
            }
            else if(year%100==0){
                 System.out.println("Its not a leap year");
               
            }
            else{
                System.out.println("Its not a leap year");
            }
        } catch (InputMismatchException e) {
            // TODO: handle exception
            System.out.println("Invalid");
        }


    }
    
}
