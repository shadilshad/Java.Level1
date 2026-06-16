package OOPS;

class Free{
    int SI;
    String food;
    int price;

    void details(){
        System.out.println("SI NO: 1 " );
        System.out.println("Food Item: " + food);
        System.out.println(("Price: " + price));
    }
}
public class Obj {
    public static void main(String[] args) {
        Free f1 = new Free();
        f1.SI =1;
        f1.food = "biryani";
        f1.price = 90;

        Free f2 = new Free();
        f2.SI=2;
        f2.food = "shawarma";
        f2.price = 80;

        Free f3 = new Free();
        f3.SI=3;
        f3.food = "alokeee";
        f3.price = 9999999;

        f1.details();
        f2.details();
        f3.details();
    }
    
}
