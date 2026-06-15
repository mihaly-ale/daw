package mvc;

// database
// independent from the view
// serves as the pattern of the data - no actual instances are created here

public class StudentModel {
	private String studentId;
	private String name;

	// constructor
	public StudentModel(String studentId, String name) {
		this.studentId = studentId;
		this.name = name;
	}

	// getters, setters
	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
