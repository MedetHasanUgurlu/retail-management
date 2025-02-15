package com.medet.Retail.Management.product;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String code;
    private String defaultPrice;
    @Enumerated(EnumType.STRING)
    private ProductType productType;


}
