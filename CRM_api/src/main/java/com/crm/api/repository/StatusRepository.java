package com.crm.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crm.api.entity.Status;

@Repository
public interface StatusRepository extends JpaRepository<Status, Integer> {

}
