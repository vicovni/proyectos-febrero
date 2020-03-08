/**
 * EmployeeSOAP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.proyecti;

public interface EmployeeSOAP extends java.rmi.Remote {
    public void update(int id, java.lang.String firstname, java.lang.String lastname, java.util.Calendar birthdate, double salary) throws java.rmi.RemoteException;
    public void delete(int id) throws java.rmi.RemoteException;
    public mx.com.proyecti.Employee read(int id) throws java.rmi.RemoteException;
    public int create(java.lang.String firstname, java.lang.String lastname, java.util.Calendar birthdate, double salary) throws java.rmi.RemoteException;
    public mx.com.proyecti.Employee[] readAll() throws java.rmi.RemoteException;
}
