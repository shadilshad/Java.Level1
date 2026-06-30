package placement;

public class Palindrome {

    public static void main(String[] args) {
        int num = 121;
        int value = 121;
        int reverse =0;

        while(value != 0){
            int digit = value % 10;
            reverse = reverse * 10 + digit;
            value = value / 10 ;
        }
        if(num==reverse){
            System.out.println("Its palindrome");
        }
        else{
            System.out.println("Its not palindrome");
        }
    }
    
}
