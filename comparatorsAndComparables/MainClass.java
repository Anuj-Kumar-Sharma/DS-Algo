package comparatorsAndComparables;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();

		students.add(new Student(23, "Ram"));
		students.add(new Student(35, "Shaym"));
		students.add(new Student(83, "Aman"));
		students.add(new Student(13, "Rohit"));
		students.add(new Student(65, "Anuj"));

//		Collections.sort(students); // It accept a List type argument which must extends comparable

		students.forEach(System.out::println); // LAMBDA FUNCTION
		/*
		 * Here we are going inside the students , and iterating previously what we are
		 * doing is iterate inside the students and print its element one by one what
		 * lambda function does here-- the "println" function which is present inside
		 * "System.out", we used the student property on the student or whatever it is..
		 */

		// Lets suppose the student class do not extend the comparable then we can sort
		// it using comparator class in this way

		Collections.sort(students, new SortByNameThenMarks());
		students.forEach(System.out::println); // LAMBDA FUNCTION

		// LETS SUPPOSE I DONT WANT TO MAKE A SEPARATE NEW CLASS FOR COMPARATOR, THEN
		// HOW CAN WE DO IT???
		// BY USING AN anonymous CLASS , in this way

		Collections.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if (o1.name.equals(o2.name)) {
					return o1.marks - o2.marks;
				} else {
					return o1.name.compareTo(o2.name);
				}

			}

		});

		// AFTER JAVA -8 , LAMBDA FUNCTION INTRODUCED WHICH MAKE THIS ABOVE THING MORE
		// EASY
		Collections.sort(students, (o1, o2) -> {

			if (o1.name.equals(o2.name)) {
				return o1.marks - o2.marks;
			} else {
				return o1.name.compareTo(o2.name);
			}
		});

		/*
		 * ACCORDING TO LAMBDA FUNCTION , If we already know that the next argument is
		 * gonna be comparator, then we can ignore writing it We already know that the
		 * method is going to be "compare" so we can also ignore it the access modifiers
		 * and return type are also known so we can erase it too just one addition "->"
		 * to define lambda function Object type can also be removed because it is
		 * already known that which type of object it gonna be
		 */

		// IF WE WISH TO SORT IT ACCORDING TO NAME ONLY
		Collections.sort(students, (o1, o2) -> o1.name.compareTo(o2.name));

		// IF WE WISH TO SORT BY NAME USING KEY EXTRACTOR
		Collections.sort(students, Comparator.comparing(Student::getName)); // Comparator.comparing(keyExtractor)

		// IF WE WISH TO SORT BY NAME THEN MARKS
		Collections.sort(students, Comparator.comparing(Student::getName).thenComparing(Student::getMarks));

		// IF WE WANT TO REVERSE THE DEFINED SORTING ORDER WE CAN USE "reversed"
		// function
		Collections.sort(students, Comparator.comparing(Student::getName).thenComparing(Student::getMarks).reversed());
	}

}

// COMPARATORS CLASS
class SortByNameThenMarks implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if (o1.name.equals(o2.name)) {
			return o1.marks - o2.marks;
		} else {
			return o1.name.compareTo(o2.name);
		}

	}

}
