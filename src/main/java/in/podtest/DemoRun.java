package in.podtest;

public class DemoRun {

    public static void main(String[] args) {

        Animal a1 = new Animal();
        a1.gtDetails();
        System.out.println(a1.weight);
        a1.getWeight();

        Human h1= new Human();
        System.out.println(h1.name);
        h1.eat();
        System.out.println(h1.weight);
        h1.getWeight();

    }
}
