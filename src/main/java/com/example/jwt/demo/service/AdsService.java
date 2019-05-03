package com.example.jwt.demo.service;

import com.example.jwt.demo.dto.AdsDTO;
import org.springframework.http.ResponseEntity;

import java.security.Principal;

public interface AdsService {

    ResponseEntity<?> save(AdsDTO adsDTO, Principal principal);

    ResponseEntity<?> update(AdsDTO adsDTO);

    ResponseEntity<?> remove(int ad_detail_id);

    ResponseEntity<?> findAll();

    ResponseEntity<?> findAll(String ad_category_name);

    ResponseEntity<?> findById(int ad_detail_id);

}
