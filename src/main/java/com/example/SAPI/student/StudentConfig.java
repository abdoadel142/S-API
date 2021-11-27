package com.example.SAPI.student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository
    ){
        return args -> {
           Student adel =  new Student(1l,
                    "adel",
                    "aa",
                    LocalDate.of(2000, Month.JANUARY,2));
            Student mariam =  new Student(2l,
                    "mariam",
                    "mm",
                    LocalDate.of(2004, Month.JANUARY,5));

            repository.saveAll(List.of(adel, mariam));
        };

    }

}
