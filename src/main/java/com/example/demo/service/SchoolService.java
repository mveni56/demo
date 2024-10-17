package com.example.demo.service;

import com.example.demo.DTO.ResponseDTO;
import org.springframework.stereotype.Service;

@Service
public interface SchoolService {

    ResponseDTO getAllSchools();

}
