package Inheritance;
// create a parent class person having common attribute
// Inherit person to employee class 

//employee class can access all variables and member function that are not private 
public class Employee  extends Person
{
	
	int empid;
	int salary;
	public void input()
	{
		name="amit";
		age=22;
		address="noida";
		empid=223;
		salary=20000;
	}
	void display()
	{    
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
		System.out.println(empid);
		System.out.println(salary);
		
	}
	public static void main(String args[])
	{
		Employee e= new Employee();
		e.input();
		e.display();
		e.message();
	}
	
}