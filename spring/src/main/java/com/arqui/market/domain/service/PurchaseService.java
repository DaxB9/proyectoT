package com.arqui.market.domain.service;

import com.arqui.market.domain.Purchase;
import com.arqui.market.persistence.CompraRepository;
import com.arqui.market.persistence.entity.Compra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseService {

    @Autowired
    private CompraRepository compraRepository;

    public List<Purchase> getAll(){
        return compraRepository.getAll();
    }

    public Optional<List<Purchase>> getByUser(String userId){
        return compraRepository.getByUser(userId);
    }

    public Purchase save(Purchase purchase){
        return compraRepository.save(purchase);
    }
}
