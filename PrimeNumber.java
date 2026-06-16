package Loops;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 7;
        boolean pr = true;

        if(num <=1){
            pr = false;
        }
        else{
            for(int i=2; i < num ; i ++){
                if(num%i == 0){
                    pr = false;
                    break;
                }
            }
        }
        if(pr){
            System.out.println("its prime number");
        }
        else{
            System.out.println("it aint");
        }
    }
    
}
