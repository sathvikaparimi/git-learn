 abstract public class Bank {
     abstract void getBalance();
    
}
class BankAA extends Bank{
      void getBalance()
      {
          System.out.println(100);
      }
    
}
class BankBB extends Bank{
    void getBalance()
      {
          System.out.println(150);
      }
    
}
class BankCC extends Bank{
    void getBalance()
      {
          System.out.println(200);
      }
    
}
class Bankex{
    public static void main(String[] args) {
        BankCC obj1=new BankCC();
        obj1.getBalance();
        BankBB obj2=new BankBB();
        obj2.getBalance();
        BankAA obj3=new BankAA();
        obj3.getBalance();
    }
}

 
 
 