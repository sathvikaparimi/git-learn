public class Triangle {
    int a=3,b=4,c=5,s;
    void printArea()
    {
        s=(a+b+c)/2;
        System.out.println(Math.sqrt(s*(s-a)*(s-b)*(s-c)));
    }
    void printPerimeter()
    {
        System.out.println(a+b+c);
    }
}
class triex
{
    public static void main(String[] args) {
        Triangle t=new Triangle();
        t.printArea();
        t.printPerimeter();
    }
}
