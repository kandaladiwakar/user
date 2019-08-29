package com.app.employee;

public class Employee implements Comparable{
	
	private int empId;
	private String empName;
	private double empSal;
	private String empDesignation;
	
	public Employee(int empId, String empName, double empSal, String empDesignation) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empDesignation = empDesignation;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", empDesignation="
				+ empDesignation + "]";
	}

	@Override
	
	public int compareTo(Object arg0) {
		int empId1=this.empId;
		Employee employee=(Employee)arg0;
		int empId2=employee.empId;
		if(empId1<empId2) {
			return -1;
		}else if(empId1>empId2) {
			return 1;
		}else {
		return 0;
		}
	}
}
