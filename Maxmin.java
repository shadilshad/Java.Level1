package Foundation;

public class Maxmin {
    public static void main(String[] args) {
        var a= 100;
        var b =300;
        var c =299;

        System.out.println("Largest Number would be: " + Math.max(a, Math.max(b, c)));
        System.out.println("Smallest Number would be: " + Math.min(a, Math.min(b, c)));

    }
    
}
