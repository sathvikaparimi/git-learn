 abstract public class AbsEx {
    AbsEx(){
        System.out.println("This is constructor of abstract class");
    }
    abstract void a_method();
     void abs_method(){
        System.out.println("This is normal method of abstract class");
     }
}
class AbsEx1 extends AbsEx{
    void a_method(){
        System.out.println("This is abstract method");
    }
}
class AbsExamp{
    public static void main(String[] args) {
        AbsEx1  obj=new AbsEx1();
        obj.a_method();
        obj.abs_method(); 
    }
}
