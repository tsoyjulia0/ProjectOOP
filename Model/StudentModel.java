package Model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Set;
import java.util.Vector;

import Controller.Book;
import Controller.Course;
import Controller.DataBase;
import Controller.DiplomaProject;
import Controller.Faculty;
import Controller.Mark;
import Controller.Organization;
import Controller.Researcher;

public class StudentModel extends UserModel implements Serializable {
//    private Integer rate;
    private Integer yearOfStudy;
    private Degree degree;
    public int cntCredits = 0;
    private String org;
    private Vector<Book> books;
//    private Vector<Course> courses; //c
    private Organization organization;
    private Faculty faculty;
//    private Vector<Mark> marks;  //c
    public HashMap<Course, Mark> grades;
    private DiplomaProject diploma;
    private double gpa = 0;
    private Vector<Course> finished=new Vector<Course>();
    
    
    public Vector<Course> getFinishedCourses(){
    	return finished;
    }
    {
    	
    	books = new Vector<Book>();
    	grades = new HashMap<Course, Mark>();
    	DataBase.addStudent(this);
    }
   
    public StudentModel() {
    }
    
    public StudentModel(int id, String login,String pass, String name, String surname, Gender g, int year) {
    	super(id, login,pass, name, surname, g);
    	this.yearOfStudy = year;
  
    }
    
    public Set<Mark> getMarks(){
    	Set<Mark> marks = (Set<Mark>) grades.values();
//    	for(Course key: grades.keySet()){
//    	    System.out.println(key + ": " + grades.get(key));
//    	}
    	return marks;
    }
    
    public Organization getOrganization() {
    	return organization;
    }
    
//    public Integer getRate() {
//        return this.rate;
//    }
//    public void setRate(Integer rate) {
//        this.rate = rate;
//    }

    public Integer getYearOfStudy() {
        return this.yearOfStudy;
    }
    public void setYearOfStudy(Integer yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public Degree getDegree() {
        return this.degree;
    }
    
    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public Integer getCntCredits() {
        return this.cntCredits;
    }
    
    public void setCntCredits(Integer cntCredits) {
        this.cntCredits = cntCredits;
    }

    public String getOrg() {
        return this.org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public Faculty getFaculty() {
        return this.faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public Vector<Book> getBooks() {
        return this.books;
    }

    public void setBooks(Vector<Book> books) {
        this.books = books;
    }

    public DiplomaProject getDiploma() {
        return this.diploma;
    }
    
    public String showDiplomaInfo() {
    	return "Diploma project: name " + this.getName() + " " + this.diploma;
    }

    public void setDiploma(DiplomaProject diploma) {
        this.diploma = diploma;
    }
    
    public Set<Course> getCourses() {
//    	Set<Course> keys = grades.keySet();
    	// To get all key: value
    	Set<Course> courses = (Set<Course>) grades.keySet();
//    	for(Course key: grades.keySet()){
//    	    System.out.println(key + ": " + grades.get(key));
//    	}
    	return courses;
    }

    public void addCourse(Course course) {
    	Mark m = new Mark();
    	grades.put(course, m);
//        courses.add(course);
        this.cntCredits += course.getNumOfCred();
    }
    
    public void setYear(Integer year) {
    	this.yearOfStudy=year;
    }
    
    public int getYear() {
        return yearOfStudy;
    }
    public void enterOrg(Organization org) {
    	this.organization=org;
    }
    
    public void setDergree(Degree degree) {
        this.degree=degree;
    }

    public void setFac(Faculty fac) {
    	this.faculty=fac;	
    }
    public Faculty getFac() {
        return this.faculty;
    }



    
    
}
