public class A {
    int i=10,j=20;
    A(){
        System.out.println("in parent class constructor");
    }
    void show()
    {
        System.out.println(i);
        System.out.println(j);
    }
}
class  Bs extends A
{
    int k=30;
    Bs(){
        System.out.println("in child class constructor");
    }
    void show()
    {
        System.out.println(k);
    }
}
class Inheritance
{
    public static void main(String args[]) {
    Bs obj=new Bs();
    obj.show();
    }
}