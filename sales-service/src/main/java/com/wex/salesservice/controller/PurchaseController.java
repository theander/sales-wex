package com.wex.salesservice.controller;

import com.wex.salesservice.domain.PurchaseTransaction;
import com.wex.salesservice.service.PurchaseTransactionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@Slf4j
public class PurchaseController {
    private final PurchaseTransactionService purchaseTransactionService;

    @PostMapping("/transaction")
    public ResponseEntity<PurchaseTransaction> savePurchaseTransaction(@RequestBody PurchaseTransaction purchaseTransaction) {

        System.out.println(OffsetDateTime.now());
        purchaseTransactionService.save(purchaseTransaction);
        return new ResponseEntity(CREATED);
    }
}
