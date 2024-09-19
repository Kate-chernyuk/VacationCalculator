package com.example.vacationcalculator.controller;

import com.example.vacationcalculator.model.VacationRequest;
import com.example.vacationcalculator.service.VacationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VacationController {
    @Autowired
    private VacationService vacationService;

    @GetMapping("/calculate")
    public double calculateVacationPay(@RequestBody VacationRequest request) {
        return vacationService.calculateVacationPay(request);
    }
}
