package pkg2;

public class Dog extends Animal {

    public void walk() {
        System.out.println(name);
        System.out.println(name+" is walking");
        eat();

        Animal a1 = new Animal("Cat");
        a1.eat();
    }

    public Dog(String name) {
        super(name);
        System.out.println("pkg2.Dog Constructor Invoked");
    }

}
