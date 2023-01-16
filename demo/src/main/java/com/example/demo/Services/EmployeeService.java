package com.example.demo.Services;
import java.util.List;

//import com.example.demo.dto.Register;
import com.example.demo.models.Employee;

public interface EmployeeService {
    public List<Employee> getALL();
    public Employee getById(Integer id);
    public Boolean save(Employee employee);
    // public Boolean register(Register register);
    public Boolean delete(Integer id);
    public Integer findIdByEmail(String Email);
    public String findEmailAndPassword(String email, String password);
}
