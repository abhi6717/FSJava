public class ConditionalStatementDemo {

    public static void main(String[] args) {
        ConditionalStatementDemo d1 = new ConditionalStatementDemo();
        d1.switchDemo(60);
        //d1.switchDemo2('M');
    }

    //public String getAgeCategory(int age)

    //boolean, float, long,double: NA in switch condition
    //char,byte,short,int,String :Allowed
    public void switchDemo(int age){

        switch(age) {


            case 60:{
                System.out.println("You are senior citizen");
                break;
            }
            case 18: {
                System.out.println("You are an adult");
                break;
            }
            default : {
                System.out.println("You are young");
                break;
            }
        }
    }
    public void switchDemo2(char gender){
        switch (gender) {
            case 'M': {
                System.out.println("Gender is Male");
                break;
            }
            case 'F': {
                System.out.println("Gender is Female");
                break;
            }
            default :{
                System.out.println("Please provide correct input");
                break;
            }
        }
    }
}
