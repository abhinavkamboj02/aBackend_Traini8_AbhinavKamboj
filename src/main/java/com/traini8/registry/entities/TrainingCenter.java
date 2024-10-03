package com.traini8.registry.entities;

import com.traini8.registry.helper.Address;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TrainingCenter {
    @Id
    private String centerCode;
    private String centerName;
    private int studentCapacity;
    private List<String> coursesOffered;
    private Date createdOn;
    private String contactEmail;
    private String contactPhone;
    @Embedded
    private Address address;

}
