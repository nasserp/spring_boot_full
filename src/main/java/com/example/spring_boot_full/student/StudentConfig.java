package com.example.spring_boot_full.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentConfig(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Bean
    CommandLineRunner commandLineRunner(){
        return args -> {
                            Student student1=new Student(1L,"nasser",
                            LocalDate.of(1985, Month.MARCH,1),
                            "naser@yahoo.com");
            Student student2=new Student(1L,"omid",
                    LocalDate.of(1988, Month.MARCH,1),
                    "naser@yahoo.com");

            studentRepository.saveAll(List.of(student1,student2));
        };
    }
}
