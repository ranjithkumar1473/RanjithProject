package com.cg.day4;


class Employee1 {

	int eid;
	String name;
	double salary;

	Employee1() {
		System.out.println("Employee constructor");
	}
}

public class ConstructorDemo {

	public static void main(String[] args) {

		Employee1 emp = new Employee1();
		emp.eid = 101;
		emp.name = "Jeevan";
		emp.salary = 10.5;
		System.out.println(emp.eid + " " + emp.name + " " + emp.salary);

		Employee1 emp2 = new Employee1();
		emp2.eid = 102;
		emp2.name = "Ajeet";
		emp2.salary = 10.6;
		System.out.println(emp2.eid + " " + emp2.name + " " + emp2.salary);
	}
}
