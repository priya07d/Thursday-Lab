package oopsconcept;

import java.util.Scanner;


public class EmployeeSalary {
  public static void main(String[] args)  {
	  
	  int id;
	  String name,designation;
	  float salary = 0;
	  Scanner sc = new Scanner(System.in);
	  EmployeesSalary emp= new EmployeesSalary();
	  System.out.print(" Enter employee id: ");
	  id=sc.nextInt();
	  sc.nextLine();
	  System.out.print(" Enter employee name: ");
	  name= sc.nextLine();
	  System.out.print(" Enter employee designation: ");
      designation=sc.nextLine();
      System.out.print(" Enter employee salary: ");
      salary= sc.nextFloat();
      System.out.println("===========================");
      emp.setData(id, name, designation, salary);
      
      emp.display();
      sc.close();
  
  
}
}