package net.javaguides.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.sms.entity.Student;
import net.javaguides.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentmanagementsystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentmanagementsystemApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception{
		
	   /* Student student1 = new Student("nagul", "L", "nagul@gmail.com");
		studentRepository.save(student1);		
		
		Student student2 = new Student("ram", "s", "ram@gmail.com");
		studentRepository.save(student2);		
		
		Student student3 =new Student("ravi", "a", "ravi@gmail.com");
		studentRepository.save(student3);
		*/
				
	}
	

}
