package mvc;

public class StudentController {
	private StudentModel studentModel;
	private StudentView studentView;

	public StudentController getStudentController() {
		return this;
	}

	// constructor
	public StudentController(StudentModel studentModel, StudentView studentView) {
		this.studentModel = studentModel;
		this.studentView = studentView;
	}	

	// getters, setters
	public String getStudentName() {
		return studentModel.getName();
	}


	public void setStudentName(String name) {
		studentModel.setName(name);
	}

	public String getStudentRoll() {
		return studentModel.getRollNo();
	}

	public void setStudentRoll(String roll) {
		studentModel.setRollNo(roll);
	}

	// updateView
	public void updateView() {
		studentView.printDetails(getStudentController());
	}

}
