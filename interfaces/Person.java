package interfaces;

public class Person implements Student, YouTuber {

	public static void main(String[] args) {

		Person obj = new Person();
		obj.makeVideo();
		obj.study();

		YouTuber x = obj;
		x.makeVideo();

	}

	@Override
	public void makeVideo() {

		System.out.println("person is making video");

	}

	@Override
	public void study() {

		System.out.println("person is studying");

	}

}
