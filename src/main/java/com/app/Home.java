package com.app;

import com.app.pojo.Employee;

public class Home{
	public static void main(String args[]){
		System.out.println("Employee Details.......");

		Employee employee = new Employee();

		employee.setFirstName("Krishna Rao");
		employee.setLastName("Srirambatla");

		System.out.println(employee.getFirstName()+"   "+employee.getLastName());
	}
}