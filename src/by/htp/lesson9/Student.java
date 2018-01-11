package by.htp.lesson9;

public class Student extends Person {
	
	private int avgMark;
	
	public Student() {
		
	}
	
	public Student(String name) {
		super(name);
	}
	
	public void doSmth() {
		System.out.println("Walk to school");
	}
	public void study() {
		System.out.println("Study");
	}
}
