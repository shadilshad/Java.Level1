package placement;

public class Reverse {

    public static void main(String[] args) {
        
        int number = 43212;
        int reverse =0;

        while(number != 0){
            int digit = number%10;
          reverse = reverse*10 + digit;
          number = number/10;
        }
        System.out.println(reverse);
    }
    
}
