package com.ihsandedec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ihsandedec.entites.Student;

public interface IStudentRepository extends JpaRepository<Student, Integer>{
	
	//Buraya kendi özel metodlarımızı yazıyoruz

}
