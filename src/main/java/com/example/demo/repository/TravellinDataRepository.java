package com.example.demo.repository;

import com.example.demo.model.TravellinData;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface TravellinDataRepository extends JpaRepository<TravellinData,Long> {
}
