package mx.com.proyecti.api;

import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mx.com.proyecti.Employee;
import mx.com.proyecti.EmployeeSOAPProxy;

@RestController
@EnableAutoConfiguration
public class EmployeeApiImpl {

	//La generación de nuestro web service client utiliza la librería AXIS
	EmployeeSOAPProxy emp = new EmployeeSOAPProxy();
	
	//La anotación RequestMapping utiliza la operación GET
	//hhp://localhost/8090/getAllEmployees
	@RequestMapping("/getAllEmployees")
	public Employee[] getAllEmployees() {
		try {
			return emp.readAll();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	@RequestMapping("/createEmployee")
	public Integer createEmployee(@RequestParam String firstName,
					@RequestParam String lastName,
					@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date birthdate,
					@RequestParam double salary
			) {
		// Se inicializa un objeto de tipo Calendar
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(birthdate);
		try {
			return emp.create(firstName, lastName, calendar, salary);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	@RequestMapping("/getEmployee")
	Employee getEmployee(@RequestParam(value="id") int id) {
		try {
			return emp.read(id);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	@RequestMapping("/updateEmployee")
	public void updateEmployee(@RequestParam(value="id") int id,
			@RequestParam String firstName,
			@RequestParam String lastName,
			@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date birthdate,
			@RequestParam double salary
			) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(birthdate);
		try {
			emp.update(id, firstName, lastName, calendar, salary);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestMapping("/deleteEmployee")
	public boolean deleteEmployee(@RequestParam(value="id") int id) {
		try {
			emp.delete(id);
			return true;
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	public static void main(String[] args) {
		SpringApplication.run(EmployeeApiImpl.class, args);

	}

}
