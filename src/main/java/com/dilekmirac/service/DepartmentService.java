package com.dilekmirac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dilekmirac.model.UniversityDepartment;
import com.dilekmirac.repository.DepartmentRepository;


@Service
public class DepartmentService {
	
	@Autowired
	DepartmentRepository departmentRepository;
	
	public List<UniversityDepartment> getAllDepartments(){
		return departmentRepository.getAllDepartments();
	}
	
	public UniversityDepartment findDepartmentById(Integer id){
		return departmentRepository.findDepartmentById(id);
	}
	
	public List<UniversityDepartment> findDepartmentsByName(String department){
		return departmentRepository.findDepartmentsByName(department);
	}

	public List<UniversityDepartment> findDepartmentsByUniversityName(String university){
		return departmentRepository.findDepartmentsByUniversityName(university);
	}
	
	public List<UniversityDepartment> findDepartmentsByFacultyOrCity(String faculty, String city){
		return departmentRepository.findDepartmentsByFacultyOrCity(faculty, city);
	}
	
	public boolean addDepartment(UniversityDepartment newDepartment) {
		return departmentRepository.addDepartment(newDepartment);
	}
	
	public UniversityDepartment updateDepartment(Integer id, UniversityDepartment updatedDepartment) {
		return departmentRepository.updateDepartment(id, updatedDepartment);
	}
	
	public boolean deleteDepartment(Integer id) {
		return departmentRepository.deleteDepartment(id);
	}

}
