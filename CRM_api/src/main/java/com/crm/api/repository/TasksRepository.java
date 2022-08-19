package com.crm.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crm.api.entity.Tasks;

@Repository
public interface TasksRepository extends JpaRepository<Tasks, Integer> {

}
