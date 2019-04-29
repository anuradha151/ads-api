package com.example.jwt.demo.service;

import com.example.jwt.demo.dto.AdsDTO;
import org.springframework.http.ResponseEntity;

public interface AdsService {

    ResponseEntity<?> save(AdsDTO adsDTO);

    ResponseEntity<?> update(AdsDTO adsDTO);

    ResponseEntity<?> remove(int ad_detail_id);

    ResponseEntity<?> findAll();

    ResponseEntity<?> findById(int ad_detail_id);

}
