package com.nagp.ucp.pricing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagp.ucp.pricing.domain.Pricing;
import com.nagp.ucp.pricing.service.PricingService;

@RestController
@RequestMapping(value = "/pricing")
public class PricingController {

    @Autowired
    private PricingService pricingService;

    @GetMapping(value = "/fetch/{serviceId}")
    public Pricing getPrice(@PathVariable int serviceId) {
        return pricingService.getPricingById(serviceId);
    }
}
