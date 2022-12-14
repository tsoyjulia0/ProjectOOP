package Controller;

import java.util.Iterator;
import java.util.Vector;

import Model.AdminModel;
import Model.ManagerModel;
import Model.StudentModel;
import Model.TeacherModel;

public class AdminController extends UserController {
	private AdminModel admin;
	Vector<TeacherModel> teachers;


	public AdminController(AdminModel a) {
		super(a);
	}
	
	public void addTeacher(TeacherModel t) {
		DataBase.addTeacher(t);
	}
	
	public void addStudent(StudentModel s) {
		DataBase.addStudent(s);
	}
	
	public void addManager(ManagerModel m) {
		DataBase.addManager(m);
	}
	
	public void addCourse(Course с) {
		DataBase.addCourse(с);
	}
	
	//позже добавить библиотекаря
	
	//remove
	public void removeTeacher(TeacherModel t) {
		DataBase.removeTeacher(t);
	}
	
	public void removeCourse(Course c) {
		DataBase.removeCourse(c);
	}
	
	public void removeStudent(StudentModel s) {
		DataBase.removeStudent(s);
	}
	
	public void removeManager(ManagerModel m) {
		DataBase.removeManager(m);
	}
	
	public void removeMark(Mark mark) {
		DataBase.removeMarks(mark);
	}
	
	//update отправлять новый объект или сделать много if для точного update
	public void updateTeacher(TeacherModel t, String data, String put) {
		if(data.equals("login")) {
			t.setLogin(put);
		}
		else if(data.equals("password")) {
			t.setPassword(put);
		}
		else {
			System.out.println("Wrong field");
		}
	}
	
	public void updateStudent(StudentModel s, String data, String put) {
		if(data.equals("login")) {
			s.setLogin(put);
		}
		else if(data.equals("password")) {
			s.setPassword(put);
		}
		else {
			System.out.println("Wrong field");
		}
	}
	
	public void updateManager(ManagerModel m, String data, String put) {
		if(data.equals("login")) {
			m.setLogin(put);
		}
		else if(data.equals("password")) {
			m.setPassword(put);
		}
		else {
			System.out.println("Wrong field");
		}
	}
	
	
	//seeLog
	
	public void seeLogTeacher(TeacherModel t) {
		System.out.println("Login: "+t.getLogin()+" Password: "+t.getPassword());
	}
	
	public void seeLogStudent(StudentModel s) {
		System.out.println("Login: "+s.getLogin()+" Password: "+s.getPassword());
	}
	
	public void seeLogManager(ManagerModel m) {
		System.out.println("Login: "+m.getLogin()+" Password: "+m.getPassword());
	}

	

}
