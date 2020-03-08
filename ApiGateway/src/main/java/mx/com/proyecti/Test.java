package mx.com.proyecti;

import java.rmi.RemoteException;

public class Test {

	public static void main(String[] args) {
		EmployeeSOAPProxy proxy = new EmployeeSOAPProxy();
		
		try {
			Employee[] employee = proxy.readAll();
			System.out.println(employee[1].getFirstName() + " " + employee[1].getLastName());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
