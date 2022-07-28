package lab2;
import java.util.Scanner;

public class lab2a {

	public static void main(String[] args){
        String name,usn,email,add;
        int n,ch;
        long pn;
        while(true) {
        	Scanner sc = new Scanner(System.in);
            System.out.println("Enter the name");
            name = sc.next();
            System.out.println("Enter the address");
            add = sc.next();
            System.out.println("Enter the email");
            email = sc.next();
            System.out.println("Enter the ph number");
            pn = sc.nextLong();
            System.out.println("1: if you are a staff");
            System.out.println("2: if your are a student");
            System.out.println("Enter your choice");
            n = Integer.parseInt(sc.next());
            if(n==1) {
                System.out.println("Enter the campany");
                String company = sc.next();
                System.out.println("Enter the empid");
                String empid= sc.next();
                System.out.println("Enter the designation");
                String designation = sc.next();
                itstaff staff = new Staff(name,add,email,pn,company,empid,designation);
                staff.salary();
            }
            else {
                System.out.println("Enter the USN");
                usn = sc.next();
                itstudent student = new Student(name,add,email,pn,usn);
                System.out.println("Enter the branch");
                System.out.println("1: for MCA");
                System.out.println("2: for MTECH");
                System.out.println("3: for BE");
                System.out.println("Enter your choice");
                n = Integer.parseInt(sc.next());
                student.fees(n);
            }
            System.out.println("Enter 1 to add one more");
            System.out.println("Enter 2 to Exit");
            System.out.println("Enter your choice");
            ch = Integer.parseInt(sc.next());
            if(ch==2)
                break;
        }
    }

}
