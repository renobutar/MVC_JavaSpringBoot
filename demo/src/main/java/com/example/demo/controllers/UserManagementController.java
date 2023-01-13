package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Services.EmployeeService;
import com.example.demo.Services.RoleService;
import com.example.demo.Services.UserService;

@Controller
@RequestMapping("userManagement")
public class UserManagementController {

    @Autowired
    private UserService userService;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private RoleService roleService;

    
}
