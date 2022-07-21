/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vnpt.test.testmicroservice.service;

import com.vnpt.test.testmicroservice.entity.Department;
import com.vnpt.test.testmicroservice.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author MSI
 */
@Service
public class DepartmentService {
    
    @Autowired
    private DepartmentRepository departmentRepository;
    
    public Department saveDepartment(Department department){
        return departmentRepository.save(department);
    }
    
    public Department findDepartmentById(Long departmentId){
        return departmentRepository.findDepartmentById(departmentId);
    }
}
