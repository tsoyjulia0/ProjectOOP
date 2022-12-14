package Controller;

import java.util.Vector;

import Model.StudentModel;

public class Course extends CourseInfo{
	private int numOfStudents;
	private TeacherModel teacher;
	private StudentModel student;
	public Vector<String> courseFiles = new Vector<>();
	private Vector<StudentModel> allStudents = new Vector<>();
	
	public Course() {
		
	}
	
	{
		teachers.add(teacher);
	}
	
	public Course(CourseInfo courseInfo,TeacherModel teacher, Vector<StudentModel> students) {
		super(courseInfo.getID(),courseInfo.getName(),courseInfo.getPrereq(),courseInfo.getNumOfCred());
		allStudents=students;
		this.teacher=teacher;
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
