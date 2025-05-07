import java.util.Scanner;

class Employee {
    int emp_id;
    int emp_name;
    int emp_age

    Employee( int id,String name,int age,String address) {
    a_num=a;
	title=t;
	author=au;
    	edition=edi;
    	publisher=pub;
    }


    void display() {
        System.out.println("\nBOOK INFORMATION");
        System.out.println("\n**********Accession number: " + a_num+  "book details********");
        System.out.println("Title: " + title);

        System.out.println("Author: " + author);
        System.out.println("Edition: " + edition);
        System.out.println("Publisher: " + publisher);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of books: ");
        int num = sc.nextInt();

        book[] arr = new book[num];

        for (int i = 0; i < num; i++) {
            System.out.println("\nBOOK " + (i + 1) + ":");

            System.out.print("Accession number: ");
            int a_num= sc.nextInt();

            System.out.print("Title: ");
            String title= sc.next();

            System.out.print("Author: ");
            String author = sc.next();
	    
	    System.out.print("Edition: ");
            String edition = sc.next();
            System.out.print("publisher: ");
            String publisher = sc.next();
            

            arr[i] = new book(a_num,title,author,edition,publisher);
        }

        System.out.println("\n***** SEARCH A BOOK*****");
        System.out.print("Enter it's accession number: ");
        int ac_num= sc.nextInt();
        for (int i = 0; i < num; i++) {
            if(ac_num == arr[i].a_num){
                arr[i].display();
            }
        }

        sc.close();
    }
}


