package edu.peters;


class Student{
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
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
	
		
}


public class ExceptionDemo3 {

	public static void main(String[] args) {
	
	//	Student s1 = new Student(100,"Amar");
		try {
			Student s1 = null;
			System.out.println("Name------>"+s1.getName());
			System.out.println("Id---->"+s1.getId());
				
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		Student s2 = new Student(200,"Akbar");
		
		System.out.println("Name------>"+s2.getName());
		System.out.println("Id---->"+s2.getId());
		
		Student s3 = new Student(300,"Akash");
		
		System.out.println("Name------>"+s3.getName());
		System.out.println("Id---->"+s3.getId());
		
		
	}

}