package io.github.jhipster.sample.repository;

import io.github.jhipster.sample.domain.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Spring Data JPA repository for the Employee entity.
 */
@SuppressWarnings("unused")
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    @Query("select e from Employee e where e.manager.id = :employeeId")
    Page<Employee> getAllDirectReports(@Param("employeeId") Long employeeId, @Param("pageable") Pageable pageable);

}
