package com.traini8.registry.controllers;

import com.traini8.registry.dtos.TrainingCenterDto;
import com.traini8.registry.services.TrainingCenterService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/training-center")
public class TrainingCenterController {
    @Autowired
    TrainingCenterService trainingCenterService;

    //create a Training center
    @PostMapping("/create")
    public ResponseEntity<TrainingCenterDto> createTrainingCenter(@Valid @RequestBody TrainingCenterDto trainingCenterDto){
        TrainingCenterDto savedTrainingCenterDto = trainingCenterService.createTrainingCenter(trainingCenterDto);
        return new ResponseEntity<>(savedTrainingCenterDto, HttpStatus.CREATED);
    }
    //fetch all training centers from database
    @GetMapping("/get-all")
    public ResponseEntity<List<TrainingCenterDto>> getAllTrainingCenters(){
        List<TrainingCenterDto> trainingCenterDtoList = trainingCenterService.getAllTrainingCenters();
        return new ResponseEntity<>(trainingCenterDtoList, HttpStatus.OK);
    }
    // fetch all training center which are in given city (additional api)
    @GetMapping("/city")
    public ResponseEntity<List<TrainingCenterDto>> getTrainingCentersFromCity(@RequestParam String city){
        List<TrainingCenterDto> trainingCenterDtoList = trainingCenterService.getTrainingCentersFromCity(city);
        return new ResponseEntity<>(trainingCenterDtoList, HttpStatus.OK);
    }
}
