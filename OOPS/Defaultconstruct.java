package OOPS;

class Mobile {
    String brand; 
    
    Mobile(){
        brand ="unknown";
    }

    }

public class Defaultconstruct {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        System.out.println(m1.brand);
    }
}
