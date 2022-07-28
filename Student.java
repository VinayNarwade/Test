package lab2;

public class Student extends Person implements itstudent{
	 String usn,branch;
	    int fees;
	    public Student(String name, String add, String email, long pn, String usn) {
	        super(name, add, email, pn);
	        this.usn = usn;
	    }
	    @Override
	    public void fees(int n) {
	        if(n==1) {
	            this.fees=600000;
	            this.branch="MCA";
	        }
	        else if(n==2) {
	            this.fees=1000000;
	            this.branch="MTECH";
	        }
	        else if(n==3) {
	            this.fees=1600000;
	            this.branch="BE";
	        }
	        else {
	            this.fees=600000;
	            this.branch="MCA";
	        }
	        System.out.println("Name : "+ this.name);
	        System.out.println("Address : "+ this.add);
	        System.out.println("Phone number : "+ this.pn);
	        System.out.println("Email : "+ this.email);
	        System.out.println("Employee ID : "+ this.usn);
	        System.out.println("Designation : "+ this.branch);
	        System.out.println("Salary per annum : "+ this.fees);
	    }
	}

