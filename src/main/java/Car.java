public class Car {

    private String engineName;

    public void setEngineName(String engineName) {
        if(engineName.equalsIgnoreCase("cycle")) {
            System.out.println("You are not meant to use Car, Stick to cycling!");
        } else {
            this.engineName = engineName;
        }
    }

    public String getEngineName() {
        return engineName;
    }


}

