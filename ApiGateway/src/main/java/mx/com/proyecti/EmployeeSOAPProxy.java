package mx.com.proyecti;

public class EmployeeSOAPProxy implements mx.com.proyecti.EmployeeSOAP {
  private String _endpoint = null;
  private mx.com.proyecti.EmployeeSOAP employeeSOAP = null;
  
  public EmployeeSOAPProxy() {
    _initEmployeeSOAPProxy();
  }
  
  public EmployeeSOAPProxy(String endpoint) {
    _endpoint = endpoint;
    _initEmployeeSOAPProxy();
  }
  
  private void _initEmployeeSOAPProxy() {
    try {
      employeeSOAP = (new mx.com.proyecti.EmployeeSOAPServiceLocator()).getEmployeeSOAPPort();
      if (employeeSOAP != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)employeeSOAP)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)employeeSOAP)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (employeeSOAP != null)
      ((javax.xml.rpc.Stub)employeeSOAP)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public mx.com.proyecti.EmployeeSOAP getEmployeeSOAP() {
    if (employeeSOAP == null)
      _initEmployeeSOAPProxy();
    return employeeSOAP;
  }
  
  public void update(int id, java.lang.String firstname, java.lang.String lastname, java.util.Calendar birthdate, double salary) throws java.rmi.RemoteException{
    if (employeeSOAP == null)
      _initEmployeeSOAPProxy();
    employeeSOAP.update(id, firstname, lastname, birthdate, salary);
  }
  
  public void delete(int id) throws java.rmi.RemoteException{
    if (employeeSOAP == null)
      _initEmployeeSOAPProxy();
    employeeSOAP.delete(id);
  }
  
  public mx.com.proyecti.Employee read(int id) throws java.rmi.RemoteException{
    if (employeeSOAP == null)
      _initEmployeeSOAPProxy();
    return employeeSOAP.read(id);
  }
  
  public int create(java.lang.String firstname, java.lang.String lastname, java.util.Calendar birthdate, double salary) throws java.rmi.RemoteException{
    if (employeeSOAP == null)
      _initEmployeeSOAPProxy();
    return employeeSOAP.create(firstname, lastname, birthdate, salary);
  }
  
  public mx.com.proyecti.Employee[] readAll() throws java.rmi.RemoteException{
    if (employeeSOAP == null)
      _initEmployeeSOAPProxy();
    return employeeSOAP.readAll();
  }
  
  
}