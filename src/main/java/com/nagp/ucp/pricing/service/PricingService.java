package com.nagp.ucp.pricing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagp.ucp.pricing.domain.Pricing;
import com.nagp.ucp.pricing.repository.PricingRepository;

@Service
public class PricingService {

    @Autowired
    PricingRepository pricingRepository;

    public Pricing getPricingById(int id) {
        List<Pricing> pricing = pricingRepository.findByServiceId(id);
        if (null != pricing && !pricing.isEmpty()) {
            return pricing.get(0);
        } else {
            // handle-exception
            return null;
        }
    }

}
