public class Integer {
    void print(int i,char c){
         System.out.println(i);
         System.out.println(c);
    }
    void print(char c,int i){
        System.out.println(c);
        System.out.println(i);
    }
public static void main(String[] args) {
    Integer i=new Integer();
    i.print(10,'a');
    i.print('b',20);

}
}
