public class Parents {
    public static void print(){
        System.out.println("parent");
    }
}
class Childs extends Parents{
     public static void print(){
        System.out.println("child");
    }
}
class pC{
    public static void main(String[] args) {
        Parents.print();
        Childs.print();
}
}
