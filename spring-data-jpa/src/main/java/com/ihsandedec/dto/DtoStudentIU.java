package com.ihsandedec.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoStudentIU {
	
	@NotEmpty(message = "First Name alanı boş bırakılamaz")
	@Min(value = 3, message = "firstname minimum 3 karakter olmalı")
	@Max(value = 10, message = "firstname maximum 10 karakter olmalı")
	private String firstName;
	
	@Size(min = 3, max = 30, message =  "lastname min 3 max 30 karakter olmalı")
	private String lastName;
	
	@JsonFormat(pattern="dd.MM.yyyy")
	private Date birthOfDate;
	
	@Email(message = "Email formatında giriş yapınız")
	private String email;
	
	@Size(max = 11, min = 11, message = "11 karakter giriniz")
	@NotEmpty(message = "Tckn alanı boş geçilemez")
	private Integer tckn;
}
