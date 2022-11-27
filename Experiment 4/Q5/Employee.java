/*Design a class employee of an organization. An employee has a name, empid, and salary. 
Write the default constructor, a constructor with parameters (name, empid, and salary) and methods to return name and salary. 
Also write a method increaseSalary that raises the employee’s salary by a certain user specified percentage. 
Derive a subclass Manager from employee. Add an instance variable named department to the manager class. 
Supply a test program that uses theses classes and methods. */

import java.util.*;
class Employees{
	String name;//employee properties
	int empid;
	int salary;
	Employees(){
	}
	Employees(String n,int e,int s){
		name=n;
		empid=e;
		salary=s;
	}
	String names(){
		return name;
	}
	int salaries(){
		return salary;
	}
	double increaseSalary(double per_rate){
		double in=(salary*(per_rate/100));
		double s=salary+in;
		return s;
	}
}
class Employee extends Employees{
	public String department="d";
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in); //obj and method calling
		System.out.println("enter the name");
		String n=sc.next();
		System.out.println("enter the employee id");
		int e=sc.nextInt();
		System.out.println("enter the salary");
		int s=sc.nextInt();
		System.out.println("enter the percentage_rate increaced in salary");
		double p=sc.nextDouble();
		Employees e1=new Employees(n,e,s);
		System.out.println(e1.names());
		System.out.println(e1.salaries());
		System.out.println(e1.increaseSalary(p));
        sc.close();
	}
    
}