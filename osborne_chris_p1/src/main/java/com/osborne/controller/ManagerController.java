package com.osborne.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.apache.log4j.Logger;
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

import com.osborne.Application;
import com.osborne.exception.ResourceNotFoundException;
import com.osborne.model.Employee;
import com.osborne.model.Manager;
import com.osborne.repository.EmployeeRepository;
import com.osborne.repository.ManagerRepository;

@RestController
@RequestMapping("/api/v1/")
public class ManagerController {
	private static Logger logger = Logger.getLogger(Application.class);
	
	@Autowired
	private ManagerRepository managerRepository;
	
	// for viewing all employees as a manager
	@Autowired
	private EmployeeRepository employeeRepository;
	

	@GetMapping("managers")
	public List<Manager> getAllManager(){
		/*
		 * returns list of all managers
		 */
		logger.trace("In getAllManager");
		logger.trace("Managers Retrieved");
		return this.managerRepository.findAll();
	}
	
	
    @GetMapping("/managers/{id}")
    public ResponseEntity<Manager> getManagerById(@PathVariable(value = "id") Long managerId)
		/*
		 * returns a managers details by their ID
		 */
        throws ResourceNotFoundException {
    	logger.trace("In getManagerById");
    	Manager manager = managerRepository.findById(managerId)
          .orElseThrow(() -> new ResourceNotFoundException("Manager not found for this id :: " + managerId));
    	logger.trace("Manager By ID Retrieved");
        return ResponseEntity.ok().body(manager);
    }
	

    @PostMapping("managers")
	public Manager createManager(@RequestBody Manager manager) {
		/*
		 * registers a new manager
		 */
    	logger.trace("In createManager");
    	logger.trace("Manager Created");
		return this.managerRepository.save(manager);
	}
    

	@RequestMapping({ "managers/id/homepage" })
	public String viewManagerHomepage() {
		/*
		 * directs to the managers home-page based on the managers ID
		 */

		
		
		
		
		return "Viewing Manager Homepage";
	}
	

	@RequestMapping({ "managers/id/logout" })
	public String logoutManager() {
		/*
		 * directs to the managers logout page based on the managers ID
		 */

		
		
		
		
		
		return "Manager Logged Out";
	}
		

    @PutMapping("/managers/{id}")
    public ResponseEntity<Manager> updateManager(@PathVariable(value = "id") Long managerId,
		/*
		 * updates manager based on the managers ID
		 */
		@Valid @RequestBody Manager managerDetails) throws ResourceNotFoundException {
    	logger.trace("In updateManager");
    	Manager manager = managerRepository.findById(managerId)
        .orElseThrow(() -> new ResourceNotFoundException("Manager not found for this id :: " + managerId));
    	logger.trace("Manager not found for this id :: " + managerId);

    	manager.setEmail(managerDetails.getEmail());
    	manager.setLastName(managerDetails.getLastName());
    	manager.setFirstName(managerDetails.getFirstName());
    	manager.setUserName(managerDetails.getUserName());
    	manager.setPassword(managerDetails.getPassword());
        final Manager updatedManager = managerRepository.save(manager);
        logger.trace("Manager Updated");
        return ResponseEntity.ok(updatedManager);
    }
	

	@GetMapping("managers/id/employees")
	public List<Employee> getAllEmployees(){
		/*
		 * returns list of all employees to the viewing manager
		 */
		logger.trace("In getAllManager");
		logger.trace("Managers Retrieved");
		return this.employeeRepository.findAll();
	}
    

    @DeleteMapping("/managers/{id}")
    public Map<String, Boolean> deleteManager(@PathVariable(value = "id") Long managerId)
		/*
		 * deletes an manager from the database
		 */
		throws ResourceNotFoundException {
    	logger.trace("In deleteManager");
    	Manager manager = managerRepository.findById(managerId)
       .orElseThrow(() -> new ResourceNotFoundException("Manager not found for this id :: " + managerId));

    	managerRepository.delete(manager);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        logger.trace("Manager Deleted");
        return response;
    }
}
