package comparatorsAndComparables;

public class Student {
<<<<<<< HEAD

	int marks;
	String name;

=======
	
	int marks;
	String name;
	
>>>>>>> 24de017... Initial commit
	public Student(int marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [marks=" + marks + ", name=" + name + "]";
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

<<<<<<< HEAD
=======
	
>>>>>>> 24de017... Initial commit
	public int compareTo(Student obj) {
		return this.marks - obj.marks;
	}
}
