abstract public class Marks {
    abstract  float getPercentage();
}
class P extends Marks{
    float sub1,sub2,sub3;
    P(float s1,float s2,float s3){
       sub1=s1;
       sub2=s2;
       sub3=s3;
    }
    float getPercentage(){
       return (sub1+sub2+sub3)/300*100;
    }
}
class Q extends Marks{
    float sub1,sub2,sub3,sub4;
    Q(float s1,float s2,float s3,float s4){
        sub1=s1;
        sub2=s2;
        sub3=s3;
        sub4=s4;
}
    float getPercentage(){
        return (sub1+sub2+sub3+sub4)/400*100;
        
    }
}
class abstractexamp{
    public static void main(String[] args) {
        P p=new P(60,70,80);
        Q q=new Q(90,80,80,90);
        p.getPercentage();
        q.getPercentage();
        System.out.println( p.getPercentage());
        System.out.println( q.getPercentage());
        }
}
