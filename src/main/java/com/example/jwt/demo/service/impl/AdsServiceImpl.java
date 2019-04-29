package com.example.jwt.demo.service.impl;

import com.example.jwt.demo.dto.AdsDTO;
import com.example.jwt.demo.exception.CustomException;
import com.example.jwt.demo.model.AdsDetail;
import com.example.jwt.demo.repository.AdsRepository;
import com.example.jwt.demo.service.AdsService;
import com.example.jwt.demo.util.ResponseModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AdsServiceImpl implements AdsService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AdsServiceImpl.class);

    private final AdsRepository adsRepository;

    public AdsServiceImpl(AdsRepository adsRepository) {
        this.adsRepository = adsRepository;
    }

    @Override
    public ResponseEntity<?> save(AdsDTO adsDTO) {
        try {
            adsRepository.save(dTOToEntity(adsDTO));
            return new ResponseEntity<>(new ResponseModel(HttpStatus.OK.value(), "Ad Details Added", true), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            throw new CustomException(e.getMessage());
        }
    }

    @Override
    public ResponseEntity<?> update(AdsDTO adsDTO) {
        return null;
    }

    @Override
    public ResponseEntity<?> remove(int ad_detail_id) {
        return null;
    }

    @Override
    public ResponseEntity<?> findAll() {
        return null;
    }

    @Override
    public ResponseEntity<?> findById(int ad_detail_id) {
        return null;
    }

    private AdsDetail dTOToEntity(AdsDTO adsDTO) {
        AdsDetail adsDetail = new AdsDetail();
        adsDetail.setAd_detail_id(adsDTO.getAd_detail_id());
        adsDetail.setAd_category_name(adsDTO.getAd_category_name());
        adsDetail.setAd_item_name(adsDTO.getAd_item_name());
        adsDetail.setAd_item_condition(adsDTO.getAd_item_condition());
        adsDetail.setAd_title(adsDTO.getAd_title());
        adsDetail.setAd_description(adsDTO.getAd_description());
        adsDetail.setAd_city(adsDTO.getAd_city());
        adsDetail.setAd_price(adsDTO.getAd_price());
        adsDetail.setAd_image(adsDTO.getAd_image());
        adsDetail.setAd_user_email(adsDTO.getAd_user_email());
        adsDetail.setAd_user_unique_id(adsDTO.getAd_user_unique_id());
        adsDetail.setAd_user_contact_no(adsDTO.getAd_user_contact_no());
        return adsDetail;

    }

    private AdsDTO entityToDTO(AdsDetail adsDTO) {
        AdsDTO adsDetail = new AdsDTO();
        adsDetail.setAd_detail_id(adsDTO.getAd_detail_id());
        adsDetail.setAd_category_name(adsDTO.getAd_category_name());
        adsDetail.setAd_item_name(adsDTO.getAd_item_name());
        adsDetail.setAd_item_condition(adsDTO.getAd_item_condition());
        adsDetail.setAd_title(adsDTO.getAd_title());
        adsDetail.setAd_description(adsDTO.getAd_description());
        adsDetail.setAd_city(adsDTO.getAd_city());
        adsDetail.setAd_price(adsDTO.getAd_price());
        adsDetail.setAd_image(adsDTO.getAd_image());
        adsDetail.setAd_user_email(adsDTO.getAd_user_email());
        adsDetail.setAd_user_unique_id(adsDTO.getAd_user_unique_id());
        adsDetail.setAd_user_contact_no(adsDTO.getAd_user_contact_no());
        return adsDetail;

    }
}
