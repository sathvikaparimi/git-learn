abstract public class AbsShape {
    abstract int rectanglearea(int length,int breadtrh);
    abstract int squarearea(int square);
    abstract float circlearea(float radius);
}
class Areas extends AbsShape{
     int length,breadth;
    int rectanglearea(int length,int breadth){
         return length*breadth;
    }
    int squarearea(int side)
    {
        return side*side;
    }
    float circlearea(float radius){
        return  (float) (3.14*radius*radius);
    }
}
class ShapeEx{
    public static void main(String[] args) {
        Areas obj=new Areas();
        /*obj.rectanglearea(4,5);
        obj.squarearea(4);
        obj.circlearea(3);*/
        System.out.println( obj.rectanglearea(4,5));
        System.out.println(obj.squarearea(4));
        System.out.println(  obj.circlearea(3));
    }
}
