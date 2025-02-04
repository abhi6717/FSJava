package pkg2;

public class Animal {
    protected String name;



    private int a = 10;

    public void eat() {

        System.out.println(a);
        Animal a2 = new Animal("kangaroo");
        System.out.println(a2.a);

        System.out.println(name + " pkg2.Animal is eating") ;
        // System.out.println(name.concat(" pkg2.Animal is eating") );
    }

    public void m2() {
        eat(); //ND

        //Dot -> create object
        Animal a1 = new Animal("tiger");
        a1.eat();

    }


    public Animal(String name) {
        eat();


        System.out.println("pkg2.Animal Constructor Invoked");
        this.name = name;
    }
}
