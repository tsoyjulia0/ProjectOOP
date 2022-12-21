package Controller;

import java.io.Serializable;
import java.util.Vector;

import Model.StudentModel;
import Model.TeacherModel;

public class Mark implements Serializable {
		 private double points;
		    private double firstAttestation = 0;
		    private double secondAttestation = 0;
		    private double finalExam = 0;
		    private double total;
		    private double gpa = 0;
		    private double digit_mark;
		    private String literalMark;
		    private StudentModel student;
		    private TypeOfMark type;
		    
		    private double getPoints() {
		        return this.points;
		    }
		    private void setPoints(double points) {
		        this.points = points;
		    }
		    
		    public String getLiteralMark() {
		        return this.literalMark;
		    }

		    public double getDigitMark() {
		        return this.digit_mark;
		    }
		    private void setLiteralMark(String literalMark) {
		        this.literalMark = literalMark;
		    }
//		    public StudentModel getStudent() {
//		        return this.student;
//		    }
//		    public void setStudent(StudentModel student) {
//		        this.student = student;
//		    }
		    public double getFirstAttestation() {
		        return this.firstAttestation;
		    }
		    public void setFirstAttestation(double first_attestation) {
		        this.firstAttestation = first_attestation;
		    }
		    public double getSecondAttestation() {
		        return this.secondAttestation;
		    }
		    public void setSecondAttestation(double secondAttestation) {
		        this.secondAttestation = secondAttestation;
		    }
		    public double getFinal() {
		        return this.finalExam;
		    }
		    public void setFinal(double finalExam) {
		        this.finalExam = finalExam;
		    }
		    public double getTotal() {
		        this.total = getFirstAttestation() + getSecondAttestation() + getFinal();
		        return this.total;
		    }
		    public void setTotal(double total) {
		        this.total = total;
		    }
		    public Double getGpa() {
		        return gpa;
		    }
		    public void setGpa(double gpa) {
		        this.gpa = gpa;
		    }
		    public String toString() {
		        return "Mark{" +
		                "points=" + points +
		                ", firstAttestation=" + firstAttestation +
		                ", secondAttestation=" + secondAttestation +
		                ", finalExam=" + finalExam +
		                ", total=" + total +
		                ", literalMark=" + literalMark +
		                ", student=" + student +
		                '}';
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
		    
		    public void putMark(TypeOfMark typeOfMark, double points) {
		    	this.points = points;
		    	this.type = typeOfMark;
		        if (typeOfMark == TypeOfMark.FIRST_ATTESTATION) {
		            this.firstAttestation += points;
		            
		        }
		        else if (typeOfMark == TypeOfMark.SECOND_ATTESTATION) {
		            this.secondAttestation += points;
		        }
		        else if (typeOfMark == TypeOfMark.FINAL) {
		            this.finalExam += points;
		            this.transformMark(this.getTotal());
		        }
		    }
		}


