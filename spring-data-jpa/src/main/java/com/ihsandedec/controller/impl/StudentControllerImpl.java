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
import com.ihsandedec.dto.DtoStudent;
import com.ihsandedec.dto.DtoStudentIU;
import com.ihsandedec.services.IStudentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/rest/api/student")
public class StudentControllerImpl implements IStudentController{
	
	@Autowired
	private IStudentService studentService;

	@PostMapping(path = "/save")
	@Override
	public DtoStudent saveStudent(@RequestBody @Valid DtoStudentIU dtoStudentIU) {
		
		return studentService.saveStudent( dtoStudentIU);
		
	}
	
	@GetMapping(path = "/getAllList")
	@Override
	public List<DtoStudent> getAllStudents() {
		return studentService.getAllStudents();
		
	}
	
	
	@Override
	@GetMapping(path = "/list/{id}")
	public DtoStudent getStudentById(@PathVariable(name = "id", required = true) Integer id) {
		
		return studentService.getStudentById(id);
	}

	@Override
	@DeleteMapping(path = "/delete/{id}")
	public void deleteStudent(@PathVariable(name = "id") Integer id) {
		studentService.deleteStudent(id);
	}

	@Override
	@PutMapping(path = "/update/{id}")
	public DtoStudent updateStudent(@PathVariable(name = "id") Integer id,@RequestBody DtoStudentIU dtoStudentIU) {
		
		return studentService.updateStudent(id, dtoStudentIU) ;
	}
	
	

}
