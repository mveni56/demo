package com.example.demo.Repository;

import com.example.demo.Entity.Doctor;
import com.example.demo.Entity.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SchoolRepo extends JpaRepository<School, Integer> {

    @Override
    List<School> findAll();
}
