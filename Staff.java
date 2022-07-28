package lab2;

public class Staff extends Person implements itstaff{
	 String company,empid,designation;
	    int salary;

	public Staff(String name, String add, String email, long pn, String company, String empid, String designation) {
        super(name, add, email, pn);
        this.company = company;
        this.empid = empid;
        this.designation = designation;
    }

	@Override
    public void salary() {
        this.salary = 700000;
        System.out.println("Name : "+ this.name);
        System.out.println("Address : "+ this.add);
        System.out.println("Phone number : "+ this.pn);
        System.out.println("Email : "+this.email);
        System.out.println("Company : "+ this.company);
        System.out.println("Employee ID : "+ this.empid);
        System.out.println("Designation : "+ this.designation);
        System.out.println("Salary per annum : "+ this.salary);
    }


}

