package mx.com.proyecti;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloFood {

	public static void main(String[] args) {

		ApplicationContext appContext = new FileSystemXmlApplicationContext("appContext.xml");
		
		Fruit fruit = appContext.getBean("fruitWithAttributes", Fruit.class);
		Vegetable vegetable = (Vegetable) appContext.getBean("vegetableWithListAndMap");
		
		System.out.println(fruit.talkAboutMe());
		System.out.println(vegetable.talkAboutMe());

	}
	
	/*
	 * Completar las operaciones CRUD del servicio web en EmployeeApi->EmployeeSOAP
	 * 2.	Cambiar la Ruta default de appContext.xml
	 * Configuración XML con Spring
	 * 30 days of code, day 15
	 * */

}
