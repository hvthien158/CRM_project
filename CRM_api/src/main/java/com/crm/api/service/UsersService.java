package com.crm.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.api.entity.Users;
import com.crm.api.repository.UsersRepository;

@Service
public class UsersService implements UsersServiceImp{

	@Autowired
	UsersRepository usersRepository;
	
	@Override
	public List<Users> findAllUsers() {
		// TODO Auto-generated method stub
		return usersRepository.findAll();
	}

}
