package mvc;
// GUI (show and update)
// stateless - no data between calls
// no internal data on its own (no fields)

public class StudentView {

	public void printDetails(String name, String studentId) {
		System.out.println("Student details:");
		System.out.println("Name: " + name);
		System.out.println("Student ID: " + studentId);

	}
}
