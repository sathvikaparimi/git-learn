public class Print {
    int i;
    void printNum(){
        System.out.println(i);    
    }
}
class subPrint extends Print{
    int j;
    void printNum(){
        System.out.println(j);
    }
}
class printEx{
    public static void main(String[] args) {
        subPrint s=new subPrint();
        s.i=10;
        s.j=20;
        s.j=s.i;
        s.printNum();
    }
}
