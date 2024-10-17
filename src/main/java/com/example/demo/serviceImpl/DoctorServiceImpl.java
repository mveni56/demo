package com.example.demo.serviceImpl;

import com.example.demo.DTO.ResponseDTO;
import com.example.demo.Entity.Doctor;
import com.example.demo.Entity.Speciality;
import com.example.demo.Repository.DoctorRepo;
import com.example.demo.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    DoctorRepo doctorRepo;
    //@Override
    /*public ResponseDTO getAllSpecialities() {
        ResponseDTO responseDTO = new ResponseDTO();
        try {
            List<Speciality> branchMasters = specialityRepo.findAll();

            responseDTO.setStatus(true);
            responseDTO.setData(branchMasters);
            responseDTO.setMessage("Specialities Fetched Successfully");
            responseDTO.setStatusCode(200);

            //log.info("All Specialities List Fetched");
        } catch (Exception e) {
            e.printStackTrace();
            //log.error("Exception Occured: " + e);
            responseDTO.setStatus(false);
            responseDTO.setData(new ArrayList<>());
            responseDTO.setStatusCode(500);
            responseDTO.setMessage("Exception Occured");
        } finally {
            return responseDTO;
        }
    }*/

    public ResponseDTO getDoctors() {
        ResponseDTO responseDTO = new ResponseDTO();
        try {
            List<Doctor> doctorList = doctorRepo.findAll();
            responseDTO.setStatus(true);
            responseDTO.setData(doctorList);
            responseDTO.setMessage("Doctors Fetched Successfully");
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
