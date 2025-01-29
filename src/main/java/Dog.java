public class Dog {

    Collar c;
    String name;
    public static void main(String[] args) {

        Dog d;
        d = new Dog();
        d.go(d);
    }

   public void go(Dog dog){

    c= new Collar();
    dog.setName("Aiko");
   }
     public void setName(String dogName) {
        name= dogName;
     }
     }