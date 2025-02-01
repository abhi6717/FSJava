public class EnhancedForDemo {

    public static void main(String[] args) {


        Animal lion = new Animal("lion");
        Animal tiger = new Animal("tiger");
        Animal fox = new Animal("fox");

        Animal[] animals = new Animal[]{lion, tiger, fox};

        for(Animal n: animals) {
            n.printDetails();
            //System.out.println(n.name);
        }





        /*
        String[] names = new String [] {"Abilash", "Soumya", "Priya", "Fijula"};

        int[] empId = {1,2,3,4,5};


        for(int i = 0 ; i < names.length; i++) {

            System.out.println("Item at pos: "+ i + " is: "+names[i]);
        }

        //enhanced For loop
        for (int n : empId) {
            System.out.println("empId are:" +n);
        }
*/
    }
}
