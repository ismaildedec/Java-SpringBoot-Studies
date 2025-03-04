package com.ihsandedec.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoStudentIU {

	private String firstName;
	
	private String lastName;
	
	@JsonFormat(pattern="dd.MM.yyyy")
	private Date birthOfDate;
}
