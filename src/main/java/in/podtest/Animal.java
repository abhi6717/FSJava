package in.podtest;

public class Animal {

    public String name = "Animal";
     int weight =14;
    private int age =6;
    public void eat(){
        System.out.println("animal is eating");
        getDetails();
    }
    public void gtDetails(){
        System.out.println(name+ ":"+age);
    }
    void getWeight(){
        System.out.println("My weight is:");
    }
}
