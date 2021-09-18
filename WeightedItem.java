public class WeightedItem extends PurchaseItem{
            private double weight;
            public WeightedItem(){
            }
            public WeightedItem(double weight ){
                this.weight=weight;
            }
            public double getweight()
            {
                return weight;
            }
            public void setweight(double weight){
                this.weight=weight;
            }
            public double getprice()
            {
                return weight*super.getPrice();
            }
            public String toString()
            {
                return super.toString()+" "+weight+"kg"+getPrice()+"SR";
            }

        }
    

