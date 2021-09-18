 class Apple {
    int number_of_items=5;
   void show()
   {
    System.out.println( number_of_items);
   }
}
 class Banana extends Apple{
    int number_of_items=10;
    Banana(){}
    void show()
    {
       System.out.println( number_of_items);
    }
}
class fruits
{
    public static void main(String[] args) {
        Apple obj2=new Apple();
        obj2.show();
        Banana obj1=new Banana();
        obj1.show();
    }
}