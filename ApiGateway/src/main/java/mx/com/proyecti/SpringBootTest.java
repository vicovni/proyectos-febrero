package mx.com.proyecti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Mi clase a a definir operaciones para ser publicadas como un Servicio Web RESTful
@RestController
//Configurar de forma automática una aplicación stand-alone con Spring Boot
@EnableAutoConfiguration
public class SpringBootTest {

	@RequestMapping("/")
	String home() {
		return "hello world!";
	}
	
	public static void main(String[] args) {

		SpringApplication.run(SpringBootTest.class, args);

	}

}
