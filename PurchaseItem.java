import java.util.Scanner;
public class Sampp{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("weighted item:");
        System.out.println("enter name,unitprice,weight:");
        WeightedItem w=new WeightedItem();
        w.setData(sc.next(),sc.nextDouble());
        w.setweight(sc.nextDouble());
        System.out.println(""+w.toString());
        System.out.println("Counted item:");
        System.out.println("enter name,unitprice,quantity");
        CountedItem c=new CountedItem();
        c.setData(sc.next(),sc.nextDouble());
        c.setquantity(sc.nextInt());
        System.out.println(""+c.toString());
    }
}
public class PurchaseItem {
    private String name;
    private double unitPrice;
    PurchaseItem()
    {
        this.name="no name";
        this.unitPrice=0;
    }
    public PurchaseItem(String name,double unitPrice)
    {
       this.name=name;
       this.unitPrice=unitPrice;
    }
     public void getData()
    {
        System.out.println("name:"+name);
        System.out.println("unitPrice:"+unitPrice);
    }
    public void setData(String name,double unitPrice)
    {
       this.name=name;
       this.unitPrice=unitPrice;
    }
    public double getPrice()
    {
        return unitPrice;
    }
}
