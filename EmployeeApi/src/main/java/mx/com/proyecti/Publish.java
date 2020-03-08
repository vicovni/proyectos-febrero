package mx.com.proyecti;

import javax.xml.ws.Endpoint;

public class Publish {

	public static void main(String[] args) {

		//Publicar mi servicio web SOAP a través de un endpoint
		Endpoint.publish("http://localhost:8081/employeeapi/webservice", new EmployeeSOAP());
		System.out.println("Server started at 8081");
	}

}
