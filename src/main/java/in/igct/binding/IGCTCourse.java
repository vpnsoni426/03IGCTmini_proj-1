package in.igct.binding;

public class IGCTCourse {
	
	private int id;
	
	private String courseName;
	
	private String duration;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public IGCTCourse(int id, String courseName, String duration) {
		this.id = id;
		this.courseName = courseName;
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "IGCTCourse [id=" + id + ", courseName=" + courseName + ", duration=" + duration + "]";
	}
	
	

}
