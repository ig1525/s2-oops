import java.util.Scanner;

class Person {
    String name;
    String gender;
    String address;
    int age;

    Person(String name, String gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }

 
}

class Employee extends Person {
    int empid;
    String companyName;
    String qualification;
    double salary;

    Employee(String name, String gender, String address, int age, int empid, String companyName, String qualification, double salary) {
        super(name, gender, address, age);
        this.empid = empid;
        this.companyName = companyName;
        this.qualification = qualification;
        this.salary = salary;
    }

  
}

public class Teacher_ extends Employee {
    String subject;
    String department;
    String teacherId;

    Teacher_(String name, String gender, String address, int age, int empid, String companyName, String qualification, double salary, String subject, String department, String teacherId) {
        super(name, gender, address, age, empid, companyName, qualification, salary);
        this.subject = subject;
        this.department = department;
        this.teacherId = teacherId;
    }

    void displayTeacherDetails() {

        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + empid);
        System.out.println("Company Name: " + companyName);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
        System.out.println("Teacher ID: " + teacherId);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of teachers:");
        int num = sc.nextInt();
        Teacher_[] teachers = new Teacher_[num];

        for (int i = 0; i < num; i++) {
            sc.nextLine(); 

            System.out.println("\nEnter details for Teacher " + (i + 1) + ":");

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Gender: ");
            String gender = sc.nextLine();

            System.out.print("Enter Address: ");
            String address = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            System.out.print("Enter Employee ID: ");
            int empid = sc.nextInt();

            sc.nextLine(); 

            System.out.print("Enter Company Name: ");
            String companyName = sc.nextLine();

            System.out.print("Enter Qualification: ");
            String qualification = sc.nextLine();

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();

            sc.nextLine(); 

            System.out.print("Enter Subject: ");
            String subject = sc.nextLine();

            System.out.print("Enter Department: ");
            String department = sc.nextLine();

            System.out.print("Enter Teacher ID: ");
            String teacherId = sc.nextLine();

            teachers[i] = new Teacher_(name, gender, address, age, empid, companyName, qualification, salary, subject, department, teacherId);
        }

        System.out.println("\n*** Information of all Teachers ***");
        for (int i = 0; i < num; i++) {
            System.out.println("\nTeacher " + (i + 1) + " Details:");
            teachers[i].displayTeacherDetails();
            System.out.println("---------------------------");
        }

        sc.close();
    }
}
