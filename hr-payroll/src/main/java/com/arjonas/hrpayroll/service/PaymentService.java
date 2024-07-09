package com.arjonas.hrpayroll.service;

import com.arjonas.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public Payment getPayment(Long workerId, Integer days) {
        return Payment.builder()
                .name("Vinicius")
                .days(days)
                .dailyIncome(2000.00)
                .build();
    }

}
