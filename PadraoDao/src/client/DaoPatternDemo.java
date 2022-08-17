package client;

import dao.StudentDaoImpl;
import entity.Student;
import intefaces.StudentDao;

public class DaoPatternDemo {

	public static void main(String[] args) {
		StudentDao studentDao = new StudentDaoImpl();

	      //print all students
	      for (Student student : studentDao.getAllStudents()) {
	         System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
	      }


	      //update student
	      Student student =studentDao.getAllStudents().get(0);
	      student.setName("Colins");
	      studentDao.updateStudent(student);

	      //get the student
	      studentDao.getStudent(2);
	      System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
	}

}
