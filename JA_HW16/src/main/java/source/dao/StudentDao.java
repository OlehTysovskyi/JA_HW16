package source.dao;

import source.domain.Student;

public interface StudentDao {
	
	void create(Student student);

	Student read(int id);

	void update(Student student);

	void delete(int id);

}
