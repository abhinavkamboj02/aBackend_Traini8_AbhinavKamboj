package com.traini8.registry.services.serviceIMPL;

import com.traini8.registry.repositories.TrainingCenterRepository;
import com.traini8.registry.dtos.TrainingCenterDto;
import com.traini8.registry.entities.TrainingCenter;
import com.traini8.registry.services.TrainingCenterService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
@Service
public class TrainingCenterServiceImpl implements TrainingCenterService {
    @Autowired
    TrainingCenterRepository trainingCenterRepository;
    @Autowired
    ModelMapper modelMapper;
    @Override
    public TrainingCenterDto createTrainingCenter(TrainingCenterDto trainingCenterDto) {
        TrainingCenter trainingCenter = modelMapper.map(trainingCenterDto, TrainingCenter.class);
        trainingCenter.setCreatedOn(new Date());
        TrainingCenter savedTrainingCenter = trainingCenterRepository.save(trainingCenter);
        return modelMapper.map(savedTrainingCenter, TrainingCenterDto.class);
    }

    @Override
    public List<TrainingCenterDto> getAllTrainingCenters() {
        List<TrainingCenter> trainingCenterList = trainingCenterRepository.findAll();
        return trainingCenterList
                .stream()
                .map(trainingCenter -> modelMapper.map(trainingCenter, TrainingCenterDto.class))
                .collect(Collectors.toList());
    }


    @Override
    public List<TrainingCenterDto> getTrainingCentersFromCity(String city) {
        List<TrainingCenter> trainingCenterList = trainingCenterRepository.findByAddressCity(city);
        return trainingCenterList
                .stream()
                .map(trainingCenter -> modelMapper.map(trainingCenter, TrainingCenterDto.class))
                .collect(Collectors.toList());
    }
}
