package com.core;

import java.time.LocalDate;

public class Employee {
	private  String  Id;
	private String name;
	private double sal;
	private String dept;
	private String reptauth;
	private String design;
	private LocalDate joiningdate;
	
	public Employee() {
		System.out.println("Inside default constructor");
	}
	public Employee(String id,String name, double sal, String dept, String design, LocalDate joiningdate) {
		super();
		this.setId(id);
		this.setName(name);
		this.setSal(sal);
		this.setDept(dept);
		this.design = design;
		this.joiningdate = joiningdate;
	}

	public  String getId() {
		return Id;
	}

	public  String setId(String id) {
		int idint=Integer.parseInt(id);
		if(id.length()==5 && idint>0 )
		{
		Id ="ID"+id;
		return "operation sucessfull";
		}
		return "id should be 5 digit long";
			
	}

	public String getName() {
		return name;
	}

	public String setName(String name) {
		if(name!=null && name.length()>0) {
		this.name = name;
		return "operation sucessfull";
		}
		return "name not be null";
	}

	public double getSal() {
		
		return sal;
	}

	public String setSal(double sal) {
		if(sal>0) {
		this.sal = sal;
		return "operation sucessfull";
		}
		return "sal not be negative";
	}

	public String getDept() {
		return dept;
	}

	public String setDept(String dept) {
		if(dept!=null && dept.length()>0) {
		this.dept = dept;
		return "operation sucessfull";
		}
		return "dept not be null";
	}

	public String getReptauth() {
		return reptauth;
	}

	public void setReptauth(String reptauth) {
		this.reptauth = reptauth;
	}

	public String getDesign() {
		return design;
	}

	public void setDesign(String design) {
		this.design = design;
	}

	public LocalDate getJoiningdate() {
		return joiningdate;
	}

	public void setJoiningdate(LocalDate joiningdate) {
		this.joiningdate = joiningdate;
	}
	public void addEmp() {
		
	}
	public  double calNetSal()
	{	
		return sal+1200;
	}
	
	
}
