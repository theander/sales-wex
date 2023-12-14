package com.wex.salesservice.service;

import com.wex.salesservice.domain.PurchaseTransaction;
import com.wex.salesservice.repository.PurchaseTransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service()
@RequiredArgsConstructor
public class PurchaseTransactionService implements IPurchaseTransactionService {
    private final PurchaseTransactionRepository purchaseTransactionRepository;

    @Override
    public PurchaseTransaction save(PurchaseTransaction purchaseTransaction) {

        return purchaseTransactionRepository.save(purchaseTransaction);
    }
}
