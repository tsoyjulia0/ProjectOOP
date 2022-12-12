package Controller;

import java.util.Vector;

import Model.StudentModel;
import Model.TeacherModel;

public class Mark {
	private Vector<Integer> grade;
    private char letter;
    private Course c;
    public int fAtt;
    public int sAtt;
    public int finalEx;
    private StudentModel student;
    private TeacherModel teacher;
    private StudentController studentController;
    private TeacherController teacherController;
    
    public Mark() {
    	
    }
    
    public Mark(char letter, Course c, int fAtt, int sAtt, int finalEx, StudentModel student,TeacherModel teacher,StudentController studentContreller,TeacherController teacherController) {
    	this.letter=letter;
    	this.c=c;
    	this.fAtt=fAtt;
    	this.sAtt=sAtt;
    	this.finalEx=finalEx;
    	this.student=student;
    	this.teacher=teacher;
    	this.studentController=studentController;
    	this.teacherController=teacherController;
    	
    }
    
    public Vector<Integer> getGrade() {
        return this.grade;
    }
    
    private void setGrade(Vector<Integer> grade) {
        this.grade = grade;
    }
    
    private void setLetter() {
        this.letter=letter;
    }
    
    public char getLetter() {
       return this.letter;
    }
    
    public Course getCourse() {
        return this.c;
    }
    
    private void setCourse(Course c) {
        this.c = c;
    }
    
    public int getFirstAtt() {
        return this.fAtt;
    }

    private void setFirstAtt(int fAtt) {
        this.fAtt = fAtt;
    }
    
    public int getSecondAtt() {
        return this.sAtt;
    }

    private void setSecondAtt(int sAtt) {
        this.sAtt = sAtt;
    }
    
    public int getFinal() {
        return this.finalEx;
    }
    
    private void setFinal(int finalEx) {
        this.finalEx = finalEx;
    }
    
    public StudentModel getStudent() {
        return this.student;
    }
    
    private void setStudent(StudentModel student) {
        this.student = student;
    }
    
    public TeacherModel getTeacher() {
        return this.teacher;
    }
    
    private void setTeacher(TeacherModel teacher) {
        this.teacher = teacher;
    }
    
    public String toString() {
    	return "Course: " + this.c + " ,fAtt: " + this.fAtt + " ,sAtt: " +
				 this.sAtt + " ,Final: " + this.finalEx+" ,StudentModel: " + this.student + " ,TeacherModel: " +
				 this.teacher + " ,StudentController: " + this.studentController+" ,TeacherController: " + this.teacherController;
    }
    
    public void putMark(int mark) {
    	grade.add(mark);
    }
    
    public void deleteMark(int mark) {
    	grade.remove(mark);
    }
    
    public boolean equals(Object o) {
		if(this==o) return true;
		if(o==null) return false;
		if(this.getClass()!=o.getClass()) return false;
		Mark m=(Mark)o;
		return finalEx==m.finalEx;
    }

    public int compareTo(Mark m) {
    	 if (m.finalEx < this.finalEx) {
      	      return 1;
      	 }
       	 else if (m.finalEx > this.finalEx) {
      	      return -1;
      	 }
       	 else return 0;
      	}
}

