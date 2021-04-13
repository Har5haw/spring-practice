package com.example.demo.relationShips.repositories;

import com.example.demo.relationShips.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
