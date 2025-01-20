package in.podtest;

public class Human {

    Animal a1 = new Animal ();
    public String name= "Human";
    private int age =45;
    int weight = 15;

    public void eat(){
        System.out.println("Human is eating");
    }
    private void gtDetails(){
        System.out.println(name+ ":"+age);
    }
    void getWeight(){
        System.out.println("In weight");
    }
}
