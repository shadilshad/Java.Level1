package Foundation;

public class Swap {
    public static void main(String[] args) {
        var numb1 = 30;
        var numb2 = 40;
        System.out.println("Before Swapping: Number 1: "+ numb1 + " & Number2 : "+ numb2);

        var temp = numb1;
         numb1 = numb2;
         numb2 = temp;

        System.out.println("After Swapping: Number 1: " + numb1+ " & Number2 : "+ numb2);
    }
    
}
