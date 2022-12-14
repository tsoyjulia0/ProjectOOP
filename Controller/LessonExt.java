package Controller;

import java.util.HashMap;

public class LessonExt {
	protected HashMap<Integer, Boolean> attendance;
	
	public void setAttendance(HashMap<Integer, Boolean> att) {
		this.attendance=att;
	}
	
	public void setAttendance(int id, boolean bool) {
		this.attendance.put(id, bool);
	}
}
