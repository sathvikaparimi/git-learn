public class counter{
    int i,counter=0;
    void increment()
    {
        for(i=0;i<1;i++)
        {
            counter=counter+3;
            System.out.println("i="+counter);
        }
    }
}
class subcounter extends counter{
    public static void main(String args[])
    {
       subcounter obj=new subcounter();
        obj.increment();
       
    }
}
