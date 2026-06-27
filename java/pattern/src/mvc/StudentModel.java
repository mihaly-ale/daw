package mvc;

public class StudentModel {
	private String rollNo;
	private String name;

	// constuctor
	public StudentModel(String rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	// getters, setters
	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
