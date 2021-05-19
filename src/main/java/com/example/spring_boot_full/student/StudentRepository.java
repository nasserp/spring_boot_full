package com.example.spring_boot_full.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student ,Long> {

    Optional<Student> findStudentByEmil(String email);

}
