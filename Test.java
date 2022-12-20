package Test;

import Controller.AdminController;
import Controller.Course;
import Controller.CourseInfo;
import Controller.DataBase;
import Controller.Faculty;
import Controller.ManagerController;
import Controller.Mark;
import Controller.Researcher;
import Controller.SimpleResearcher;
import Controller.StudentController;
import Controller.TeacherController;
import Controller.UserController;
import Controller.WithResearch;
import Model.AdminModel;
import Model.Degree;
import Model.EmployeeModel;
import Model.Gender;
import Model.LessonModel;
import Model.LessonType;
import Model.ManagerModel;
import Model.ManagerType;
import Model.StudentModel;
import Model.TeachDegree;
import Model.TeacherModel;
import Model.UserModel;
import java.time.LocalTime;
import java.util.Vector;

public class Test {

	public static void main(String[] args) {
		
		TeacherModel t1 = new TeacherModel(1,"T2201", "pass1", "Beisenbek", "Baisakov", Gender.M, TeachDegree.L);
		TeacherModel t2 = new TeacherModel(2,"T2202", "pass2", "Pakizar", "Shamoi", Gender.F, TeachDegree.L);
		TeacherModel t3 = new TeacherModel(3,"T2203", "pass3", "Aibek", "Kuralbayev", Gender.M, TeachDegree.L);
		TeacherModel t4 = new TeacherModel(4,"T2204", "pass4", "Elena", "Li", Gender.F, TeachDegree.L);
		TeacherModel t5 = new TeacherModel(51,"T2205", "pass5", "Akerke", "Nasyr", Gender.M, TeachDegree.T);
		TeacherModel t6 = new TeacherModel(6,"T2206", "pass6", "Chardon", "Gaetoen", Gender.M, TeachDegree.T);
		TeacherModel t7 = new TeacherModel(7,"T2207", "pass7", "Dmitriy", "Sidorov", Gender.M, TeachDegree.T);
		TeacherModel t8 = new TeacherModel(8,"T2208", "pass8", "Anatoliy", "Odintsov", Gender.M, TeachDegree.L);
		TeacherModel t9 = new TeacherModel(9,"T2209", "pass9", "Alimznan", "Amanov", Gender.M, TeachDegree.L);
		TeacherModel t10 = new TeacherModel(10,"T22010", "pass10", "Bobur", "Muksimbayev", Gender.M, TeachDegree.L);
		
		StudentModel s1=new StudentModel(21030751,"a_alenov@kbtu.kz","jsjsjd","Abay","Alenov",Gender.M, 4); 
	    StudentModel s2=new StudentModel(21876575,"y_tsoy@kbtu.kz","aazzz","Yuliya","Tsoy",Gender.F, 1); 
	    StudentModel s3=new StudentModel(217643474,"d_dauren@kbtu.kz","fxxxz","Dauren","Haver",Gender.F, 2); 
	    StudentModel s4=new StudentModel(216467545,"t_tempo@kbtu.kz","asdsw","Tempo","Kruger",Gender.F, 1); 
	    StudentModel s5=new StudentModel(216643644,"asd_sdawe@kbtu.kz","vxcvcer","ASRQWS","Wipsow",Gender.M, 3); 
	    StudentModel s6=new StudentModel(213465634,"fsf_asdasx@kbtu.kz","wetsgs","FVVd","Talor",Gender.M, 2); 
	    StudentModel s7=new StudentModel(215457465,"aeqwed__sdmar@kbtu.kz","bbbcxd","Madi","Kakimov",Gender.M, 1); 
	    StudentModel s8=new StudentModel(214875487,"aweiifj_fjaf@kbtu.kz","sdasweq","Damir","Dalabay",Gender.F, 1); 
	    StudentModel s9=new StudentModel(213478374,"fmrjr_asd@kbtu.kz","wqgsv","Mariya","Saparova",Gender.F, 1); 
	    StudentModel s10=new StudentModel(21434763,"dac_qwee@kbtu.kz","fffsa","Hyi","Madraimova",Gender.M, 1);
	    StudentModel s11=new StudentModel(132,"dac_qwee@kbtu.kz","fffsa","Katya","Lisichkina",Gender.F, 2);
	    StudentModel s12=new StudentModel(133,"zxcer_wea@kbtu.kz","grsdfg","Katya","Dosmetova",Gender.F, 1);
	    StudentModel s13=new StudentModel(134,"daasdz_ade@kbtu.kz","xcvewt","Dinara","Dosmailova",Gender.F, 5);
	    StudentModel s14=new StudentModel(135,"vcz_mar@kbtu.kz","qwetg","Dinara","Lisichkina",Gender.F, 1);
	    StudentModel s15=new StudentModel(136,"da_de@kbtu.kz","qwetv","Mariam","Dosmailova",Gender.F, 3);
	    StudentModel s16=new StudentModel(137,"qwe_wee@kbtu.kz","zxczrq","Vlad","Tsoy",Gender.M, 1);
	    StudentModel s17=new StudentModel(138,"utt_qwee@kbtu.kz","liykthn","Valeriya","Li",Gender.F, 1);
	    StudentModel s18=new StudentModel(139,"das_tye@kbtu.kz","fdgnnf","Javanna","Eblanova",Gender.F, 2);
	    StudentModel s19=new StudentModel(140,"ac_eere@kbtu.kz","cvbncb","Bekzat","Aibergen",Gender.M, 3);
	    StudentModel s20=new StudentModel(141,"dac_qasdee@kbtu.kz","trytru","Zhantore","Svanov",Gender.M, 1);
	    StudentModel s21=new StudentModel(142,"lo_asde@kbtu.kz","fhdgdh","Erasul","Rymkul",Gender.M, 1);
	    StudentModel s22=new StudentModel(143,"masd_ee@kbtu.kz","wertwer","Sonya","Ahmetova",Gender.F, 1);
	    StudentModel s23=new StudentModel(144,"uie_wee@kbtu.kz","sadfsv","Zack","Junior",Gender.M, 1);
	    StudentModel s24=new StudentModel(145,"weryc_qwee@kbtu.kz","zxvccxzv","Messi","Leonel",Gender.M, 1);
	    StudentModel s25=new StudentModel(146,"erwqasd_asd@kbtu.kz","qwerqwer","Aray","Alenova",Gender.F, 1);
	    StudentModel s26=new StudentModel(147,"amiwo_awrqw@kbtu.kz","asdfasdf","Zhasulan","Alen",Gender.M, 2);
	    StudentModel s27=new StudentModel(148,"asdx_asdmrw@kbtu.kz","zxcvzx","Ainur","Alnazieva",Gender.F, 1);
	    StudentModel s28=new StudentModel(149,"qwrmmf_makroro@kbtu.kz","wqerwqe","Bagila","Bekpanova",Gender.F, 1);
	    StudentModel s29=new StudentModel(150,"asjco_nqrwn@kbtu.kz","jtyjyj","Ganibek","Duldul",Gender.M, 1);
	    StudentModel s30=new StudentModel(151,"qwjnr_lkrm@kbtu.kz","yrioi","Madiar","Zholdasbekov",Gender.M, 3);
	    StudentModel s31=new StudentModel(132,"wqewf_sad@kbtu.kz","dfdgfdg","Dariga","Bekpanova",Gender.F, 2);
	     
	    Vector<StudentModel> students = new Vector<>();
	    
	    CourseInfo c1 = new CourseInfo(1, "OOP", "PP1", 5);
	    CourseInfo c2 = new CourseInfo(2, "Calc2", "Calc1", 5);
	    CourseInfo c3 = new CourseInfo(3, "PP2", "PP1", 5);
		CourseInfo c4 = new CourseInfo(4, "ADS", null, 5);
		
		Course cr1 = new Course(c1, t1);
		Course cr2 = new Course(c2, t2);
		Course cr3 = new Course(c3, t4);
		Course cr4 = new Course(c4, t9);
	
		AdminModel admin = new AdminModel(101, "A2201", "Apass1", "Zhaniya", "Sadykova", Gender.F);
		DataBase db = new DataBase();
		
		ManagerModel m1 = new ManagerModel(1, "M2201", "Mpass1","Darina", "Kasymova",Gender.F, ManagerType.OR);
		ManagerModel m2 = new ManagerModel(2, "M2202", "Mpass2","Alexey", "Gorin",Gender.M, ManagerType.OR);
		ManagerModel m3 = new ManagerModel(3, "M2203", "Mpass3","Alibek", "Zhakhaev",Gender.M, ManagerType.Dean);
		ManagerModel m4 = new ManagerModel(4, "M2204", "Mpass4","Alikhan", "Zhyrymbek",Gender.M, ManagerType.Rector);
		ManagerModel m5 = new ManagerModel(5, "M2205", "Mpass5","Ekaterina", "Khan",Gender.F, ManagerType.Department);
		
		Faculty f1 = new Faculty(600, "FIT");
		Faculty f2 = new Faculty(450, "BS");
		Faculty f3 = new Faculty(500, "KMA");
		
		LocalTime start1 = LocalTime.of(12, 0, 0);
		LocalTime end1 = LocalTime.of(14, 0, 0);
		LocalTime start2 = LocalTime.of(15, 0, 0);
		LocalTime end2 = LocalTime.of(16, 0, 0);
		LocalTime start3 = LocalTime.of(10, 0, 0);
		LocalTime end3 = LocalTime.of(12, 0, 0);
		
		LessonModel l1 = new LessonModel(cr1, t1, start1 , end1, 100, LessonType.L );
		LessonModel l2 = new LessonModel(cr2, t3, start2 , end2, 20, LessonType.P );
		LessonModel l3 = new LessonModel(cr3, t4, start3 , end3, 90, LessonType.L );
		
//		Mark mark1=new Mark(cr1,20,30,50,s1,t1); 
//		Mark mark2=new Mark(cr2,22,32,52,s2,t2); 
//		Mark mark3=new Mark(cr3,25,26,51,s3,t3); 
//		Mark mark4=new Mark(cr4,19,29,48,s4,t4);
		
		TeacherController tc1 = new TeacherController(t1);
		TeacherController tc5 = new TeacherController(t5);
		AdminController ad1 = new AdminController(admin);
		
		StudentController st1 = new StudentController(s1);
		StudentController st2 = new StudentController(s2);
		StudentController st3 = new StudentController(s3);
		StudentController st11 = new StudentController(s11);
		
		ManagerController mn = new ManagerController(m1);
		
		tc1.addLesson(l1);
		tc1.addLesson(l3);
		tc1.showLessons();
		
		System.out.println();
		
		mn.assignCourse(cr4, tc1);
		mn.assignCourse(cr3, tc1);
		tc1.viewCourses();
		
		System.out.println();
		System.out.println(DataBase.getCourses());
		st1.registerCourse(cr4);
		st1.viewCourses();
		
		System.out.println(s1.getCntCredits());
		
		s1.setDegree(Degree.BACHELOR);
		st1.assignDiploma();
		System.out.println(s1.showDiplomaInfo());
		
		AdminController ac = new AdminController(admin);
		ac.addStudent(s2);
		System.out.println("Added:");
		System.out.println(db.getStudents(m1));
		
		ac.updateStudent(s2, "login", "newLogin");
		System.out.println("Updated:");
		System.out.println(db.getStudents(m1));
		
		ac.removeStudent(s2);
		System.out.println("Removed:");
		System.out.println(db.getStudents(m1));
		
		System.out.println();
		
		tc1.sendMessage("Good afternoon! Please, come to 425 room!", 51 );
		tc5.showAllMessages();
		
		st1.rateTeacher(t9, 10);
		System.out.println(cr4.getTeacher());
		t9.viewRate();
		
		System.out.println();
		
		System.out.println(t1.getName() + " " + "Courses: ");
		tc1.viewCourses();
		
		Researcher r = new SimpleResearcher("FirstResearch", "Analyze");
		r = new WithResearch(r, s2);
		System.out.println(r.doResearch());

	}

}
