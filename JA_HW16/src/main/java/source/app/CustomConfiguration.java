package source.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import source.dao.impl.StudentDaoImpl;

@Configuration
public class CustomConfiguration {

	@Bean(name = "student")
	public StudentDaoImpl getStudent() {
		StudentDaoImpl studentDaoImpl = new StudentDaoImpl();
		return studentDaoImpl;
	}

	@Bean(name = "consoleEventLogger")
	public ConsoleEventLogger getConsoleEventLogger() {
		return new ConsoleEventLogger();
	}
}
