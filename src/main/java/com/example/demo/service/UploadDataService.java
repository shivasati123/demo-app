package com.example.demo.service;


import com.example.demo.model.TravellinData;
import com.example.demo.repository.TravellinDataRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public interface UploadDataService {



    public TravellinData uploadData(TravellinData Data);
}
