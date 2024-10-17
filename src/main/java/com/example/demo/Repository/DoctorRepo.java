package com.example.demo.Repository;


import com.example.demo.Entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DoctorRepo extends JpaRepository<Doctor, Integer> {
    List<Doctor> findAllById(Iterable<Integer> integers);

    @Override
    List<Doctor> findAll();
}
