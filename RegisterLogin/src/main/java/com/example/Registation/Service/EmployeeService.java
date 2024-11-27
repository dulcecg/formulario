package com.example.Registation.Service;

import org.springframework.stereotype.Service;

import com.example.Registation.Dto.EmployeeDTO;
import com.example.Registation.Dto.LoginDTO;
import com.example.Registation.response.LoginResponse;

@Service
public interface EmployeeService {
    String addEmployee(EmployeeDTO employeeDTO);

    LoginResponse loginEmployee(LoginDTO loginDTO);

}
