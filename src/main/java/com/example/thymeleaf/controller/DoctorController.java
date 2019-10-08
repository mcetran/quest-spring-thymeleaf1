package com.example.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DoctorController {

    @GetMapping("/doctor")
    public String doctor(Model doctorModel, @RequestParam(defaultValue = "John Smith") String name, @RequestParam(defaultValue = "0") String number) {
        doctorModel.addAttribute("doctorname", name);
        doctorModel.addAttribute("doctornumber", number);
        return "doctor";
    }
}
