package oopsconcept;

import java.util.Scanner;

public class EmployeesSalary {
 Scanner sc = new Scanner(System.in);
   int id;
   String name, designation;
   float basicSalary,annualSalary,ta;


   void setData (int id,String name,String designation, float basicSalary)
   
   {
	   this.id = id;
	   this.name= name;
	   this.designation=designation;
	   this.basicSalary= basicSalary;
	   
	   annualSalary= basicSalary *12;
	   
	   switch (designation)
	   {
	   case "manager": ta= 2000;
	   break;
	   
	   case "Manager": ta=2000;
	   break;
	   
	   default: ta =1500;
	   
	   
		   
	   }
			   
			   
   }    
   void display()
   {
	   System.out.println(" Employee id: " +id);
	   System.out.println(" Employee name: " +name);
	   System.out.println(" Employee designation: " +designation);
	   System.out.println(" Employee basicSalary: " +basicSalary);
	   System.out.println(" Employee annualSalary: " +annualSalary);
	   System.out.println(" Employee ta: " +ta);
	   
   }
}    