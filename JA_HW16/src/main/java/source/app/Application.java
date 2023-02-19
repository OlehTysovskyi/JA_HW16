package source.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import source.dao.impl.StudentDaoImpl;
import source.domain.Student;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);

		StudentDaoImpl student = (StudentDaoImpl) ctx.getBean("student");
		ConsoleEventLogger cel = (ConsoleEventLogger) ctx.getBean("consoleEventLogger");

		student.create(new Student(1, "Oleh", 23));
		cel.logEvent(student.read(0).toString());

		student.update(new Student(1, "Bohdan", 24));
		cel.logEvent(student.read(0).toString());

		student.delete(0);

	}

}
