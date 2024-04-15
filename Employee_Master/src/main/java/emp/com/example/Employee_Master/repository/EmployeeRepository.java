package emp.com.example.Employee_Master.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import emp.com.example.Employee_Master.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}