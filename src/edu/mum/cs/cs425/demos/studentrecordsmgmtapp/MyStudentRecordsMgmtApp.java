package edu.mum.cs.cs425.demos.studentrecordsmgmtapp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model.Student;

public class MyStudentRecordsMgmtApp {
	
	
	public static void printListOfStudents(Student[] stds){
		List<Student> students2 = Stream.of(stds).sorted(
				Comparator.comparing(Student::getName))
				.collect(Collectors.toList());
		students2.forEach(System.out::println);
				
		System.out.println(".................\n");
	}
public static List<Student> getListOfPlatinumAlumniStudents(Student[] stds) {
		List<Student> students2 =	Stream.of(stds).
				filter((x)-> LocalDate.now().getYear()-x.getDateOfAdmission().getYear()>=30)
		.sorted(Comparator.comparing((Student::getDateOfAdmission))
				.reversed()).collect(Collectors.toList());	
	
	return students2;
}
public static void main(String[] args) {
	
	Student[] stds= {new Student("110001","Dave",1951,11,1),new Student("110002","Anna",1990,12,7),new Student("110003","Erica",1974,1,31),new Student("110004","Carlos",2009,8,22),new Student("110005","Bob",1990,3,5)};
	
	printListOfStudents(stds);
	
	System.out.println("list of students in the PlatinumAlumni list"+getListOfPlatinumAlumniStudents(stds));
}
}
