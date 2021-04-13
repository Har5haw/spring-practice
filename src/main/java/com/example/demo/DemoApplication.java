package com.example.demo;

import com.example.demo.relationShips.entity.Subject;
import com.example.demo.relationShips.entity.Teacher;
import com.example.demo.relationShips.entity.TeacherDetails;
import com.example.demo.relationShips.repositories.TeacherRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);

		/*TeacherRepository teacherRepository = (TeacherRepository) applicationContext.getBean("teacherRepository");
		Teacher teacher = new Teacher("shaw", "vardhan");
		Subject subject = new Subject("JavaScript");
		TeacherDetails teacherDetails = new TeacherDetails(21, 1);

		teacher.add(subject);
		teacher.setTeacherDetails(teacherDetails);

		teacherRepository.save(teacher);*/
	}
}
