public class PrintNumber {
    void printn(int a)
    {
        System.out.println(a);   
    }
     void printn(float a)
     {
         System.out.println(a);   
    }
    void printn(double a)
    {
        System.out.println(a);   
     }
     public static void main(String[] args) {
         PrintNumber n=new PrintNumber();
         n.printn(10);
         n.printn(100.0);
         n.printn(100.05);
     }
}
