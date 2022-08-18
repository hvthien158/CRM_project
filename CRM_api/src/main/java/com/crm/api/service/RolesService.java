package com.crm.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.api.entity.Roles;
import com.crm.api.repository.RolesRepository;

@Service
public class RolesService implements RolesServiceImp {

	@Autowired
	RolesRepository repository;
	
	@Override
	public List<Roles> findAllRoles() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
