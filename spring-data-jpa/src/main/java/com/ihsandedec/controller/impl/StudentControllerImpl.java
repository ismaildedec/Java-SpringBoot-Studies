package com.ihsandedec.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ihsandedec.controller.IStudentController;
import com.ihsandedec.entites.Student;
import com.ihsandedec.services.IStudentService;

@RestController
@RequestMapping("/rest/api/student")
public class StudentControllerImpl implements IStudentController{
	
	@Autowired
	private IStudentService studentService;

	@PostMapping(path = "/save")
	@Override
	public Student saveStudent(@RequestBody Student student) {
		
		return studentService.saveStudent(student);
		
	}
	
	@GetMapping(path = "/getAllList")
	@Override
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
		
	}
	
	
	@Override
	@GetMapping(path = "/list/{id}")
	public Student getStudentById(@PathVariable(name = "id", required = true) Integer id) {
		
		return studentService.getStudentById(id);
	}

	@Override
	@DeleteMapping(path = "/delete/{id}")
	public void deleteStudent(@PathVariable(name = "id") Integer id) {
		studentService.deleteStudent(id);
	}

	@Override
	@PutMapping(path = "/update/{id}")
	public Student updateStudent(@PathVariable(name = "id") Integer id,@RequestBody Student newStudent) {
		
		return studentService.updateStudent(id, newStudent);
	}
	
	

}
