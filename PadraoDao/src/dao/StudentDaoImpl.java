package dao;

import java.util.ArrayList;
import java.util.List;

import entity.Student;
import intefaces.StudentDao;

public class StudentDaoImpl implements StudentDao {
	
	//list is working as a database
	   List<Student> students;

	   public StudentDaoImpl(){
	      students = new ArrayList<Student>();
	      Student student1 = new Student("Robert",0);
	      Student student2 = new Student("John",1);
	      Student student3 = new Student("Mary",2);
	      Student student4 = new Student("Greta",3);
	      students.add(student1);
	      students.add(student2);
	      students.add(student3);
	      students.add(student4);
	   }
	   @Override
	   public void deleteStudent(Student student) {
	      students.remove(student.getRollNo());
	      System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from database");
	   }

	   //retrive list of students from the database
	   @Override
	   public List<Student> getAllStudents() {
	      return students;
	   }

	   @Override
	   public Student getStudent(int rollNo) {
	      return students.get(rollNo);
	   }

	   @Override
	   public void updateStudent(Student student) {
	      students.get(student.getRollNo()).setName(student.getName());
	      System.out.println("Student: Roll No " + student.getRollNo() + ", updated in the database");
	   }

}
