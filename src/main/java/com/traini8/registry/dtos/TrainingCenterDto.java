package com.traini8.registry.dtos;

import com.traini8.registry.helper.Address;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TrainingCenterDto {
    @Pattern(regexp = "^[a-zA-Z0-9]+$", message = "The Center Code must be alphanumeric")
    @Size(min = 12, max = 12, message = "The Center Code must be exactly 12 characters long")
    private String centerCode;
    @NotBlank(message = "Center Name cannot be blank")
    @Size(min = 5, max = 39, message = "Center Name should more than 5 characters and less than 40 characters")
    private String centerName;
    private int studentCapacity;
    private List<String> coursesOffered;
    private Date createdOn;
    @NotBlank(message = "contact Email cannot be blank")
    @Email(message = "Email should be valid")
    private String contactEmail;
    @NotBlank(message = "Phone number cannot be blank")
    @Pattern(regexp = "^\\d{10}$", message = "Phone number must be 10 digits")
    private String contactPhone;
    @Valid
    private Address address;
}
