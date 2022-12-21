package Controller;

import java.io.Serializable;
import java.util.Vector;

import Model.StudentModel;
import Model.TeacherModel;

public class Mark implements Serializable {
		    private double firstAttestation = -1;
		    private double secondAttestation = -1;
		    private double finalExam = 0;
		    private double digit_mark=0.00;
		    private String literalMark="";
		    private Vector<Double> grades= new Vector<Double>();
		    public String getLiteralMark() {
		        return this.literalMark;
		    }
		    public void addGrade(double points) {
		    	grades.add(points);
		    }
		    public double getDigitMark() {
		        return this.digit_mark;
		    }
		    public double getFirstAttestation() {
		        return this.firstAttestation;
		    }
		    public void setAttestation() {
		    	if(this.firstAttestation==-1) {
			    	double result=0;
			    	for(Double d:grades) {
			    		result+=d;
			    	}
			        this.firstAttestation = result;
			        grades.clear();
		    	}
		    	else if(this.secondAttestation==-1){
		    		System.out.println("Первая аттестация выставлена");
			    	double result=0;
			    	for(Double d:grades) {
			    		result+=d;
			    	}
			        this.secondAttestation = result;
			        grades.clear();
		    	}
		    	System.out.println("Аттестации выставлены");
		    }
		    public double getFinal() {
		        return this.finalExam;
		    }
		    public void setFinal(double finalExam) {
		    	if(this.firstAttestation !=-1 && this.secondAttestation!=-1) {
		    		this.finalExam = finalExam;
		    		transformMark(firstAttestation+secondAttestation+finalExam);
		    	}
		    	else {
		    		System.out.println("Сначала выставите аттестации");
		    	}
		    }
		    public double getTotal() {
		    	double result=0;
		    	for(Double d:grades) {
		    		result+=d;
		    	}
		    	return result;
		    }
		    public String toString() {
		        return "Mark{" +
		                ", firstAttestation=" + firstAttestation +
		                ", secondAttestation=" + secondAttestation +
		                ", finalExam=" + finalExam +
		                ", literalMark=" + literalMark;
		    }
		    public void transformMark(double total) {
		        if (total >= 94.5) {
		            literalMark = "A";
		            digit_mark = 4.0;
		        }
		        else if (total >= 89.5) {
		            literalMark = "A-";
		            digit_mark = 3.67;
		        }
		        else if (total >= 84.5) {
		            literalMark = "B+";
		            digit_mark = 3.33;
		        }
		        else if (total >= 79.5) {
		            literalMark = "B";
		            digit_mark = 3.0;
		        }
		        else if (total >= 74.5) {
		            literalMark = "B-";
		            digit_mark = 2.67;
		        }
		        else if (total >= 69.5) {
		            literalMark = "C+";
		            digit_mark = 2.33;
		        }
		        else if (total >= 64.5) {
		            literalMark = "C";
		            digit_mark = 2.0;
		        }
		        else if (total >= 59.5) {
		            literalMark = "C-";
		            digit_mark = 1.67;
		        }
		        else if (total >= 54.5) {
		            literalMark = "D+";
		            digit_mark = 1.33;
		        }
		        else if (total >= 50) {
		            literalMark = "D";
		            digit_mark = 1.0;
		        }
		        else {
		            literalMark = "F";
		            digit_mark = 0;
		        }
		    }
		    
		}


