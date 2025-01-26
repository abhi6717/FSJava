import java.util.Locale;

public class StringDemo {

    public static void main(String[] args) {

        //Animal mammal = new Animal();
        //mammal.eat();

        String gender = new String("abhishek");
        String name="abHishEk";
        String ln="Shinde";
        String fulln=name+ln;
        System.out.println(name.concat(ln));
      /*  System.out.println(gender.toUpperCase());
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(5));
        System.out.println(name.substring(5,9));
        System.out.println(name.substring(5));
        System.out.println(name.indexOf('k'));
        System.out.println(name.contains("abhi"));
        System.out.println(name.replace("hi","do"));
       */
        if(name.equalsIgnoreCase("abhishek")){
            System.out.println("Instructor");
        }
        else{
            System.out.println("Student");
        }




       /* String name = "Abhishek";
        int age=60;
        int age=10;
       */
    }
}
