package com.example.jwt.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ads_detail")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class AdsDetail {

}
