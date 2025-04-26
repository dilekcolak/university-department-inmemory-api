package com.dilekmirac.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UniversityDepartment {
	
	private Integer id;
	private String universityName;
	private String facultyName;
	private String departmentName;
	private String scoreType;
	private Double baseScore;
	private Integer minSuccessRank;
	private Integer quota;
	private String city;
	private Boolean isPublicUniversity;

}
