package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{
    @Query(value = "Select r.id from Role r where r.id = (Select max(r.level) from Role r)", nativeQuery = true)

    public Integer findByLevelRole();
}
