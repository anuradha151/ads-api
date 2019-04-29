package com.example.jwt.demo.controller;

import com.example.jwt.demo.dto.AdsDTO;
import com.example.jwt.demo.service.AdsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ads")
@CrossOrigin
public class AdsController {

    private final AdsService adsService;

    public AdsController(AdsService adsService) {
        this.adsService = adsService;
    }

    @PostMapping("save")
    ResponseEntity<?> save(@RequestBody AdsDTO adsDTO) {
        return adsService.save(adsDTO);
    }

}
