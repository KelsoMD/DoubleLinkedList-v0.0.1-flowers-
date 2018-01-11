package by.htp.lesson9;

import java.util.Date;

public class DatePrinterInspector {

	public static void main(String[] args) {
	
		Person p = new Teacher();
		Person op = new Teacher();
		Person os = new Student();
		Person ps = new Student();
		Student st = new Student();
	
		print(p);
	}
	
	public static void print(Person p) {
		p.doSmth();
	}
	
	public static void print(Student s) {
		s.doSmth();
	}
	
	
	
	
	
	public static void print(int x) {
		System.out.println("int");
	}
	public static void print(double x) {
		System.out.println("double");
	}

}
