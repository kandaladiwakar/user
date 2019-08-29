package com.app.employee;

import java.util.TreeSet;

public class Tset {
	
	public static void main(String[] args) {
		
		Employee employee1=new Employee(20,"bala",89.09,"developer");
		Employee employee2=new Employee(89,"tagoor",67.98,"webdesigener");
		Employee employee3=new Employee(23,"ravi",234.4,"qualityanalist");
		Employee employee4=new Employee(12,"chanti",345.54,"teamlead");
		
		TreeSet<Employee> treeSet=new TreeSet<>();
		treeSet.add(employee1);
		treeSet.add(employee2);
		treeSet.add(employee3);
		treeSet.add(employee4);
		System.out.println(treeSet);
		
		
	}

}
