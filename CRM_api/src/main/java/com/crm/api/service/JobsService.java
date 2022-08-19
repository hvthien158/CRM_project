package com.crm.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.api.entity.Jobs;
import com.crm.api.repository.JobsRepository;

@Service
public class JobsService implements JobsServiceImp {

	@Autowired
	JobsRepository jobsRepository;
	
	@Override
	public List<Jobs> findAllJobs() {
		// TODO Auto-generated method stub
		return jobsRepository.findAll();
	}

}
