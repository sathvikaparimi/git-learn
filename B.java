class B
{
    int l,b;
    B()
    {
        l=10;
        b=20;
    }
}
class C extends B{
    int h;
    C()
    {
        super();
        h=30;
    }
    int volume()
    {
        return l*b*h;
    }
}
class superdemo
{
    public static void main(String[] args) {
        C c1=new C();
        int r=c1.volume();
        System.out.println("the volume is:"+r);
    }
}