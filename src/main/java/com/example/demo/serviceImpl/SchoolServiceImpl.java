package com.example.demo.serviceImpl;

import com.example.demo.DTO.ResponseDTO;
import com.example.demo.Entity.Doctor;
import com.example.demo.Entity.School;
import com.example.demo.Repository.SchoolRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class SchoolServiceImpl {
    @Autowired
    SchoolRepo schoolRepo;

    public ResponseDTO getAllSchools() {
        ResponseDTO responseDTO = new ResponseDTO();
        try {
            List<School> schoolsList = schoolRepo.findAll();
            responseDTO.setStatus(true);
            responseDTO.setData(schoolsList);
            responseDTO.setMessage("schools Fetched Successfully");
            responseDTO.setStatusCode(200);

        } catch (Exception e) {
            e.printStackTrace();
            responseDTO.setStatus(false);
            responseDTO.setData(new ArrayList<>());
            responseDTO.setMessage("Exception Occured");
            responseDTO.setStatusCode(500);
        } finally {
            return responseDTO;
        }
    }
}
