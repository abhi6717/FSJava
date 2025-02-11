public class DemoCar {

    public static void main(String[] args) {

        Car c1 = new Car();
        // c1.engineName = "Cycle";  //set

        // System.out.println(c1.engineName); //get

        c1.setEngineName("Maruti");
        System.out.println(c1.getEngineName());
    }
}

