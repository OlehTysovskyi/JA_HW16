package source.dao.impl;

import java.util.ArrayList;
import java.util.List;

import source.dao.StudentDao;
import source.domain.Student;

public class StudentDaoImpl implements StudentDao {

	private List<Student> students;

	public StudentDaoImpl() {
		students = new ArrayList<>();
	}

	@Override
	public void create(Student student) {
		students.add(student);
	}

	@Override
	public Student read(int id) {
		return students.get(id);
	}

	@Override
	public void update(Student student) {
		students.set(student.getId() - 1, student);

	}

	@Override
	public void delete(int id) {
		students.remove(id);
	}

}
