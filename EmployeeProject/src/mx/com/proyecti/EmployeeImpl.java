package mx.com.proyecti;

public class EmployeeImpl {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setId(1);
		employee.setSalary(1000);
		
		Manager manager = new Manager(2, "Pedro", "12343", 3000, "Marketing");
		
		System.out.println("Employee id:" + employee.getId() + ", Salary: " + employee.getSalary());
		
		System.out.println("Manager:" + manager.getName() + ", dept name:" + manager.getDeptName());
		
		System.out.println(manager.getDetails());
		
		Employee employee2 = new Manager(3, "Victor", "33456", 100, "TI");
		
		if(employee2 instanceof Engineer) {
			Manager manager2 = (Manager) employee2;
			System.out.println(manager2.getDetails());
		}

	}

}
