package com.traini8.registry.repositories;

import com.traini8.registry.entities.TrainingCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TrainingCenterRepository extends JpaRepository<TrainingCenter, String> {
    List<TrainingCenter> findByAddressCity(String city);
}
