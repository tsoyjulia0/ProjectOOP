package Controller;

import java.util.Vector;

import Model.LessonModel;
import Model.StudentModel;
import Model.TeacherModel;

public class Course extends CourseInfo{
	private int numOfStudents;
	private TeacherModel teacher;
//	private StudentModel student;  //c
	public Vector<String> courseFiles = new Vector<>();
//	public Vector<StudentModel> allStudents = new Vector<>(); //c
	private Vector<LessonModel> lessons = new Vector<>();
	
	public Course() {
		
	}
	
	// getStudents()  who has course (this)
	// return Database.students.filter(s->s.marks.keyset().contains(this)).collect(Collectors.toList);
	
	{
		teachers.add(teacher);
		DataBase.addCourse(this);
	}
	
	public Course(CourseInfo courseInfo,TeacherModel teacher) {
		super(courseInfo.getID(),courseInfo.getName(),courseInfo.getPrereq(),courseInfo.getNumOfCred());
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
	
//	public Object getStudent() {
//		return 
//	}
	
//	public Vector<StudentModel> getStudents(){
//		return allStudents;
//	}
	
	public Object getTeacher() {
		return teacher;
	}

	public void addLesson(LessonModel l) {
		lessons.add(l);
		super.addCourseLessons(l);
	}
}
