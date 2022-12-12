package Controller;
import Model.EmployeeModel;
import java.util.HashMap;
import java.util.Vector;

public class EmployeeController extends UserController{
	private EmployeeModel e;
	protected static HashMap<Integer, String> sending = new HashMap<>();
	protected static HashMap<Integer, String> requests= new HashMap<>();
	protected Vector<Integer> messages = new Vector<>();
	
	public EmployeeController(EmployeeModel e) {
		super(e);
	}
	
	public void sendMessage(String message, int id) {
		e.setMessage(message);
		sending.put(id, message);
		System.out.println("Message is sent!");
	}
	
	public void showAllMessages() {
		for(String value : sending.values()) {
			System.out.println(value);
		}
	}
	
	public void sendRequest(String req, int id) {
		e.setRequest(req);
		requests.put(id, req);
		System.out.println("Request is sent!");
	}
	
	public void showAllRequests() {
		for(String value : requests.values()) {
			System.out.println(value);
		}
	}
	

}
