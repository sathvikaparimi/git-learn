public class Area {
    int length;
    int breadth;
    int side;
   void print(int length,int breadth)
   {
      this.length=length;
      this.breadth=breadth;
      System.out.println(length*breadth);
   }
   void print(int side)
   {
      this.side=side;
      System.out.println(side*side);
   }
   public static void main(String[] args) {
       Area a=new Area();
       a.print(4,5);
       a.print(4);
   }
    
}
