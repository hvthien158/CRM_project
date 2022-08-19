package com.crm.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.api.entity.Status;
import com.crm.api.repository.StatusRepository;

@Service
public class StatusService implements StatusServiceImp {

	@Autowired
	StatusRepository statusRepository;
	
	@Override
	public List<Status> findAllStatus() {
		// TODO Auto-generated method stub
		return statusRepository.findAll();
	}

}
