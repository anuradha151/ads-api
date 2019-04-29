package com.example.jwt.demo.repository;

import com.example.jwt.demo.model.AdsDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdsRepository extends JpaRepository<AdsDetail, Integer> {
}
