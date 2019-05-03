package com.example.jwt.demo.controller;

import com.example.jwt.demo.dto.AdsDTO;
import com.example.jwt.demo.service.AdsService;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequestMapping("/ads")
@CrossOrigin
public class AdsController {

    private final AdsService adsService;

    public AdsController(AdsService adsService) {
        this.adsService = adsService;
    }

    @PostMapping("save")
    public ResponseEntity<?> save(@RequestBody AdsDTO adsDTO, Principal principal) {
        return adsService.save(adsDTO, principal);
    }

    @GetMapping("all")
    public ResponseEntity<?> findAll() {
        return adsService.findAll();
    }

    @GetMapping("all_by_category")
    public ResponseEntity<?> findAll(@Param("ad_category_name") String ad_category_name) {
        return adsService.findAll(ad_category_name);
    }

    @GetMapping("byId")
    public ResponseEntity<?> findById(@Param("id") int id) {
        return adsService.findById(id);
    }

    @PutMapping("update")
    public ResponseEntity<?> update(@RequestBody AdsDTO adsDTO) {
        return adsService.update(adsDTO);
    }

    @DeleteMapping("remove")
    public ResponseEntity<?> remove(@Param("id") int id) {
        return adsService.remove(id);
    }


}
