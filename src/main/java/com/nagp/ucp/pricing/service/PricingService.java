package com.nagp.ucp.pricing.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagp.ucp.common.exception.UCPException;
import com.nagp.ucp.pricing.domain.Pricing;
import com.nagp.ucp.pricing.repository.PricingRepository;

@Service
public class PricingService {

	private static final Logger LOGGER = LoggerFactory.getLogger(PricingService.class);

	@Autowired
	PricingRepository pricingRepository;

	public Pricing getPricingById(int id) {
		List<Pricing> pricing = pricingRepository.findByServiceId(id);
		if (null != pricing && !pricing.isEmpty()) {
			return pricing.get(0);
		} else {
			throw new UCPException("ucp.service.pricing.001", "Pricing Details for Service ID : " + id + " Not Found");
		}
	}

}
