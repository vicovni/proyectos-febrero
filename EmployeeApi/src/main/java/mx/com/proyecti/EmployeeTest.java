package mx.com.proyecti;

import java.util.Date;
import java.util.List;

import mx.com.proyecti.entity.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		EmployeeManager manager = new EmployeeManager();
		manager.setup();
		int id = manager.create("Juan", "Pérez", new Date(), 200);
		System.out.println("El id del empleado es:" +id);
		Employee emp = manager.read(id);
		List<Employee> listaEmpleado = manager.readAll();
		System.out.println("número de empleados: " + listaEmpleado.size());
		System.out.println(emp.getFirstName() + " " + emp.getLastName());
		manager.exit();

	}
	
	//Actividades
	//Modificar el método create() para devolver el id del elemento creado
	//Crear método readAll() Devolver una lista de todos los empleados
	//Probar las 4 operaciones CRUD en EmployeeTest.java
	//Registrarse en https://www.hackerrank.com/, 30 days of code, Day 10

}
