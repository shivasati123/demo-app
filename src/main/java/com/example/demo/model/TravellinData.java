package com.example.demo.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.sql.Timestamp;

@Entity
@Table(name = "travellin_data")
@Getter
@Setter
public class TravellinData {
    @Id  // Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-generate ID
    private Long id;


    @Column
    private String text;

    @Column
    private String imageUrl;

    @Column
    private String postedBy;

    @Column
    @CreationTimestamp
    Timestamp createdAt;

    @Column
    @CreationTimestamp
    Timestamp updatedAt;








}
