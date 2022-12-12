package Controller;

import Model.TeacherModel;

public class DiplomaProject {
	private TeacherModel teacher;
	private CourseInfo course;
	public DiplomaProject() {
		
	}
	
	public DiplomaProject(TeacherModel t, CourseInfo c) {
		this.teacher = t;
		this.course = c;
	}

}
