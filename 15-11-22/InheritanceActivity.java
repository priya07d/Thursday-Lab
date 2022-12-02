package oopsconcept;

class Employeee
{
	   long employeeId,employeePhone;
	   String employeeName, employeeAddress;
	   double basicSalary,SpecialAllowance=250.80,HRA=1000.50, transportAllowance;
	   Employeee(long id,String name, String address,long phone)
	   {
		   this.employeeId=id;
		   this.employeeName=name;
		   this.employeeAddress=address;
		   this.employeePhone=phone;
	   }  
	   
	   public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public long getEmployeePhone() {
		return employeePhone;
	}

	public void setEmployeePhone(long employeePhone) {
		this.employeePhone = employeePhone;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	void calculateSalary()
	   {
		   double salary=basicSalary+(basicSalary*SpecialAllowance/100)+(basicSalary*HRA/100);
		    System.out.println("Calculated Net salary: "+salary);
		    
	   }
	double calculateTransportAllowance()
	{
		return transportAllowance=10/100*basicSalary;
	}
	
}
class  Manager extends Employeee
{
	Manager(long id, String name, String address, long phone, double salary)
	{
		super(id, name, address, phone);
		this.basicSalary=salary;
	}
	double calculateTransportAllowance()
	{
		return transportAllowance=15/100*basicSalary;
	}
	
}
	class Trainee extends Employeee
	{
		Trainee(long id,String name, String address, long phone,double salary)
		{
			super(id,name,address,phone);
			this.basicSalary = salary;
		}
	}



public class InheritanceActivity {

	public static void main(String[] args) {
	
		System.out.println("======Manager=======");
		Manager manager= new Manager(123456,"priya","bbsr india",235667l,65000d);
		System.out.println("Id: "+manager.getEmployeeId());
		System.out.println("Name: "+manager.getEmployeeName());
		System.out.println("Address: "+manager.getEmployeeAddress());
		System.out.println("Phone: "+manager.getEmployeePhone());
		System.out.println("BasicSalary: "+manager.getBasicSalary());
		manager.calculateSalary();
		
		System.out.println("======Trainee=======");
		Trainee trainee= new Trainee(123456,"peter","bbsr india",235668l,45000d);
		System.out.println("Id: "+trainee.getEmployeeId());
		System.out.println("Name: "+trainee.getEmployeeName());
		System.out.println("Address: "+trainee.getEmployeeAddress());
		System.out.println("Phone: "+trainee.getEmployeePhone());
		System.out.println("BasicSalary: "+trainee.getBasicSalary());
		trainee.calculateSalary();


	}

}
