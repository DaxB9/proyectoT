package com.arqui.market.domain.repository;

import com.arqui.market.domain.Purchase;

import java.util.List;
import java.util.Optional;

public interface PurchaseRepository {
    List<Purchase> getAll();
    Optional<List<Purchase>> getByUser(String userId);
    Purchase save(Purchase purchase);
}
