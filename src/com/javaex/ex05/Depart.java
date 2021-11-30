package com.javaex.ex05;

public class Depart extends Employee{

	 
	//필드
	private  String dep;

	
	//생성자
	public Depart() {}
	public Depart(String name, int salary, String dep) {
		super(name, salary);
		this.dep = dep;
	}
	
	//메소드 g/s
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	
	//메소드 일반
	public void showInformation() {
		System.out.println("이름:"+getName()+" 연봉:"+getSalary()+" 부서 :"+dep);
	}
	
	
	
	

}
