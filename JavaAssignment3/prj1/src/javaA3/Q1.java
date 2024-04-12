package javaA3;

 class Employee {
	
	public double salary;
	public double hr;

	public void getInfo(double salary,double hr) {
		this.salary=salary;
		this.hr=hr;
	}
	
	public void AddSal() {
		if(salary<500) {
			salary+=10;
		}
	}
	public void AddWork() {
		if(hr>6) {
			salary+=5;
		}
	}
	public void display() {
		System.out.println("Emplyee Salary :\t"+salary);
		System.out.println("Employee Working Hrs :\t"+hr);
	}
 }

	
public class Q1 {

	public static void main(String[] args) {
        Employee e=new Employee();
        e.getInfo(600, 8);
        e.AddSal();
        e.AddWork();
        e.display();
	}
	

}