package com.example.demo.controller;


import com.example.demo.model.TravellinData;
import com.example.demo.response.ResponseHandler;
import com.example.demo.service.UploadDataService;
import com.example.demo.service.UploadDataServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    UploadDataServiceImpl uploadDataService;

    @PostMapping("api/v1/data")
    public ResponseEntity<Object> saveData(@RequestBody TravellinData travellinData){
        TravellinData data = uploadDataService.uploadData(travellinData);
        return ResponseHandler.buildResponse("Data Added Successfully", HttpStatus.CREATED,data);
    }

    @GetMapping("api/v1/data")
    public  ResponseEntity<Object> getData(){
        List<TravellinData> dataList = uploadDataService.getuploadData();
        return ResponseHandler.buildResponse("Data Fetched Successfully", HttpStatus.OK,dataList);
    }
}
