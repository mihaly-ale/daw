package mvc;

public class StudentDemo {

	public static void main(String[] args) {

		StudentRepository repository = new StudentRepository();
		StudentModel student = repository.retrieveStudent("p-100", "Peter");
		StudentView view = new StudentView();

		StudentController controller = new StudentController(student, view);

		controller.updateView();
	}
}
