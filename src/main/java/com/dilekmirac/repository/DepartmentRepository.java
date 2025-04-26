package com.dilekmirac.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.dilekmirac.model.UniversityDepartment;

@Repository
public class DepartmentRepository {

	
	@Autowired
	private List<UniversityDepartment> departmentList;
	
	public List<UniversityDepartment> getAllDepartments(){
		return departmentList;
	}
	
	public UniversityDepartment findDepartmentById(Integer id){
		UniversityDepartment foundUni = null;
		for (UniversityDepartment university : departmentList) {
			if(university.getId() == id) {
				foundUni = university;
			}
		}
		return foundUni;
	}
	
	public List<UniversityDepartment> findDepartmentsByName(String department){
		List<UniversityDepartment> filteredDepartments = new ArrayList<>();
		
		for (UniversityDepartment universityDepartment : departmentList) {
			if(universityDepartment.getDepartmentName().equalsIgnoreCase(department)){
				filteredDepartments.add(universityDepartment);
			}
		}
		
		return filteredDepartments;
	}

	public List<UniversityDepartment> findDepartmentsByUniversityName(String university){
		List<UniversityDepartment> filteredUniversities = new ArrayList<>();
		
		for (UniversityDepartment universityDepartment : departmentList) {
			if (universityDepartment.getUniversityName().equalsIgnoreCase(university)) {
				filteredUniversities.add(universityDepartment);
			}
		}
		
		return filteredUniversities;
	}
	
	public List<UniversityDepartment> findDepartmentsByFacultyOrCity(String faculty, String city){
		List<UniversityDepartment> filteredDepartments = new ArrayList<>();
		
		for (UniversityDepartment university : departmentList) {
			if(faculty != null && city != null) {
				if(university.getCity().equalsIgnoreCase(city) && university.getFacultyName().equalsIgnoreCase(faculty)) {
					filteredDepartments.add(university);
				}
			}else if(faculty == null && city != null) {
				if(university.getCity().equalsIgnoreCase(city)) {
					filteredDepartments.add(university);
				}
			}else if(faculty != null && city == null) {
				if(university.getFacultyName().equalsIgnoreCase(faculty)) {
					filteredDepartments.add(university);
				}
			}else {
				return departmentList;
			}
		}
		
	 return filteredDepartments;
		
	}
	
	public boolean addDepartment(UniversityDepartment newDepartment) {
		for (UniversityDepartment university : departmentList) {
			if (newDepartment.getId() == null || newDepartment.getId() == university.getId()) {
				return false; //eklenmek istenen bölüm mevcutsa tekrar listeye eklemeyi önlemek için
			}
		}
		
		departmentList.add(newDepartment);
		return true;
		
	}
	
	public UniversityDepartment updateDepartment(Integer id, UniversityDepartment updatedDepartment) {
		if(id == updatedDepartment.getId()) {
			for (UniversityDepartment university : departmentList) {
				if(university.getId() == id) {
					departmentList.remove(university);
					departmentList.add(updatedDepartment);
					return updatedDepartment;
				}
			}
		}
		
		return null;
	}
	
	public boolean deleteDepartment(Integer id) {
		for (UniversityDepartment universityDepartment : departmentList) {
			if(universityDepartment.getId() == id) {
				departmentList.remove(universityDepartment);
				return true;
			}
		}
		return false;
	}

}
