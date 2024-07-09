package com.arjonas.hrpayroll.resources;

import com.arjonas.hrpayroll.entities.Payment;
import com.arjonas.hrpayroll.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/payments")
@Slf4j
public class PaymentResource {

    @Autowired
    private PaymentService service;

    @GetMapping(value = "/{workerId}/days/{days}")
    public ResponseEntity<Payment> getPayment(@PathVariable Long workerId, @PathVariable Integer days) {
        Payment payment = service.getPayment(workerId, days);
        return ResponseEntity.ok(payment);
    }

}