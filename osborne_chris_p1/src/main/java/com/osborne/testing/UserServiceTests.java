//
//package com.osborne.testing;
//
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.Order;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.test.annotation.Rollback;
//
//import com.osborne.model.Manager;
//import com.osborne.repository.ManagerDAO;
//
//import javax.sql.DataSource;
//import java.util.List;
//import java.util.Optional;
//
//
//@DataJpaTest
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//
//public class UserServiceTests {
//	
//	
//    @Autowired
//    private ManagerDAO employeeRepository;
//	
//	
//    // JUnit test for saveEmployee
//    @Test
//    @Order(1)
//    @Rollback(value = false)
//    public void saveManagerTest(){
//
//        Manager manager = Manager.builder()
//                .firstName("Ramesh")
//                .lastName("Fadatare")
//                .email("ramesh@gmail.com")
//                .build();
//
//        employeeRepository.save(manager);
//
//        Assertions.assertThat(manager.getId()).isGreaterThan(0);
//    }
//	
//	
//    @Test
//    @Order(2)
//    public void getManagerTest(){
//
//    	Manager manager = employeeRepository.findById(1L).get();
//
//        Assertions.assertThat(manager.getId()).isEqualTo(1L);
//
//    }
//
//    @Test
//    @Order(3)
//    public void getListOfManagersTest(){
//
//        List<Manager> manager = employeeRepository.findAll();
//
//        Assertions.assertThat(manager.size()).isGreaterThan(0);
//
//    }
//
//    @Test
//    @Order(4)
//    @Rollback(value = false)
//    public void updateManagerTest(){
//
//    	Manager manager = employeeRepository.findById(1L).get();
//
//    	manager.setEmail("ram@gmail.com");
//
//    	Manager employeeUpdated =  employeeRepository.save(manager);
//
//        Assertions.assertThat(employeeUpdated.getEmail()).isEqualTo("ram@gmail.com");
//
//    }
//
//    @Test
//    @Order(5)
//    @Rollback(value = false)
//    public void deleteManagerTest(){
//
//    	Manager manager = employeeRepository.findById(1L).get();
//
//        employeeRepository.delete(manager);
//
//        //employeeRepository.deleteById(1L);
//
//        Manager manager1 = null;
//
//        Optional<Manager> optionalEmployee = employeeRepository.findByEmail("ram@gmail.com");
//
//        if(optionalEmployee.isPresent()){
//        	manager1 = optionalEmployee.get();
//        }
//
//        Assertions.assertThat(manager1).isNull();
//    }
//
//	
//	
//	
//
//	
//}
//
//
//
//
//
