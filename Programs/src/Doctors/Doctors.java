package Doctors;

import java.util.Comparator;

public class Doctors implements Comparator<Doctors> {
	private int id;
	private String name;
	private  String qualification;
	
	
	
	
	public Doctors(int id, String name, String qualification) {
		super();
		this.id = id;
		this.name = name;
		this.qualification = qualification;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}



	@Override
	public String toString() {
		return "Doctors [id=" + id + ", name=" + name + ", qualification=" + qualification + "]";
	}



	@Override
	public int compare(Doctors o1, Doctors o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o1.getName());
	}
	
	
	
	
}
