package com.ihsandedec.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ihsandedec.entites.Student;
import com.ihsandedec.repository.IStudentRepository;
import com.ihsandedec.services.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService{

	@Autowired
	private IStudentRepository studentRepository;
	
	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> studentsList =  studentRepository.findAll();
		return studentsList;
	}

	@Override
	public Student getStudentById(Integer id) {
		Optional<Student> optional =  studentRepository.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	@Override
	public void deleteStudent(Integer id) {
		
		Student dbStudent = getStudentById(id);
		if (dbStudent != null) {
			studentRepository.delete(dbStudent);
		}
		
	}

	@Override
	public Student updateStudent(Integer id, Student newStudent) {
		Student dbStudent = getStudentById(id);
		if (dbStudent != null) {
			dbStudent.setFirstName(newStudent.getFirstName());
			dbStudent.setLastName(newStudent.getLastName());
			dbStudent.setBirthOfDate(newStudent.getBirthOfDate());
			
			return studentRepository.save(dbStudent);
		}
		return null;

	}

}
