package Controller;

import java.nio.file.Files;
import java.util.Vector;

import Model.LessonModel;
import Model.StudentModel;
import Model.TeacherModel;

public class TeacherController extends EmployeeController implements showCourses{
	public Vector<Course> allCourses = new Vector<>();
//	private Vector<Double> allRates = new Vector<>();
	private Vector<LessonModel> lessons = new Vector<>();
	public Vector<StudentModel> diplomaStudents = new Vector<>();
 	private TeacherModel teacher;
 	private Mark mark;
	
	public TeacherController(TeacherModel t) {
		super(t);
	}
	
	public void manageCourseFiles(Course c, String file, String action) {
		if(action == "put") {
			c.putFile(file);
		}
		else if(action == "delete") {
			c.deleteFile(file);
		}

	}

	@Override
	public Vector<Course> viewCourses() {
		return allCourses;
		
	}
	
	public void viewStudents(Course c) {
		DataBase.getCourses();
		if(c.getTeacher() == this.teacher) {
			c.getStudents();
		}
	}
	
	public void putMark(StudentModel s, int grade, String att) {      				 //Еще доработаю, когда Mark класс будет готов
		System.out.println("Choose the slot of attestation: 1Att, 2Att, Final");
		if(att == "1Att") {
			mark.fAtt+=grade;
		}
		else if(att == "2Att") {
			mark.sAtt+=grade;
		}
		else if(att == "Final") {
			mark.finalEx+=grade;
		}
	}
	
//	public void addRate(double rate) {
//		teacher.rate = rate;
//		allRates.add(rate);
//	}
//	
//	public Vector<Double> viewRate() {
//		return allRates;
//	}
	
	public void addLesson(LessonModel l) {
		lessons.add(l);
	}
	
	public Vector<StudentModel> showDiplomaStudent(StudentModel s) {
		return diplomaStudents;	
	}
	

}
