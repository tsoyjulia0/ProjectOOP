package Model;

import java.time.LocalTime;
import java.util.Date;
import java.util.Objects;

import Controller.Course;
import Controller.CourseInfo;
import Controller.DataBase;

public class LessonModel implements Comparable<LessonModel> {
	private Course c;
	private TeacherModel t;
	private LocalTime start;
	private LocalTime end;
	private int cntStudent;
	private LessonType type;
	private Days days;
	

	
	public LessonModel() {
		
	}
	
	public LessonModel(Course c, TeacherModel t, LocalTime start, LocalTime end, int cntStudent, LessonType type) {
	    this.c = c;
	    this.t = t;
	    this.start = start;
	    this.end = end;
	    this.cntStudent = cntStudent;
	    this.type = type;
	 }
	
	public Course getCourse() {
		return c;
	}
	private void setCourse(Course c) {
		this.c = c;
	}
	
	public TeacherModel getTeacher() {
		return t;
	}
	private void setTeacher(TeacherModel t) {
		this.t = t;
	}
	public LocalTime getStart() {
		return start;
	}
	private void setStart(LocalTime start) {
		this.start = start;
	}
	public LocalTime getEnd() {
		return end;
	}
	private void setEnd(LocalTime end) {
		this.end = end;
	}
	public int getCntStudent() {
		return cntStudent;
	}
	
	private void setCntStudent(int cntStudent) {
		this.cntStudent = cntStudent;
	}
	
	public LessonType getType() {
		return type;
	}
	private void setType(LessonType type) {
		this.type = type;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cntStudent, end, start, t, type);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LessonModel other = (LessonModel) obj;
		return cntStudent == other.cntStudent && Objects.equals(end, other.end)
				&& Objects.equals(start, other.start) && Objects.equals(t, other.t) && type == other.type;
	}
	@Override
	public String toString() {
		return "LessonModel Teacher=" + t.toString() + ", start=" + start + ", end=" + end + ", cntStudent=" + cntStudent
				+ ", type=" + type ;
	}
	

	@Override
	public int compareTo(LessonModel l) {
		return this.start.compareTo(l.start);
	}

	


}
