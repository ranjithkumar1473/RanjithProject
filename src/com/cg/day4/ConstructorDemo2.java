package com.cg.day4;

class Employee {

	static int eid;
String name;
double salary;


public Employee() {
	System.out.println("zero-args constructor");

}

public Employee(int eid, String name,double salary) {
	super();
	this.eid = eid;
	this.name = name;
    this.salary=salary;
	System.out.println("parameterized constructor");
}

public Employee(String name, double salary) {
	super();
	this.name = name;
	this.salary = salary;
}

@Override
public String toString() {
	return "Employee [eid="+ eid +", name=" + name + ", salary=" + salary + "]";
}



}

public class ConstructorDemo2 {
	
 public static void main(String[] args) {
	 
	 Employee emp1= new Employee();
	 emp1.eid=110;
		emp1.name = "Ajeet";
		emp1.salary = 10.8;
		//System.out.println(emp1.eid + " " + emp1.name + " " + emp1.salary);
		System.out.println(emp1.toString());

	 Employee emp2= new Employee();
	 emp2.eid=120;
	emp2.name = "Ajeet";
	emp2.salary = 10.6;
	//System.out.println(emp2.eid + " " + emp2.name + " " + emp2.salary);
	System.out.println(emp2.toString());

	Employee emp3 = new Employee(103, "Sonu", 12.75);
	//System.out.println(emp3.eid + " " + emp3.name + " " + emp3.salary);
	System.out.println(emp3.toString());
}
}
