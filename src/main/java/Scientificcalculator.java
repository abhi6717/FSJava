public class Scientificcalculator extends Calculator {
    public int addition(int a, int b,String s) { //overloaded

        System.out.println("S value is"+s);
        return a + b;
    }
    public int addition(int a, int b){//overrided
        int c= a+b+10;
        System.out.println(c);
        return c;
    }
}
