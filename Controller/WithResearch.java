package Controller;

import Model.StudentModel;
import Model.TeacherModel;

public class WithResearch extends ResearcherDecorator{
	private Object obj;
	
	public WithResearch(Researcher r, Object obj) {
		super(r);
		this.obj = obj;	
	}

	public String doResearch() {
		if(this.obj instanceof StudentModel) {
			return ((StudentModel) this.obj).getName() + " " + super.doResearch();
		}
//		
		else if(this.obj instanceof TeacherModel) {
			return ((TeacherModel) this.obj).getName() + " " + super.doResearch();
		}
		
		else return super.doResearch();
	}
	
}
