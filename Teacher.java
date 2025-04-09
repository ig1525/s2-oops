import java.util.Scanner;
class Employee{
    int empid;
    String name;
    double salary;
    String address;

    Employee(int no,String na,double sal,String add){
        this.empid=no;
        this.name=na;
        this.salary=sal;
        this.address=add;

    }

}
class Teacher extends Employee{
    String dept;
    String subject;
    Teacher(int no,String na,double sal,String add,String dep,String sub){
        super(no,na,sal,add);
        this.dept=dep;
        this.subject=sub;
    }
    void display(){
        System.out.println("employee id:" +empid);
        System.out.println("name:" +name);
        System.out.println("salary:" +salary);
        System.out.println("address:" +address);
        System.out.println("department:" +dept);
        System.out.println("subject:" +subject);
    }
    public static void main(String[] args){
        System.out.println("\nEnter the no: of employees");
        Scanner sc1=new Scanner(System.in);
        int num=sc1.nextInt();
        Teacher[] arr=new Teacher[num];


    for (int i=0;i<num;i++){
        Scanner sc=new Scanner(System.in);
        System.out.println("\n \n Employee "+(i+1)+":");
        System.out.println("\n enter employee id:");
        int empid=sc.nextInt();
        System.out.println("\n enter employee name:");
        String name=sc.next();
        System.out.println("\n enter employee salary:");
        double salary=sc.nextDouble();
        System.out.println("\n enter employee address:");
        String address=sc.next();
        System.out.println("\n enter employee department:");
        String dept=sc.next();
        System.out.println("\n enter employee subject:");
        String subject=sc.next();
        arr[i]=new Teacher(empid,name,salary,address,dept,subject);

    }
    System.out.println("\n *** informations of all the employees****** ");
    for(int i=0;i<num;i++){
        System.out.println("\n \n Employee "+(i+1)+":");
        arr[i].display();
    }
    sc1.close();
    }
}