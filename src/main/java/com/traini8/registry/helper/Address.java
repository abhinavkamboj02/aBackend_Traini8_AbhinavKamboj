package com.traini8.registry.helper;

import jakarta.persistence.Embeddable;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Address {

    @NotBlank(message = "Detailed Address cannot be blank")
    @Size(min = 5, max = 100, message = "Detailed Address must be between 5 and 100 characters")
    private String detailedAddress;
    @NotBlank(message = "City cannot be blank")
    @Size(min = 2, max = 50, message = "City name must be between 2 and 50 characters")
    private String city;
    @NotBlank(message = "State cannot be blank")
    @Size(min = 2, max = 50, message = "State name must be between 2 and 50 characters")
    private String state;
    @NotBlank(message = "Pin code cannot be blank")
    @Pattern(regexp = "\\d{6}", message = "Pin code must be 6 digits")
    private String pinCode;
}
