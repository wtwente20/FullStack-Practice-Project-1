package tech.wtwente.employeemanager.model.data;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.wtwente.employeemanager.model.Employee;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
