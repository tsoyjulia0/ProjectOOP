package Model;

import java.util.Vector;

import Controller.Book;
import Controller.Course;
import Controller.DataBase;
import Controller.DiplomaProject;
import Controller.Faculty;
import Controller.Mark;
import Controller.Organization;

public class StudentModel extends UserModel {
//    private Integer rate;
    private Integer yearOfStudy;
    private Degree degree;
    public Integer cntCredits;
    private String org;
    private Vector<Mark> marks;
    private Vector<Book> books;
    private DiplomaProject diploma;
    private Vector<Course> courses;
    private Organization organization;
    private Faculty faculty;
    
    {
    	marks = new Vector<Mark>();
    	books = new Vector<Book>();
    	courses = new Vector<Course>();
    	DataBase.addStudent(this);
    }
   
    public StudentModel() {
    }
    
    public StudentModel(int id, String login,String pass, String name, String surname, Gender g) {
    	super(id, login,pass, name, surname, g);
  
    }
    
    public Vector<Mark> getMarks(){
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

    public void setDiploma(DiplomaProject diploma) {
        this.diploma = diploma;
    }
    
    public Vector<Course> getCourses() {
        return this.courses;
    }

    public void addCourse(Course course) {
        courses.add(course);
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
