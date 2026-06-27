package mvc;

public class StudentView {

	public void printDetails(StudentController controller) {
		System.out.println("Student details:");
		System.out.println("Name " + controller.getStudentName());
		System.out.println("Roll: " + controller.getStudentRoll());

	}
}
