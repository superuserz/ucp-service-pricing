package com.nagp.ucp.pricing.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nagp.ucp.pricing.domain.Pricing;

@Repository
public interface PricingRepository extends JpaRepository<Pricing, Integer> {

    @Query(value = "SELECT p FROM Pricing p WHERE p.serviceId = ?1")
    List<Pricing> findByServiceId(int id);

}
