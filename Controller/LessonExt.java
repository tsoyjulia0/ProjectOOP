package Controller;

import java.util.HashMap;
import java.util.Map.Entry;

public class LessonExt {
	protected HashMap<Integer, Boolean> attendance;
	
	public void setAttendance(HashMap<Integer, Boolean> att) {
		this.attendance=att;
	}
	
	public void getAttendance() {
		for (Entry<Integer, Boolean> entry : this.attendance.entrySet()) {
            System.out.println(entry.getValue()+" "+ entry.getKey());
        }
	}
	
	public void setAttendance(int id, boolean bool) {
		this.attendance.put(id, bool);
	}
}
