package datatable;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class StudentAdapterBean {

	private String name;
	private String surname;
	private int age;
	private double gno;
	private List<Student> studentList;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getGno() {
		return gno;
	}

	public void setGno(double gno) {
		this.gno = gno;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	@PostConstruct
	public void initialize() {
		studentList = new ArrayList<>();
		studentList.add(new Student("name1", "surname1", 18, 2.02));
		studentList.add(new Student("name2", "surname2", 19, 3.03));
		studentList.add(new Student("name3", "surname3", 20, 3.99));
		studentList.add(new Student("name4", "surname4", 21, 1.43));
	}

	public void addStudent() {
		Student student = new Student(name, surname, age, gno);
		studentList.add(student);
	}

	public void deleteStudent(Student student) {
		studentList.remove(student);
	}

}
