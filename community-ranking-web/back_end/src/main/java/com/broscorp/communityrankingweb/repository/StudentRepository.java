package com.broscorp.communityrankingweb.repository;

import com.broscorp.communityrankingweb.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
