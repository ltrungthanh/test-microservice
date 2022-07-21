/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vnpt.test.testmicroservice.repository;

import com.vnpt.test.testmicroservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author MSI
 */
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

    public Department findDepartmentById(Long departmentId);
    
}
