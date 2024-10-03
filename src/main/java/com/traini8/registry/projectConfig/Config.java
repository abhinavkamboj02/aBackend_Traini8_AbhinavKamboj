package com.traini8.registry.projectConfig;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Config {
    @Bean
    ModelMapper mapper(){ return new ModelMapper();}
}
