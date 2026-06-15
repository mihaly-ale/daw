package mvc;

// the middleman - business logic
// the view only talks to the controller
// the controller talks to the model
public class StudentController {
	private StudentModel studentModel;
	private StudentView studentView;

	// constructor
	public StudentController(StudentModel studentModel, StudentView studentView) {
		this.studentModel = studentModel;
		this.studentView = studentView;
	}	

	// control model object
	public String getStudentName() {
		return studentModel.getName();
	}


	public void setStudentName(String name) {
		studentModel.setName(name);
	}

	public String getStudentId() {
		return studentModel.getStudentId();
	}

	public void setStudentId(String studentId) {
		studentModel.setStudentId(studentId);
	}

	// control view object
	public void updateView() {
		studentView.printDetails(studentModel.getName(), studentModel.getStudentId());
	}

}
