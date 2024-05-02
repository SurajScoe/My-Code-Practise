package Company.SocieteGeneral;

public class Student {
	private String name;
	private int rollNumber;
	private int marks;
	
	public Student(String name, int rollNumber,int marks) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.marks = marks;
	}
	
	public Student() {
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setRoll(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	public int getRoll() {
		return rollNumber;
	}
	
	public void setMarks(int marks) {
		this.marks =marks;
	}
	
	public int getMarks() {
		return marks;
	}
	
	@Override
	public String toString() {
		return "[ name : "+name+" roll : "+rollNumber+" marks : "+marks+" ]";
	}
}
