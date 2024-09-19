package com.example.vacationcalculator;

import com.example.vacationcalculator.model.VacationRequest;
import com.example.vacationcalculator.service.VacationService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VacationServiceTest {
    private final VacationService vacationService = new VacationService();

    @Test
    public void testCalculateVacationPay() {
        VacationRequest request = new VacationRequest();
        request.setAverageSalary(60000);
        request.setVacationDays(10);

        double result = vacationService.calculateVacationPay(request);
        assertEquals(20000, result);
    }
}
