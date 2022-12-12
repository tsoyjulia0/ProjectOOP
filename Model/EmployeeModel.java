package Model;
import java.util.Date;
import java.util.Objects;
import java.util.Vector;

public class EmployeeModel extends UserModel implements Comparable<Object>{
	public Date birthDate;
	protected String message;
	protected String request;
	public EmployeeModel() {
		
	}
	
	public EmployeeModel(String login, String pass) {
		super(login, pass);
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}
	
	public void setRequest(String request) {
		this.request = request;
	}
	
	public String getRequest() {
		return this.request;
	}
	
	public String toString() {
        return "ID: " + this.getId() + "Name: " + this.getName() + " Message:" + this.getMessage();
	}
	
    public boolean equals(Object o) {
		if(!super.equals(o)) return false;
		EmployeeModel e = (EmployeeModel)o;
		return message == e.message;
    }
 
    public int hashCode() {
    	return	Objects.hash(message);
    }
    
//    public int compareTo(EmployeeModel e) {
//    	if(e.birthDate > this.birthDate) return 1;
//    	else if(e.birthDate == this.birthDate) return 0;
//    	else return -1;
//    }
	
	
	
	

}
