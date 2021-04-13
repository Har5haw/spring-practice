package com.example.demo.relationShips.repositories;

import com.example.demo.relationShips.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}
