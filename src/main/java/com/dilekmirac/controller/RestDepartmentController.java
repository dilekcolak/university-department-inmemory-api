package com.dilekmirac.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dilekmirac.model.UniversityDepartment;
import com.dilekmirac.service.DepartmentService;

@RestController
@RequestMapping(path = "/rest/api/departments")
public class RestDepartmentController {
	
	@Autowired
	DepartmentService departmentService;
	
	@GetMapping(path = "")
	public List<UniversityDepartment> getAllDepartments(){
		return departmentService.getAllDepartments();
		
	}
	
	@GetMapping(path = "/{id}")
	public UniversityDepartment findDepartmentById(@PathVariable(name = "id") Integer id){
		return departmentService.findDepartmentById(id);
	}
	
	@GetMapping("/by-department/{departmentName}")
	public List<UniversityDepartment> findDepartmentsByName(@PathVariable(name = "departmentName") String department){
		return departmentService.findDepartmentsByName(department);
	}
	
	@GetMapping(path = "/by-university/{uniName}")
	public List<UniversityDepartment> findDepartmentsByUniversityName(@PathVariable(name = "uniName") String university){
		return departmentService.findDepartmentsByUniversityName(university);
	}
	
	@GetMapping(path = "/search")
	public List<UniversityDepartment> findDepartmentsByFacultyOrCity(@RequestParam(name = "facultyName", required = false) String faculty, 
																@RequestParam(name = "city", required = false)String city){
		return departmentService.findDepartmentsByFacultyOrCity(faculty, city);
	}
	
	@PostMapping(path = "")
	public boolean addDepartment(@RequestBody UniversityDepartment UniversityDepartment) {
		return departmentService.addDepartment(UniversityDepartment);
	}
	
	@PutMapping(path = "/{id}")
	public UniversityDepartment updateDepartment(@PathVariable(name = "id") Integer id, @RequestBody UniversityDepartment updatedDepartment) {
		return departmentService.updateDepartment(id, updatedDepartment);
	}
	
	@DeleteMapping(path = "/{id}")
	public boolean deleteDepartment(@PathVariable(name = "id") Integer id) {
		return departmentService.deleteDepartment(id);
	}


}