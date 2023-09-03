package com.xa.populationregistration.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonCreateDto {

    private String name;
    private String gender;
    private String address;
    private Integer age;

}
