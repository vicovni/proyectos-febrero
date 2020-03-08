package mx.com.proyecti;

//POJO: Poor Old Java Object
public class Employee {
	private int id;
	private String name;
	private String ssn;
	private double salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public Employee(int id, String name, String ssn, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.ssn = ssn;
		this.salary = salary;
	}
	
	public String getDetails() {
		return "ID: " + id + ", Name:" + name;
	}
	
	

}
