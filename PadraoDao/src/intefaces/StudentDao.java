package intefaces;

import java.util.List;

import entity.Student;

public interface StudentDao {
	
	public List<Student> getAllStudents();
	public Student getStudent(int rollNo);
	public void updateStudent(Student student);
	public void deleteStudent(Student student);
	
}
