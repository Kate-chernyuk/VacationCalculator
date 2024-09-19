package com.example.vacationcalculator.service;

import com.example.vacationcalculator.model.VacationRequest;
import org.springframework.stereotype.Service;

@Service
public class VacationService {
    public double calculateVacationPay(VacationRequest request) {
        double averageSalary = request.getAverageSalary();
        int vacationDays = request.getVacationDays();
        return (averageSalary / 30) * vacationDays;
    }

}
