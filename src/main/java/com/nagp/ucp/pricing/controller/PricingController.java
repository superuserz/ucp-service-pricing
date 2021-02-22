package com.nagp.ucp.pricing.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagp.ucp.common.exception.UCPException;
import com.nagp.ucp.pricing.domain.Pricing;
import com.nagp.ucp.pricing.service.PricingService;

@RestController
@RequestMapping(value = "/pricing")
public class PricingController {

	private static final Logger LOGGER = LoggerFactory.getLogger(PricingController.class);

	@Autowired
	private PricingService pricingService;

	@GetMapping(value = "/fetch/{serviceId}")
	public Pricing getPrice(@PathVariable int serviceId) throws UCPException {
		return pricingService.getPricingById(serviceId);
	}
}
