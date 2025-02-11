public class Calculator {

    public int addition(int a, int b){ //overriden in child class
        int c= a+b;
        System.out.println(c);
        return c;
    }
    public int addition(){
        return 0;
    }
    public int addition(float a, int b){
        int c= (int) (a+b);
        return c;
    }
    private float addition(float a,int b, int c) {
        return a+b+c;
    }




}
