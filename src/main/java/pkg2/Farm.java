package pkg2;

public class Farm {
    protected Farm() {
        System.out.println("Farm class");
    }

    void m2() {
        Farm f1 = new Farm();
    }
}

