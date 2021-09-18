 abstract public class Parent1 {
    void message(){
          System.out.println("This is super class");
    }
}
class child1 extends Parent1{
    void message(){
        System.out.println("This is first subclass");
    }
}
class child2 extends Parent1{
    void message(){
        System.out.println("This is second subclass");
    }
}
class abstarct{
    public static void main(String[] args) {
        child1 objchild1=new child1();
        objchild1.message();
        child2 objchild2=new child2();
        objchild2.message();

    }
}
