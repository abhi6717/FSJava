public class Animal {

    private String name;  //null   //lion

    public Animal(String name) {  //localname = lion
        //System.out.println(this.name);  //null
        //System.out.println(name);  //lion

        this.name = name;          //this.name = lion,
        //System.out.println(this.name);  //lion
        //System.out.println(name); //lion
    }

    public void printDetails() {
        System.out.println(name);
    }
}
