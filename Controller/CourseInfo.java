package Controller;

import java.util.Objects;
import java.util.Vector;

import Model.LessonModel;
import Model.StudentModel;
import Model.TeacherModel;
import Model.UserModel;

public class CourseInfo {
	protected int courseId;
	protected String courseName;
	protected String prereq;
	protected int numOfCredits;
	protected Vector<LessonModel> allLessons = new Vector<>();
	
	Vector<TeacherModel> teachers = new Vector<>();
	
	private Vector<Course> courses=new Vector<>();
	public void createCourse(TeacherModel teacher,Vector<StudentModel> students) {
		Course course=new Course(this,teacher,students);
		courses.add(course);
		DataBase.addCourse(course);
		System.out.println("Created");
	}
	
	{
		DataBase.addCourseInfo(this);
	}
	
	public CourseInfo() {
		
	}
	
	public CourseInfo(int id, String name, String prereq, int cred) {
		this.courseId = id;
		this.courseName = name;
		this.prereq = prereq;
		this.numOfCredits = cred;
	}
	
	private void setID(int id) {
		this.courseId = id;
	}
	
	public int getID() {
		return this.courseId;
	}
	
	private void setName(String name) {
		this.courseName = name;
	}
	
	public String getName() {
		return this.courseName;
	}
    
	private void setPrereq(String prereq) {
		this.prereq = prereq;
	}
	
	public String getPrereq() {
		return this.prereq;
	}
	
	private void setNumOfCred(int cred) {
		this.numOfCredits = cred;
	}
	
	public int getNumOfCred() {
		return this.numOfCredits;
	}
	
	public String toString() {
		return "CourseID: " + this.getID() + " ,name: " + this.getName() + " ,prerequisite: " +
				 this.getPrereq() + " ,credits: " + this.getNumOfCred();
 	}
	
	public boolean equals(Object o) {
		if(this==o) return true;
		if(o==null) return false;
		if(this.getClass()!=o.getClass()) return false;
		CourseInfo c=(CourseInfo)o;
		return c.courseName.equals(this.courseName)
		        && c.prereq.equals(this.prereq);
    }
 
    public int hashCode() {
    	return	Objects.hash(courseId, courseName, prereq, numOfCredits);
    }
 
    public int compareTo(CourseInfo c) {
    	 if (c.courseId < this.courseId) {
   	      return 1;
   	    }
    	 else if (c.courseId > this.courseId) {
   	      return -1;
   	    }
   	    return 0;
   	  }
    
    public void createCourse() {
    	CourseInfo c = new CourseInfo(courseId, courseName, prereq, numOfCredits);
    }

	public Vector<TeacherModel> getTeachers() {
		return teachers;
	}

	public void addCourseLessons(LessonModel l) {
		allLessons.add(l);
	}
	
	
}
