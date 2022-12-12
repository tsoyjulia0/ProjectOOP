package Model;
import java.util.Objects;
import java.util.Vector;

import Controller.Course;
import Controller.DataBase;

public class TeacherModel extends EmployeeModel implements Cloneable{
	public double rate;
	public TeachDegree degree;
	private Vector<Double> allRates = new Vector<>();
	
	public TeacherModel() {
		
	}
	
	{
		DataBase.addTeacher(this);
	}
	
	public TeacherModel(String login, String pass, TeachDegree deg) {
		super(login, pass);
		this.degree = deg;
	}
	
	public double getRate() {
		return this.rate;
	}
	
	private void setDegree(TeachDegree deg) {
		this.degree = deg;
	}
	
	public TeachDegree getDegree() {
		return this.degree;
	}
	
	public String toString() {
		return "ID: " + this.getId() + " Name: " + this.getName() + " Rate is: " + this.getRate();
	}
	
	public boolean equals(Object o) {
		if(!super.equals(o)) return false;
		TeacherModel t = (TeacherModel)o;
		return rate == t.rate;
    }
 
    public int hashCode() {
    	return	Objects.hash(rate);
    }
    
    public Object clone() throws CloneNotSupportedException{
    	TeacherModel t = (TeacherModel)super.clone();
    	return t;
    }
    
    public int compareTo(Object obj) {
    	TeacherModel t = (TeacherModel)obj;
   	 	if(t.rate > this.rate) return -1;
   	 	else if(t.rate < this.rate) return 1;
   	 	else return 0;
   }
    
    public void addRate(double rate) {
    	TeacherModel teacher = new TeacherModel();
		teacher.rate = rate;
		allRates.add(rate);
	}
    
    public Vector<Double> viewRate() {
		return allRates;
	}
	
    
    

}
