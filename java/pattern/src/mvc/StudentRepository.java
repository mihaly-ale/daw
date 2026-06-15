package mvc;

public class StudentRepository {

	public StudentModel retrieveStudent(String studentId, String name) {
		return new StudentModel(studentId, name);
	}
}
