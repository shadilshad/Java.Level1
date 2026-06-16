package OOPS;

class Mobile {
    String brand; 
    void details(){
        System.out.println("Brand: "+ brand);
    }
}

public class Classandobjects{
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.brand = "samsung";
        m1.details();
    }
}