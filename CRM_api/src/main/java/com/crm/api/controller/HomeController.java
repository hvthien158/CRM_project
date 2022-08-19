package com.crm.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crm.api.entity.Jobs;
import com.crm.api.entity.Roles;
import com.crm.api.entity.Status;
import com.crm.api.entity.Tasks;
import com.crm.api.entity.Users;
import com.crm.api.service.JobsServiceImp;
import com.crm.api.service.RolesServiceImp;
import com.crm.api.service.StatusServiceImp;
import com.crm.api.service.TasksServiceImp;
import com.crm.api.service.UsersServiceImp;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	RolesServiceImp rolesServiceImp;
	
	@Autowired
	UsersServiceImp usersServiceImp;
	
	@Autowired
	JobsServiceImp jobsServiceImp;
	
	@Autowired
	StatusServiceImp statusServiceImp;
	
	@Autowired
	TasksServiceImp tasksServiceImp;
	
	@GetMapping("/roles")
	public ResponseEntity<?> getRoles(){
		return new ResponseEntity<List<Roles>>(rolesServiceImp.findAllRoles(), HttpStatus.OK);
	}
	
	@GetMapping("/users")
	public ResponseEntity<?> getUsers(){
		return new ResponseEntity<List<Users>>(usersServiceImp.findAllUsers(), HttpStatus.OK);
	}
	
	@GetMapping("/jobs")
	public ResponseEntity<?> getJobs(){
		return new ResponseEntity<List<Jobs>>(jobsServiceImp.findAllJobs(), HttpStatus.OK);
	}
	
	@GetMapping("/status")
	public ResponseEntity<?> getStatus(){
		return new ResponseEntity<List<Status>>(statusServiceImp.findAllStatus(), HttpStatus.OK);
	}
	
	@GetMapping("/tasks")
	public ResponseEntity<?> getTasks(){
		return new ResponseEntity<List<Tasks>>(tasksServiceImp.findAllTasks(), HttpStatus.OK);
	}
}
