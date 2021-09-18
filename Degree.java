public class Degree {
    void getDegree()
    {
        System.out.println("I got a degree");
    }
}
class Undergraduate extends Degree{
    void print()
    {
        System.out.println("I am an undergraduate");    
    }
}
class Postgraduate extends Degree{
    void print(){
        System.out.println("I am an postgraduate");
    }
}
class example{
    public static void main(String[] args) {
        Postgraduate p=new Postgraduate();
        p.getDegree();
        p.print();
        Undergraduate u=new Undergraduate();
        u.print();
    }
}
