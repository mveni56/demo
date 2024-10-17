package com.example.demo.controller;

import com.example.demo.DTO.ResponseDTO;
import com.example.demo.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchoolController {
    @Autowired
    SchoolService schoolService;

    @GetMapping("/getSchools")
    public ResponseEntity<ResponseDTO> getAllSchools(){
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO = schoolService.getAllSchools();
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

}
