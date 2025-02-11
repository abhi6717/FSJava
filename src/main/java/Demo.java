public class Demo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.addition(5,6);  //parent *
        //c1.addition(5f, 6);  //parent
        //c1.addition();  //parent

        Scientificcalculator sc = new Scientificcalculator();
        sc.addition(5,6); //child oR 21
        //sc.addition(); //parent
        //sc.addition(5f,6); //parent
        //sc.addition(8,9, "Akhil"); //child OL

        //upcasting
        Calculator c2 = new Scientificcalculator();
        //c2.addition(); //Parent
        //c2.addition(5f,6);  //Parent
        c2.addition(5,6); //Child 21? Parent 11?:   child
        //c2.addition(5, 6, "Akhil");

        //downcasting
        Scientificcalculator sc2 = (Scientificcalculator) c2;
        Scientificcalculator sc3 = (Scientificcalculator) new Scientificcalculator();
        Scientificcalculator sc4 =  new Scientificcalculator();
        sc2.addition(5,6);  //child
    }
}
