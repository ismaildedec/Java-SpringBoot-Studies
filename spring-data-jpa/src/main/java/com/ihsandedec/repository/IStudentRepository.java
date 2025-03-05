package com.ihsandedec.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ihsandedec.entites.Student;

public interface IStudentRepository extends JpaRepository<Student, Integer>{
	
	//Buraya kendi özel metodlarımızı yazıyoruz
	
	//HQL : Sınıfın ismi ve değişken isimleri kullanılarak sorgular yazılır 
	//@Query(value = "from Student" , nativeQuery = false)
	
	//SQL: Tablo ismi ve tablo içerisindeki değişken isimleri kullanılır.
	@Query(value = "select * from student.student" , nativeQuery = true)
	List<Student> findAllStudents();
	
	@Query(value = "from Student s WHERE s.id= :studentId")
	Optional<Student> findStudentById(Integer studentId);
	
	

}
