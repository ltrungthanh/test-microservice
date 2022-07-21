/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vnpt.test.testmicroservice.controller;

import com.vnpt.test.testmicroservice.entity.Department;
import com.vnpt.test.testmicroservice.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author MSI
 */
@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
    
    @Autowired
    private DepartmentService departmentService;
    
    @PostMapping("/saveDepartment")
    public Department saveDepartment(@RequestBody Department department){
        log.info("saveDepartment");
        return departmentService.saveDepartment(department);
    }
    
    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId){
        log.info("findDepartmentById");
        return departmentService.findDepartmentById(departmentId);
    }
}
