package com.example.demo.repositories;

import com.example.demo.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
    @Query(value = "Select e.id from Employee e Where e.email = ?1", nativeQuery = true)

    public Integer findIdByEmail(String Email);
}
