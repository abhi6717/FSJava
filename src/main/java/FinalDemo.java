public class FinalDemo {

     final int a=10;

    public static void main(String[] args) {

        FinalDemo d1 = new FinalDemo();
        d1.m1(5,6);
    }

    public void m1(final int a, final int b){
        final int c= 4;
        System.out.println(a+","+b+","+c);
    }


}
