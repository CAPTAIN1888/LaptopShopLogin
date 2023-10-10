package com.RegisterLogin.Service;

import com.RegisterLogin.Dto.EmployeeDTO;
import com.RegisterLogin.Dto.LoginDTO;
import com.RegisterLogin.respose.LoginResponse;

public interface EmployeeService {
    String addEmployee(EmployeeDTO employeeDTO);

    LoginResponse loginEmployee(LoginDTO loginDTO);
}
