public class CountedItem extends PurchaseItem {
    private int quantity;
    public CountedItem(){
    }
    public CountedItem(int quantity){
        this.quantity=quantity;
    }
    public int getquantity(){
        return quantity;
    }
    public void setquantity(int quantity){
        this.quantity=quantity;
    }
    public double getPrice()
    {
        return quantity*super.getPrice();
    }
    public String toString(){
        return super.toString()+" "+quantity+"units"+getPrice()+"SR";
    }
}
