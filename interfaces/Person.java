package interfaces;

public class Person implements Student, YouTuber {

	public static void main(String[] args) {
<<<<<<< HEAD

		Person obj = new Person();
		obj.makeVideo();
		obj.study();

=======
		
		Person obj = new Person();
		obj.makeVideo();
		obj.study();
		
>>>>>>> 24de017... Initial commit
		YouTuber x = obj;
		x.makeVideo();

	}

	@Override
	public void makeVideo() {
<<<<<<< HEAD

		System.out.println("person is making video");

=======
	
		System.out.println("person is making video");
		
>>>>>>> 24de017... Initial commit
	}

	@Override
	public void study() {
<<<<<<< HEAD

		System.out.println("person is studying");

	}

=======
		
		System.out.println("person is studying");
		
	}
	
>>>>>>> 24de017... Initial commit
}
