public class InheritanceDemo {

    public static void main(String[] args) {

        //  byte 8, short , int, long
        // float, double
        //char
        //boolean
        //String

       /* byte b = 10;
        int a = (int) b;  //upcasting

        int d = 10;
        //byte f = d; //default downcasting not allowed
        byte e = (byte) d; //downcasting: risk,

        float g = 5.67f;  //conversion of float to int: NA, specific casting
        int h = (int) g;

        float i = d;  //convert into float: this is allowed

        //boolean j =  6;
        //int k = (int) j;


*/

        //class to class:
   /*     Chrome c1 = new Chrome();

        //concerting child to parent: upcast :  you can access methods of that parent only
        //here you cannot access methods of the child class
        Browser b1 = new Chrome();  //upcasting
        Browser b2 = (Browser) new Chrome();

        b1.openURL();
        b2.openURL();

        ((Chrome) b1).devTools();  //downcasting: is only allowed when you have already done upcasting
        ((Chrome)  new Chrome()).devTools();
        (new Chrome()).devTools();
        new Chrome().devTools();



        ((Chrome) b1).openURL();
        ((Chrome) b1).cliInspect();

*/

        //covert parent to child: downcast
        //Chrome c2 = new Browser();  //Compilation error : not allowed  //default downcast

/*
        Browser nc1 = (Chrome) new Browser();
        nc1.openURL();

        Chromium nc2 = (Chrome) new Browser();
        nc2.cliInspect();
        nc2.openURL();
*/



        /*
        Chrome c2 = (Chrome) new Browser();  //specific downcast not allowed at run time
        c2.openURL();  //No Compilation errors: but RunTime exception
        c2.cliInspect(); //No Compilation errors: but RunTime errors
        c2.devTools(); //No Compilation errors: but RunTime errors
        */




    }

   /* public void m2() {
        //  Chrome b3 =  new Browser();
        Browser b6 = new Chrome();
        Chrome c7 = (Chrome) b6;
        Chrome c8 = (Chrome)  new Chrome();
*/

        //Chrome b4 = (Chrome) b3;

/*
        b4.devTools();
        b4.openURL();
        b4.cliInspect();

        Chrome b5 = (Chrome) b3;
        //Browser b3 = new Chrome();  //
        //b3.openURL();
*/




        Chromium c1 = new Chromium();
        Browser c2 = new Chromium();
        Object c3 = new Chromium();

        Chrome ch1 = new Chrome();  //make instance of child, and also behave as child

        //ch1.devTools();

        Chromium ch2 = new Chrome();  //make instance of child, but behave as a parent
        //ch2.devTools();  //not allowed

        Browser ch3 = new Chrome();





        Object ch4 = new Chrome();
        //NonChromium nc1 = new Chrome();

        NonChromium nc = new NonChromium();

        Edge e1 = new Edge();

    }

}
