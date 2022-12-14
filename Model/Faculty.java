package Model;

import java.util.Objects;

public class Faculty {
	private int numOfStudents;
	private String name;
	
	private Faculty() {
		
	}
	
	private Faculty(int numOfStudents, String name) {
		this.numOfStudents = numOfStudents;
		this.name = name;
	}
	
	public int getNumOfStudents() {
		return numOfStudents;
	}

	private void setNumOfStudents(int numOfStudents) {
		this.numOfStudents = numOfStudents;
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, numOfStudents);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Faculty other = (Faculty) obj;
		return Objects.equals(name, other.name) && numOfStudents == other.numOfStudents;
	}

	@Override
	public String toString() {
		return "Faculty "+ name +" Students=" + numOfStudents;
	}
	
}
