package com.kaanaydemir.directorapi.dtos;

import com.kaanaydemir.directorapi.entities.Address;

import java.time.LocalDate;
import java.util.List;

public record DirectorDto(String id, String email, String name, String surname, LocalDate birthDate, Address address, List<Integer> movies) {
}
