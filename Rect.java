public class Rect {
    int length;
    int breadth;
    Rect(int l,int b){
        this.length=l;
        this.breadth=b;
    }
    int area(){
      return length*breadth;
    }
}
class recex{
    public static void main(String[] args) {
      Rect obj=new Rect(4,5);
      Rect obj1=new Rect(5,8);
      System.out.println(obj.area());
      System.out.print(obj1.area());  
    }
}
