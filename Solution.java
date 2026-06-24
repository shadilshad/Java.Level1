import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i < t; i++){
            try{
                long num = sc.nextLong();
                System.out.println(num + " can be fitted in:");

                if(num >= Byte.MIN_VALUE && num <= Byte.MAX_VALUE)
                    System.out.println("* byte");

                if(num >= Short.MIN_VALUE && num <= Short.MAX_VALUE)
                    System.out.println("* short");

                if(num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE)
                    System.out.println("* int");

                System.out.println("* long");

            } catch(Exception e){
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
        sc.close();
    }
}