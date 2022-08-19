package com.crm.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crm.api.entity.Jobs;

@Repository
public interface JobsRepository extends JpaRepository<Jobs, Integer> {

}
