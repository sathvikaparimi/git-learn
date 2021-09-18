public class Parent {
   void print()
   {
       System.out.println("This is parent class");
   } 
}
class Child extends Parent
{
    void show()
    {
        System.out.println("This is child class");
    }
}
class Example
{
    public static void main(String[] args) {
        Parent obj1=new Parent();
        Child obj=new Child();
        obj1.print();
        obj.show();
        obj.print();
    }
}
