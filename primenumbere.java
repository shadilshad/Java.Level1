package Loops;
import java.util.Scanner;
public class primenumbere {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.println("Check Whether Your Number is a Prime Number or not!");
     System.out.println("Write your number: ");
     int num = sc.nextInt();
     boolean numbs = true;

     if(num <= 1){
        numbs = false;
     }
     else{
        for(int i=2; i<num; i++){
            if(num%i==0){
                numbs = false;
                break;
            }
        }
        }
     if(numbs){
        System.out.println("Its a primary number");
     }
     else{
        System.out.println("Its not a primary number");
     }
     sc.close();
    }
    
}
