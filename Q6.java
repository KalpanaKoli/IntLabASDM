package AssignmentProblems;
/* Write a program by creating an 'Employee' class having the following methods and print the final salary.
1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
2 - 'AddSal()' which adds 10000 to salary of the employee if it is less than 50000.
3 - 'AddWork()' which adds 5000 to salary of employee if the number of hours of work per day is more than 6 hours.
*/

class Employee2
{
	int salary,hour;

	void getInfo(int s,int h)
	
	{ salary= s;
	  hour=h;
	}
	void AddSal()
	{
		if(salary<50000)	salary=salary+10000;
	}
	
	void addWork()	{	  if(hour>6)	salary= salary+5000;	}
	
	void display()
	{		System.out.println("salary="+ salary +"  hour="+ hour );	}
}

public class Q6 {

	public static void main(String[] args) {
		Employee2 e= new Employee2();
		e.getInfo(40000, 7);
		e.AddSal();
		e.addWork();
		e.display();
		

	}

}
