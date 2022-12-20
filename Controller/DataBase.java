package Controller;

import java.util.Vector;
import java.util.HashMap;
//import Model.ManagerModel;
import Model.StudentModel;
import Model.TeachDegree;
import Model.TeacherModel;
import Model.UserModel;
public class DataBase {
	private static DataBase database;
	
    private static Vector<TeacherModel> teachers;
    private static Vector<Course> courses;
    private static Vector<StudentModel> students;
    private static Vector<ManagerModel> managers;
    private static Vector<Mark> marks;
    private static Vector<CourseInfo> courseInfo;
    private static HashMap<String ,Vector<Book>> books=new HashMap<String ,Vector<Book>>();
    
    static {
    	teachers = new Vector<TeacherModel> ();
    	courses = new Vector<Course> ();
    	students = new Vector<StudentModel>();
    	managers = new Vector<ManagerModel>();
    	marks = new Vector<Mark>();
    	courseInfo = new Vector<CourseInfo>();
    }
	public static Vector<Book> getBooks(){
    	Vector<Book> b=new Vector<Book>();
    	for(Vector<Book> vector:books.values()) {
    		for(Book book:vector) {
    			b.add(book);
    		}
    	}
    	return b;
    }
	public static Vector<Book> getBooks(String name){
		if(books.get(name)==null) {
			return new Vector<Book>();
		}
		else {
			return books.get(name);
		}
    }
	public static Vector<Book> getBooks(UserModel user){
		Vector<Book> result=new Vector<Book>();
		for(Vector<Book> vector:books.values()) {
			for(Book book:vector) {
				if(book.getOwner().equals(user)) {
					result.add(book);
				}
			}
		}
		return result;
    }
	
	  public static void addBook(Book b) {
		if(books.get(b.getName())==null) {
			books.put(b.getName(), new Vector<Book>());
			books.get(b.getName()).add(b);
		}
		else {
			books.get(b.getName()).add(b);
		}
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
    
    public static void removeMarks(Mark mr) {
    	marks.remove(mr);
    }
    
    public static Vector<Course> getCourses() {
        return courses;
    }
    
    public static void addCourse(Course t) {
    	courses.add(t);
    }
    
    public static void addCourseInfo(CourseInfo course) {
    	courseInfo.add(course);
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
			if(teacher.equals(course.getTeacher())) {
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
    			if(teacher.equals(lector)) {
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
