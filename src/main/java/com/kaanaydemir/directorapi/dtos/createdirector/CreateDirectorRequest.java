package com.kaanaydemir.directorapi.dtos.createdirector;

import com.kaanaydemir.directorapi.entities.Address;

import java.time.LocalDate;
import java.util.List;

public record CreateDirectorRequest(String email, String name, String surname, LocalDate birthDate, Address address, List<Integer> movies) {
}
