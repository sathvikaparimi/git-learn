public class Shapes {
    void print(){
        System.out.println("This is shape");
    }
}
class Rec extends Shapes{
    void prints()
    {
        System.out.println("This is rectangular shape");
    }
}
class Cir extends Shapes{
    void print()
    {
        System.out.println("This is circular shape");
    }
}
class Squ extends Rec{
    void printed()
    {
        System.out.println("square is rectangle");
    }
}
class Exp
{
    public static void main(String[] args) {
    Squ s=new Squ();
    s.print();
    s.printed();
    s.prints();
    }

}