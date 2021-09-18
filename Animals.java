abstract public class Animals {
    abstract void cats();
    abstract void dogs();
}
class Cats extends Animals{
    void cats(){
        System.out.println("Cats Meow");
        }
 
}
class Dogs extends Animals{
    void dogs(){
        System.out.println("Dogs Bark");
    }
}
class AnimalEx{
    public static void main(String[] args) {
        Cats c=new Cats();
        c.cats();
        Dogs d=new Dogs();
        d.dogs();
    }
}
