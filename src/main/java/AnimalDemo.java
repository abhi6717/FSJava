public class AnimalDemo {

    public static void main(String[] args) {
        //Animal.eat();

        Animal lion =  new Animal();
        Animal tiger = new Animal();


        lion.id = 10;
        tiger.id = 20;

        //Animal.name = "Elpehant";
        lion.name = "lion";
        tiger.name = "tiger";

        System.out.println(lion.id); //10
        System.out.println(tiger.id); //20

        System.out.println(lion.name); //lion
        System.out.println(tiger.name); //tiger
        //Animal.walk();
    }
}