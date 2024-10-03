package com.traini8.registry.services;

import com.traini8.registry.dtos.TrainingCenterDto;
import java.util.List;

public interface TrainingCenterService {
    //create Training center
    TrainingCenterDto createTrainingCenter(TrainingCenterDto trainingCenterDto);

    //get All training Centers
    List<TrainingCenterDto> getAllTrainingCenters();

    //get All training centers from given city
    List<TrainingCenterDto> getTrainingCentersFromCity(String city);
}
