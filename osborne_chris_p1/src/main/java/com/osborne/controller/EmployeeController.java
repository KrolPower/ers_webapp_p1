package com.osborne.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.osborne.exception.ResourceNotFoundException;
import com.osborne.model.Employee;
import com.osborne.repository.EmployeeRepository;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	

	@GetMapping("employees")
	public List<Employee> getAllEmployee(){
		/*
		 * returns list of all employees
		 */
		return this.employeeRepository.findAll();
	}
	

    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable(value = "id") Long employeeId)
		/*
		 * returns an employees details by their ID
		 */
        throws ResourceNotFoundException {
        Employee employee = employeeRepository.findById(employeeId)
        .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));
        return ResponseEntity.ok().body(employee);
    }
	

    @GetMapping({ "employees/{id}/homepage" })
	public String viewEmployeeHomepage(@PathVariable(value = "id") Long employeeId)
		/*
		 * directs to the employees home-page based on the employees ID
		 */
	    throws ResourceNotFoundException {
	    Employee employee = employeeRepository.findById(employeeId)
	    .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));
	    
	    String display = "Viewing Employee Homepage as Employee: ";
	    String display2 = ", With an Employee ID of: ";
	    return display + (employee.getFirstName()) + display2 + (employee.getId()) + ".";
	}
    

    @GetMapping({ "employees/{id}/logout" })
	public String logoutEmployee(@PathVariable(value = "id") Long employeeId)
		/*
		 * directs to the employees logout page based on the employees ID
		 */
	    throws ResourceNotFoundException {
	    Employee employee = employeeRepository.findById(employeeId)
	    .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));
	    
	    String display = "Logged out as Employee: ";
	    String display2 = ", With an Employee ID of: ";
	    return display + (employee.getFirstName()) + display2 + (employee.getId()) + ".";
	}
    

    @PostMapping("employees")
	public Employee createEmployee(@RequestBody Employee employee) {
		/*
		 * registers a new employee
		 */
		return this.employeeRepository.save(employee);
	}
	

    @PutMapping("/employees/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable(value = "id") Long employeeId,
		/*
		 * updates employee based on the employees ID
		 */
        @Valid @RequestBody Employee employeeDetails) throws ResourceNotFoundException {
        Employee employee = employeeRepository.findById(employeeId)
        .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));

        employee.setEmail(employeeDetails.getEmail());
        employee.setLastName(employeeDetails.getLastName());
        employee.setFirstName(employeeDetails.getFirstName());
        employee.setUserName(employeeDetails.getUserName());
        employee.setPassword(employeeDetails.getPassword());
        final Employee updatedEmployee = employeeRepository.save(employee);
        return ResponseEntity.ok(updatedEmployee);
    }
	

    @DeleteMapping("/employees/{id}")
    public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long employeeId)
		/*
		 * deletes an employee from the database
		 */
        throws ResourceNotFoundException {
        Employee employee = employeeRepository.findById(employeeId)
       .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));

        employeeRepository.delete(employee);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}
