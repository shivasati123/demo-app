package com.example.demo.controller;


import com.example.demo.model.TravellinData;
import com.example.demo.service.UploadDataService;
import com.example.demo.service.UploadDataServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    UploadDataServiceImpl uploadDataService;

    @PostMapping("/save-data")
    public String saveData(@RequestParam("data") String data,
                       @RequestParam("image_url") String image){
        TravellinData travellinData =  new TravellinData();
        travellinData.setText(data);
        travellinData.setImage_url(image);
        uploadDataService.uploadData(travellinData);
        return "index";
    }

    @GetMapping("/home")
    public String home(){
        return "index";
    }
}
