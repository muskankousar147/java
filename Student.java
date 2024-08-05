public class Student{
public String name;
public char grade;

public Student(String name, char grade){
	System.out.println("student information");
	this.name = name;
	this.grade = grade;

	System.out.println("student constructor:" +this.name+ " " +this.grade);
	}
public void displayInfo(String name, char grade){
	System.out.println("student display method:" +name+ " " +grade);
	
	
}
}