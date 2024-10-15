package com.example.demo.service;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class AddService {


    public long add(long a, long b){
        return a+b;
    }

    public String multiple(long a,long b ){
        long result=a*b;
        String str="";
        if(result>100)
        {
            str="The result is greater than 100 "+result;
        }
        else {
            str="The result is less than 100 "+result;
        }

        return str;
    }


}
