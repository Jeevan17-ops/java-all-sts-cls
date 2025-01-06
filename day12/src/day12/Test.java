package day12;

class Student{
	int id;
	String name;
	int Rollno;
	String Branch;
	String college;
	public Student(int id, String name, int Rollno, String Branch, String college) {
		super();
		this.id = id;
		this.name = name;
		this.Rollno= Rollno;
		this.Branch = Branch;
		this.college = college;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", Rollno=" + Rollno+ ", Branch=" + Branch + ", college=" + college
				+ "]";
	}
}
public class Test {

	public static void main(String[] args) {
		
		Student e1 = new Student(10,"Ramu",22,"AI&DS","St.peters");
		System.out.println(e1);
		
		
		
	}

}