package com.ihsandedec.configuration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataSource {
	
	
	private String url;
	
	
	private String userName;
	
	
	private String password;
}
