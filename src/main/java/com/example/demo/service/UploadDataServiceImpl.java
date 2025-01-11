package com.example.demo.service;

import com.example.demo.model.TravellinData;
import com.example.demo.repository.TravellinDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UploadDataServiceImpl  implements  UploadDataService {

    @Autowired
    TravellinDataRepository travlleinDataRepo ;
    @Override
    public TravellinData uploadData(TravellinData data) {
       return travlleinDataRepo.save(data);
    }

    @Override
    public List<TravellinData> getuploadData() {
        return travlleinDataRepo.findAll();
    }
}

