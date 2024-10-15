package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class MathService {

    public int cube(int a){
        return a*a*a;
    }
    public double Roots(double a, double b){
        return Math.sqrt(a)+Math.sqrt(b);
    }
    public double volume(double l,double b,double h)
    {
        return l*b*h;
    }


}
