package mvc;

public class StudentRepository {

	public StudentModel retrieveStudent(String rollNo, String name) {
		return new StudentModel(rollNo, name);
	}
}
