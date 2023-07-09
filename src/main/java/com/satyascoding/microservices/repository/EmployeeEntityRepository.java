package com.satyascoding.microservices.repository;

import com.satyascoding.microservices.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeEntityRepository extends JpaRepository<EmployeeEntity, String> {
}
