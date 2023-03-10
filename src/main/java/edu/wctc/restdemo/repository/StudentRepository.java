package edu.wctc.restdemo.repository;

import edu.wctc.restdemo.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {
}
