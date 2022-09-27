package com.shop.syscoshop.entity;


import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "products")
@Entity
public class Product {



    @Id
    @Column(name = "product_id",
            nullable = false,
            unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long productId;

    @Column(nullable = false,
            unique = true,
            name = "product_name")
    private String productName;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private float price;
//
//    @Column(nullable = false)
//    private String category;



    @Column(nullable = false)
    private String category;

//    @ManyToOne
//    @JoinColumn(name = "category_id")
//    private Category category;



}
