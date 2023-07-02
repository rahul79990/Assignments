package com.uem.UniversityEventManagement.repository;

import com.uem.UniversityEventManagement.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student , Long> {
}
