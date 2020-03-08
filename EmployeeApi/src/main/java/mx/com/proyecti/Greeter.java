package mx.com.proyecti;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

//Indicarle al API JAX-WS que nuestra clase va a ser utilizada como un servicio web SAOP
@WebService
public class Greeter {
	public final String worldGreeting = "Hello World";
	
	public Greeter() {}
	
	//Con @WebMethod le indico a JAX-WS que mi método va a ser una operación pública dentro de mi
	//WS SOAP
	@WebMethod
	public String greetWorld(@WebParam(name="nombre") String name) {
		return worldGreeting + " " + name;
	}
}
