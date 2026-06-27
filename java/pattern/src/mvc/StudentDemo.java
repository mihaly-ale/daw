package mvc;

public class StudentDemo {

	public static void main(String[] args) {
		
		StudentModel peter = retrieveStudentFromDataBase("a123", "Peter");		
		
		StudentController controller = new StudentController(peter, new StudentView());
		
		controller.updateView();

	}

	
	// db query
	public static StudentModel retrieveStudentFromDataBase(String rollNo, String name) {

		StudentModel student = new StudentModel(rollNo, name);

		return student;
	};
}
