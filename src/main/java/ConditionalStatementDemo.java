public class ConditionalStatementDemo {

    public static void main(String[] args) {

        ConditionalStatementDemo d1 = new ConditionalStatementDemo();
       // System.out.println(d1.getAgeCategory(5));

        String result = d1.getAgeCategory(30);
        System.out.println(result);
    }

    public String getAgeCategory(int age) {

        String ageCategory = null;

        //age>0 & age<18 :child
        //age>18 & age<60 :adult
        //age>60 :sc

        if  ( (age>0) &&  (age<18))
        {
             ageCategory = "child";
            System.out.println("Running If block");
        }
        else if ((age>=18) && (age<60)) {
            ageCategory = "adult";
            System.out.println("Running if else1 block");
        }
        else if  (age>=60) {
            ageCategory ="Senior Citizen";
        }
        else {
            System.out.println("please learn more about ages");
        }


        return ageCategory;    //child,adult,SC
    }
}
