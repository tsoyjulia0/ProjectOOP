package Controller;

import java.util.Objects;
import java.util.Vector;

import Model.StudentModel;

public class Organization {
	private String name;
	private Vector<StudentModel> st;
	
	public String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	public Vector<StudentModel> getSt() {
		return st;
	}
	private void setSt(Vector<StudentModel> st) {
		this.st = st;
	}
	
	private void addStudent(StudentModel stu) {
		this.st.add(stu);
	}
	@Override
	public String toString() {
		return "Organization " + name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, st);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Organization other = (Organization) obj;
		return Objects.equals(name, other.name) && Objects.equals(st, other.st);
	}
	
}
