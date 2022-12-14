package Controller;

import java.util.Map.Entry;

public class LessonController extends LessonExt {
	
	public void getAttendance() {
		for (Entry<Integer, Boolean> entry : this.attendance.entrySet()) {
            System.out.println(entry.getValue()+" "+ entry.getKey());
        }
	}
}
