package core;

public class Corecombo {
    public static void main(String[] args) {
        int digit= 1234;
        int sum=0;
        
        while(digit != 0){
            int num = digit%10;
            sum += num;
            num = digit/10;
        }

    }
}
