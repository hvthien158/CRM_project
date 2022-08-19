package com.crm.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.api.entity.Tasks;
import com.crm.api.repository.TasksRepository;

@Service
public class TasksService implements TasksServiceImp {

	@Autowired
	TasksRepository tasksRepository;
	
	@Override
	public List<Tasks> findAllTasks() {
		// TODO Auto-generated method stub
		return tasksRepository.findAll();
	}

}
