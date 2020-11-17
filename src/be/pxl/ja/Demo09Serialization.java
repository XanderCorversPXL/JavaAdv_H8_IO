package be.pxl.ja;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Demo09Serialization {

	public static void main(String[] args) {
		Student student = new Student("Mare", LocalDate.of(2000, 11, 29));
		student.setGraduationDate(LocalDate.of(2018, 6, 30));
		List<String> animals = Arrays.asList("elephant", "zebra", "donkey");
		try (FileOutputStream file = new FileOutputStream("resources/demo.ser");
		     ObjectOutputStream out = new ObjectOutputStream(file)) {
			out.writeObject(student);
			out.writeObject(animals);
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
}

