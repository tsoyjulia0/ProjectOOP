package Controller;
import java.util.Vector;

import Model.ManagerModel;
import Model.StudentModel;
import Model.TeacherModel;

public class ManagerController extends EmployeeController {
	private ManagerModel m;
	private StudentModel s;
	private Course course;
	private Vector<String> News= new Vector<>();
	
	public ManagerController(ManagerModel m) {
		super(m);
	}
	
	
	public void addCourseForReg(Course c) {
		DataBase.addCourse(c);
	}
	
	public static boolean approveReg(StudentModel s, Course c) {   
		DataBase.getCourses();
		if(c.getPrereq() != null) {
			return false;
		}
		
		if(s.cntCredits + c.numOfCredits <= 21) {
			s.cntCredits = s.cntCredits + c.numOfCredits;
			DataBase.addStudent(s);
			c.allStudents.add(s);
			return true;
		}
		return false;
	}
	
	public void assignCourse(Course c, TeacherController t) {
		DataBase.addCourse(c);            
		t.allCourses.add(c);
	}
	
	public void showReport() {
		
	}
	
	public void manageNews(String news, String action) {
		if(action == "add") {
			News.add(news);
		}
		else if(action == "delete") {
			News.remove(news);
		}
	}
	
	public void viewInfo(Object obj) {
		if(obj instanceof StudentModel) {
			DataBase.getStudents(obj);
		}
		else if(obj instanceof TeacherModel) {
			DataBase.getTeachers(obj);
		}
	}
	
	public void viewRequestEmployees() {
		for(String value : requests.values()) {
			System.out.println(value);
		}
	}
	
	
	
	
	

}
