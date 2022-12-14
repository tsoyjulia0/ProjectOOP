package Controller;

import java.util.Vector;

import Model.ManagerModel;
import Model.StudentModel;
import Model.TeachDegree;
import Model.TeacherModel;
public class DataBase {
	private static DataBase database;
	
    private static Vector<TeacherModel> teachers;
    private static Vector<Course> courses;
    private static Vector<StudentModel> students;
    private static Vector<ManagerModel> managers;
    private static Vector<Mark> marks;
    private static Vector<CourseInfo> courseInfo;
    
    
    static {
    	teachers = new Vector<TeacherModel> ();
    	courses = new Vector<Course> ();
    	students = new Vector<StudentModel>();
    	managers = new Vector<ManagerModel>();
    	marks = new Vector<Mark>();
    }
    
    public static synchronized DataBase getInstance() {
    	if(database==null) {
    		database=new DataBase();
    	}
    	return database;
    }
    
    public static Vector<TeacherModel> getTeachers(Object sender) {
    	if(sender instanceof StudentModel) {
    		System.out.println("Нет доступа");
    		return null;
    	}
        return teachers;
    }
    
    public static void addTeacher(TeacherModel t) {
    	teachers.add(t);
    }
    
    public static void removeTeacher(TeacherModel t) {
    	teachers.remove(t);
    }
    
    public static void removeStudent(StudentModel s) {
    	students.remove(s);
    }
    
    public static void removeManager(ManagerModel m) {
    	managers.remove(m);
    }
    
    public static void removeCourse(Course c) {
    	courses.remove(c);
    }
	
    public static void addCourseInfo(CourseInfo course) {
    	courseInfo.add(course);
    }
    
    public static void removeMarks(Mark mr) {
    	marks.remove(mr);
    }
    
    public static Vector<Course> getCourses() {
        return courses;
    }
    
    public static void addCourse(Course t) {
    	courses.add(t);
    }
    
    public static Vector<StudentModel> getStudents(Object sender) {
    	if(sender instanceof StudentModel) {
    		System.out.println("Нет доступа");
    		return null;
    	}
        return students;
    }
    
    public static void addStudent(StudentModel s) {
    	students.add(s);
    }
    
    public Vector<ManagerModel> getManagers(Object sender) {
    	if(sender instanceof StudentModel) {
    		System.out.println("Нет доступа");
    		return null;
    	}
        return managers;
    }
    
    public static Vector<Course> getCourses(TeacherModel teacher){
		Vector<Course> availableCourses=new Vector<Course>();
		for(Course course:courses) {
			if(course.getTeacher()==teacher) {
				availableCourses.add(course);
			}
		}
		return availableCourses;
    }
    
    public static Vector<TeacherModel> getLectors(){
		Vector<TeacherModel> lectors=new Vector<TeacherModel>();
		for(TeacherModel teacher : DataBase.getTeachers(new TeacherModel())) {
			if(teacher.getDegree()==TeachDegree.L) {
				lectors.add(teacher);
			}
		}
		return lectors;
    }
    
    public static Vector<CourseInfo>getCoursesInfo(TeacherModel teacher){
    	Vector<CourseInfo> result=new Vector<>();
    	for(CourseInfo course:courseInfo) {
    		for(TeacherModel lector: getLectors()) {
    			if(lector==teacher) {
    				result.add(course);
    				break;
    			}
    		}
    	}
    	return result;
    }
    
    public static Vector<CourseInfo> getCourseInfo(){
    	return courseInfo;
    }
//    public static Vector<TeacherModel> getLectors(CourseInfo course){
//    	return course.getTeachers();
//    }
    public static void addManager(ManagerModel m) {
    	managers.add(m);
    }
    
    public Vector<Mark> getMarks() {
        return marks;
    }
    public static void addMark(Mark m) {
    	marks.add(m);
    }
    public String ToString() {
        return "Number of students: "+students.size()+"\n"+"Number of teachers: " +teachers.size()+'\n'+"Number of Courses: "+courses.size()+'\n';
    }
}
