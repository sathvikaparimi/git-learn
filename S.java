class S {
    void display()
    {
        System.out.println("hi");
    }
    void display(int a)
    {
        System.out.println(+a);
    }
    void display(int a ,int b)
    {
        System.out.println(+a  +b);
    }

     
    }
   
    public static void main(String args[])
    {
         S obj=new S();
    obj.display();
    obj.display(10);
    obj.display(100, 688);
    
    }
}
