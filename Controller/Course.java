package Controller;

import java.util.Vector;

import Model.StudentModel;
import Model.TeacherModel;

public class Course extends CourseInfo{
	private int numOfStudents;
	private TeacherModel teacher;
	private StudentModel student;
	public Vector<String> courseFiles = new Vector<>();
	public Vector<StudentModel> allStudents = new Vector<>();
	
	public Course() {
		
	}
	
	{
		teachers.add(teacher);
	}
	
	public Course(int id, String name, String prereq, int cred, int numOfStuds) {
		super(id, name, prereq, cred);
		this.numOfStudents = numOfStuds;
	}
	
	private void setNumOfStuds(int numStud) {
		this.numOfStudents = numStud;
	}
	
	public int getNumOfStuds() {
		return this.numOfStudents;
	}
	
	public void putFile(String file) {
		courseFiles.add(file);
	}
	
	public void deleteFile(String file) {
		courseFiles.remove(file);
	}
	
	public Object getStudent() {
		return student;
	}
	
	public Vector<StudentModel> getStudents(){
		return allStudents;
	}
	
	public Object getTeacher() {
		return teacher;
	}

}
