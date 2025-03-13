package com.ihsandedec.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ihsandedec.dto.DtoCourse;
import com.ihsandedec.dto.DtoStudent;
import com.ihsandedec.dto.DtoStudentIU;
import com.ihsandedec.entites.Course;
import com.ihsandedec.entites.Student;
import com.ihsandedec.repository.IStudentRepository;
import com.ihsandedec.services.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private IStudentRepository studentRepository;

	@Override
	public DtoStudent saveStudent(DtoStudentIU dtoStudentIU) {
		DtoStudent responseDtoStudent = new DtoStudent();
		Student student = new Student();

		BeanUtils.copyProperties(dtoStudentIU, student);
		Student dbStudent = studentRepository.save(student);

		BeanUtils.copyProperties(dbStudent, responseDtoStudent);
		return responseDtoStudent;
	}

	@Override
	public List<DtoStudent> getAllStudents() {
		List<DtoStudent> dtoList = new ArrayList<>();
		List<Student> studentsList = studentRepository.findAll();

		for (Student student : studentsList) {
			DtoStudent dto = new DtoStudent();
			BeanUtils.copyProperties(student, dto);
			dtoList.add(dto);
		}

		return dtoList;
	}

	@Override
	public DtoStudent getStudentById(Integer id) {
		DtoStudent dtoStudent = new DtoStudent();

		Optional<Student> optional = studentRepository.findById(id);

		if (optional.isEmpty()) {

			return null;
			
		}
		Student dbStudent = optional.get();
		BeanUtils.copyProperties(dbStudent, dtoStudent);

		if (dbStudent.getCourses() != null && !dbStudent.getCourses().isEmpty()) {
			for (Course course : dbStudent.getCourses()) {
				DtoCourse dtoCourse = new DtoCourse();
				BeanUtils.copyProperties(course, dtoCourse);
				dtoStudent.getCourses().add(dtoCourse);
			}
		}

		return dtoStudent;
	}

	@Override
	public void deleteStudent(Integer id) {
		// Direk veritabanından çekilmiş studenti silebilriiz.o yüzden dto kullanmadık.
		Optional<Student> optional = studentRepository.findById(id);
		if (optional.isPresent()) {
			studentRepository.delete(optional.get());
		}
	}

	@Override
	public DtoStudent updateStudent(Integer id, DtoStudentIU dtoStudentIU) {
		DtoStudent dtoStudent = new DtoStudent();

		Optional<Student> optional = studentRepository.findById(id);
		if (optional.isPresent()) {
			Student dbStudent = optional.get();
			dbStudent.setFirstName(dtoStudentIU.getFirstName());
			dbStudent.setLastName(dtoStudentIU.getLastName());
			dbStudent.setBirthOfDate(dtoStudentIU.getBirthOfDate());

			Student updatedStudent = studentRepository.save(dbStudent);

			BeanUtils.copyProperties(updatedStudent, dtoStudent);
			return dtoStudent;
		}
		return null;

		/*
		 * DTO ya çevirmeden önce yaptığım işlem Student dbStudent = getStudentById(id);
		 * if (dbStudent != null) { dbStudent.setFirstName(newStudent.getFirstName());
		 * dbStudent.setLastName(newStudent.getLastName());
		 * dbStudent.setBirthOfDate(newStudent.getBirthOfDate());
		 * 
		 * return studentRepository.save(dbStudent); } return null;
		 */

	}

}
