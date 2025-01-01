public class Calculator {

    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        int c= c1.addition(10,5);
        System.out.println(c);
        int d= c1.subtract(10,5);
        System.out.println(d);
        int e= c1.multiply(10,5);
        System.out.println(e);
        float f= c1.division(10,5);
        System.out.println(f);
    }
    public int addition (int a, int b) {
        int sum = a+b;
        return sum;
    }

    public float division(int a, int b){
        float division = a/b;
        return division;
    }

    public int multiply (int a, int b) {
        int multiple = a*b;
        return multiple;
    }

    public int subtract (int a, int b) {
        int subtract = a-b;
        return subtract;
    }
}
