public class MethodDemo {


    public static void main(String[] args) {

        MethodDemo d1 = new MethodDemo();
        d1.findSquare(10,20); //Invoke of method
        d1.findSquare(19,3);

    }
    //Method declaration
    //Reusable logic

    public void findSquare (int n, int m) {
        int squareOfTwoNumber = (n*n)+(m*m)+(2*n*m);
        System.out.println("Output is: "+squareOfTwoNumber);
    }

     //General syntax
     /* [Access modifier] [return datatype] [Method name] [parameters ___n]  {

               body of method
}
*/

    public void m1(){

    }
    
}
