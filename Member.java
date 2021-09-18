public class Member {
    String name;
    int age;
    int phonenumber;
    String address;
    int salary;
    void printSalary()
    {
       System.out.println(salary);
    }
}
class Employee extends Member
{
   String specialization;
}
class Manager extends Member
{
   String department;

}
class Example1
{
    public static void main(String[] args) {
        Employee obj1=new Employee();
        obj1.name="xyz";
        obj1.age=21;
        obj1.phonenumber=15489654;
        obj1.address="hjl";
        obj1.salary=2000;
        obj1.specialization="xyz";
       Manager obj=new Manager();
       obj.name="abc";
        obj.age=30;
        obj.phonenumber=545466;
        obj.address="hyd";
        obj.salary=4000;
        obj.department="abc";


    }
}