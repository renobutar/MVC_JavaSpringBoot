package com.example.demo.repositories;

import com.example.demo.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
    @Query(value = "Select e.id from Employee e Where e.email = ?1", nativeQuery = true)

    public Integer findIdByEmail(String Email);

    @Query(value = "Select e.email, u.password from employee e join user u on e.id = u.id where e.email = ?1 && u.password= ?2", nativeQuery = true)

    public String findEmailAndPassword(String Email, String password);
}
