public class DummyRun {

    public static void main(String[] args) {
     School sc1 = new School();
     sc1.name = "SMBVO";
     sc1.address ="Omerga";
     sc1.principal = "Mr.Gaikwad";

     Teacher t1 = new Teacher();
     t1.name = "Akash";
     t1.subject = "Maths";

     Student s1 = new Student();
     s1.name = "Ani";
     s1.age = 27;

     Student s2 = new Student();
     s2.name = "Lalit";
     s2.age = 24;

     ClassRoom cr1 = new ClassRoom();
     cr1.floorNumber = 5;
     cr1.seatCount =51;
    }
}
