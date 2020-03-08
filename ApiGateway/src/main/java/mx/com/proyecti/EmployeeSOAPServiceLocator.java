/**
 * EmployeeSOAPServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.proyecti;

public class EmployeeSOAPServiceLocator extends org.apache.axis.client.Service implements mx.com.proyecti.EmployeeSOAPService {

    public EmployeeSOAPServiceLocator() {
    }


    public EmployeeSOAPServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EmployeeSOAPServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for EmployeeSOAPPort
    private java.lang.String EmployeeSOAPPort_address = "http://localhost:8081/employeeapi/webservice";

    public java.lang.String getEmployeeSOAPPortAddress() {
        return EmployeeSOAPPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EmployeeSOAPPortWSDDServiceName = "EmployeeSOAPPort";

    public java.lang.String getEmployeeSOAPPortWSDDServiceName() {
        return EmployeeSOAPPortWSDDServiceName;
    }

    public void setEmployeeSOAPPortWSDDServiceName(java.lang.String name) {
        EmployeeSOAPPortWSDDServiceName = name;
    }

    public mx.com.proyecti.EmployeeSOAP getEmployeeSOAPPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EmployeeSOAPPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEmployeeSOAPPort(endpoint);
    }

    public mx.com.proyecti.EmployeeSOAP getEmployeeSOAPPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mx.com.proyecti.EmployeeSOAPPortBindingStub _stub = new mx.com.proyecti.EmployeeSOAPPortBindingStub(portAddress, this);
            _stub.setPortName(getEmployeeSOAPPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEmployeeSOAPPortEndpointAddress(java.lang.String address) {
        EmployeeSOAPPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mx.com.proyecti.EmployeeSOAP.class.isAssignableFrom(serviceEndpointInterface)) {
                mx.com.proyecti.EmployeeSOAPPortBindingStub _stub = new mx.com.proyecti.EmployeeSOAPPortBindingStub(new java.net.URL(EmployeeSOAPPort_address), this);
                _stub.setPortName(getEmployeeSOAPPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("EmployeeSOAPPort".equals(inputPortName)) {
            return getEmployeeSOAPPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://proyecti.com.mx/", "EmployeeSOAPService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://proyecti.com.mx/", "EmployeeSOAPPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("EmployeeSOAPPort".equals(portName)) {
            setEmployeeSOAPPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
