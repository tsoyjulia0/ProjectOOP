package Controller;

import java.util.Scanner;
import Model.Degree;
import Model.ManagerModel;
import Controller.Book;
import java.util.Vector;

import Model.StudentModel;

import Model.TeacherModel;
import Controller.DiplomaProject;

public class StudentController extends UserController implements showCourses {
    private StudentModel student;
    
    
	public StudentController(StudentModel s) {
		super(s);
	}    
    
    public void registerCourse(Course c, int courseId) {
    	if((ManagerController.approveReg(student, c) == false))
    		System.out.println("Не удалось зарегаться");
    	else {
    		Vector<Course> courses=DataBase.getCourses();
    		Vector<Course> available = new Vector<Course>();
    		for(Course course:courses) {
    			if(c.getID()== courseId) {
    				available.add(course);
    			}
    		}
    		System.out.println("Выберите поток: ");
    		int index = 1;
    		for(Course course:available) {
    			System.out.println(index+" "+course.getTeacher()+" "+course.getNumOfStuds());
    			index++;
    		}
    		
    		@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
    		int input = scan.nextInt();
    		if(input >=index) {
    			System.out.println("Нет курса с такой нумерацией");
    		}
    		else {
    			student.addCourse(available.elementAt(index-2));
    		}

    	}
    }
    
    public void viewInfoTeacher() {

    	for(Course course: student.getCourses()) {
    		System.out.println(course.getTeacher());
    	}
    	
    }
    
    public void viewMarks() {
    	for(Mark mark:student.getMarks()) {
    		System.out.println(mark);
    	}
    }
    
    public void viewTranscript() {
    	for(Mark mark:student.getMarks()) {
    		System.out.println("Название курса "+mark.getCourse()+'\n'+"1 аттестация "+mark.getFirstAtt()+'\n');
    		System.out.println("Вторая аттестация "+mark.getSecondAtt()+'\n'+"Экзамен "+mark.getFinal()+'\n');
    		System.out.println("Total: "+mark.getFinal()+"\n"+" "+mark.getLetter());
    	}
    }
    
    public Vector<Mark> getTranscript() {
    	return student.getMarks();
    }
    
    public void rateTeacher(TeacherModel teacher,int rate) {
    	teacher.addRate(rate);
    }
    
    public void showBooks() {
    	for(Book book:student.getBooks()) {
    		System.out.println(book);
    	}
    }
    
    public void assignDiploma() {
    	if(student.getYearOfStudy()!=4 || student.getDegree()!=Degree.BACHELOR) {
    		System.out.println("No Diploma project!");
    	}
    	else if(student.getDiploma() == null) {
    		int input,index;
    		TeacherModel teacher = null;
    		CourseInfo course=null;
    		boolean selected=true;
    		Scanner scan = new Scanner(System.in);
    		System.out.println("Выберите \n 1)поиск по учителю \n 2)поиск по курсу");
    		input = scan.nextInt();
    		if(input ==1 ) {
        		System.out.println("Выберите номер учителя");
        		index=1;
        		Vector<TeacherModel> lectors=DataBase.getLectors();
        		for(TeacherModel lector : lectors) {
        				System.out.println(index+": "+lector);
        				index++;
        		}
        		input = scan.nextInt();
        		if(input >=index || input<0) {
        			System.out.println("Нет учителя с такой нумерацией");
        		}
        		else {
        			teacher=(lectors.elementAt(input-1));
        			Vector<CourseInfo> courses=DataBase.getCoursesInfo(teacher);
        			index=1;
        			System.out.println("Выберите доступные курсы учителя "+teacher.getName());
        			for(CourseInfo cours:courses) {
    					System.out.println(index+" "+cours);   
    					index++;
        			}
        			input = scan.nextInt();
            		if(input >=index || input<0) {
            			System.out.println("Нет курса с такой нумерацией");
            		}
            		else {
            			course=courses.elementAt(input-1);
            		}
        		}
    		}
    		else if (input==2) {
    			Vector<CourseInfo> courses=DataBase.getCourseInfo();
    			index=1;
    			System.out.println("Выберите доступные курсы :");
    			for(CourseInfo course1:courses) {
					System.out.println(index+" "+course1);   
					index++;
    			}
    			input = scan.nextInt();
        		if(input >=index || input<0) {
        			System.out.println("Нет курса с такой нумерацией");
        		}else {
        			course=courses.elementAt(input-1);
            		System.out.println("Выберите номер учителя");
            		index=1;
            		Vector<TeacherModel> lectors=course.getTeachers();
            		for(TeacherModel lector : lectors) {
            				System.out.println(index+": "+lector);
            				index++;
            		}
            		input = scan.nextInt();
            		if(input >=index || input<0) {
            			System.out.println("Нет учителя с такой нумерацией");
            		}
            		else {
            			teacher=(lectors.elementAt(input-1));
            		}
        		}
    			
    		}
    		else {
    			System.out.println("bruh");
    			selected=false;
    		}
    		if(selected) {
				DiplomaProject diploma= new DiplomaProject(teacher, course);
				student.setDiploma(diploma);
				System.out.println("Вы успешно создали дипломную работу");
    		}

    		
    	}
    
    	else {
    		System.out.println("У вас уже есть дипломная работа");
    	}
}

	@Override
	public Vector<Course> viewCourses() {
		for(Course course: student.getCourses()){
			System.out.println(course);
		}
	} 
}

