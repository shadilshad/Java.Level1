package OOPS;

class Student{
    private String name;

    public void setname(String name){
        this.name = name;
    }
    public String getname(){
            return name;
    }

}

public class Encapsulationn {
    public static void main(String[] args) {
        Student s = new Student();
        s.setname("SHADIL VV");

        System.out.println("His name is "+ s.getname());
    }

    
}
