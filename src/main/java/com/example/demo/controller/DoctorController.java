package com.example.demo.controller;

import com.example.demo.DTO.ResponseDTO;
import com.example.demo.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;

@RestController
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    /*@GetMapping("/getAllSpecialities")
    public ResponseEntity<ResponseDTO> getAllSpecialities() {
        ResponseDTO responseDTO = new ResponseDTO();

        try {
            responseDTO = doctorService.getAllSpecialities();
        } catch (Exception e) {
            e.printStackTrace();
            responseDTO.setStatusCode(500);
            responseDTO.setData(new ArrayList<>());
            responseDTO.setMessage("Exception Occured");
            responseDTO.setStatus(false);
        } finally {
            return new ResponseEntity<>(responseDTO, StaticConstants.statusCodes.get(responseDTO.getStatusCode()));
        }
    }*/

    public ResponseEntity<ResponseDTO> getDoctors()
    {
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO = doctorService.getDoctors();
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

}
