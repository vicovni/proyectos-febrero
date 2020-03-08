package mx.com.proyecti;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import mx.com.proyecti.entity.Employee;

public class EmployeeManager {
	private SessionFactory sessionFactory;
	
	//Leer el archivo de configuraci�n hibernate.cfg.xml
	public void setup() {
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
				.configure()
				.build();
		
		//Inicializamos en base al archivo de configuraci�n, mi objeto  sessionFactory
		sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
	}
	
	//Cerrar la conexi�n del objeto sessionFactory
	public void exit() {
		sessionFactory.close();
	}
	
	public int create(
			String firstName, 
			String lastName,
			Date birthdate,
			double salary) {
		//Creamos un objeto de tipo Employee y lo inicializamos
		//con los datos de entrada del m�todo create()
		Employee employee = new Employee();
		employee.setFirstName(firstName);
		employee.setLastName(lastName);
		employee.setBirthdate(birthdate);
		employee.setSalary(salary);
		
		//Crear un objeto session enbase a nuestro objeto sessionFactory
		//sessionFactory: Se crea �nicamente al inicio
		//session: Se crea cada que ejecutemos una instrucci�n sobre
			//la BD, y termina
		Session session = sessionFactory.openSession();
		//Abrir una transacci�n
		session.beginTransaction();
		//Guarda la entidad Employee en DB
		int id = (Integer) session.save(employee);
		//En caso de que todo est� OK, se ejecuta el commit
		session.getTransaction().commit();
		//Cerramos nuestra sesi�n
		session.close();
		
		return id;
	}
	
	public Employee read(int id) {
		Session session = sessionFactory.openSession();
		//Mediante la instrucci�n get, vamos a indicarle el tipo de dato de retorno, y el id del registro
		//a buscar
		Employee employee = session.get(Employee.class, id);
		session.close();
		return employee;
	}
	
	public void update(
			int id, 
			String firstName, 
			String lastName,
			Date birthdate,
			double salary) {
		
		Session session = sessionFactory.openSession();
		Employee employee = new Employee();
		employee.setId(id);
		employee.setFirstName(firstName);
		employee.setLastName(lastName);
		employee.setSalary(salary);
		employee.setBirthdate(birthdate);
		//Abrimos una nueva transacci�n
		session.beginTransaction();
		//Actualiza el empleado, lo busca en base a su id
		session.update(employee);
		//Confirmamos la operaci�n mediante commit
		session.getTransaction().commit();
		//Cerramos la sesi�n
		session.close();
	}
	
	public void delete(int id) {
		Employee employee = new Employee();
		employee.setId(id);
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		//Borramos el registro que tenga el id de entrada del m�todo
		session.delete(employee);
		
		session.getTransaction().commit();
		session.close();
	}
	
	public List<Employee> readAll() {
		Session session = sessionFactory.openSession();
		List<Employee> empleados;
		empleados = session.createQuery("SELECT a FROM Employee a", Employee.class).getResultList();
		session.close();
		return empleados;
	}
}
