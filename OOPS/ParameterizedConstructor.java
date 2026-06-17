package OOPS;
class Food{
    String food;
    int money;
    Food(String f, int m){
        food = f;
        money = m;

    }
}
public class ParameterizedConstructor {
    public static void main(String[] args) {
        
    

    Food fn = new Food("Biryani", 80);

    System.out.println(fn.food +" - "+ fn.money+"RS");
}}
