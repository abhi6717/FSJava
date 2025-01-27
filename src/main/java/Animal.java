public class Animal {

    public String name;
    public int id;

    public Animal(String animalName, int animalId) {
        name = animalName;
        id = animalId;
    }
    public void getDetails() {

        System.out.println("Name is:"+name+", id is: "+id);
    }
}