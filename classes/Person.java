package main;

public class Person {
	// initialising empty first name last name variables
	private String fname;
	private String lname;
	private int age;
	
	
	//constructor to generate person object
	public Person(String fname, String lname, int age) {
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}
	
	//method to return last name
	public String getLastName() {
		return lname;
	}
	
	//method to change and set last name
	public void setLastName(String lname) {
		this.lname = lname;
	}
	
	//method to return first name
	public String getFirstName() {
		return fname;
	}
	
	////method to change and set last name
	public void setFirstName(String fname) {
		this.fname = fname;
	}
	
	//method to get age
	public int getAge() {
		return age;
	}
	
	//method to set age
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instantiate two people objects with first and last names

		
	}

}
