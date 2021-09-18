public class Stu {
    String name;
    int rollno;
    int phnno;
    String address;
}
class Stuex{
    public static void main(String[] args) {
        Stu s=new Stu();
        s.name="john";
        s.rollno=2;
        s.phnno=12345;
        s.address="abc";
        System.out.println(s.name);
        System.out.println(s.rollno);
        s.name="sam";
        s.rollno=2;
        s.phnno=12345;
        s.address="abc";
        System.out.println(s.name);
        System.out.println(s.rollno);
    }
}
