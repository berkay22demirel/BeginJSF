package datatable;

public class Student {

	private String name;
	private String surname;
	private int age;
	private double gno;

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

	public Student(String name, String surname, int age, double gno) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.gno = gno;
	}

}
