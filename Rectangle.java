public class Rectangle {
    int length;
    int breadth;
    Rectangle(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    void area()
    {
     System.out.println(length*breadth);
    }
    void perimeter()
    {
     System.out.println(2*(length*breadth));
    }
}
class Square extends Rectangle{
    int side;
    public Square (int side){
        super(side,side);
    }
}
class Ans
{
    public static void main(String[] args) {
        Rectangle r=new Rectangle(4, 5);
        r.area();
        r.perimeter();
        Square s=new Square(4);
        s.area();
        s.perimeter();
        Square[] a=new Square[10];
        int k=5;
        for(int i=0;i<10;i++)
        {
            a[i]=new Square(k);
            k++;
        }
        for(int i=0;i<10;i++)
        {
            a[i].area();
            a[i].perimeter();
        }
    }
}