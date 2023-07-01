package com.kaanaydemir.directorapi.mapper;

import com.kaanaydemir.directorapi.dtos.DirectorDto;
import com.kaanaydemir.directorapi.dtos.createdirector.CreateDirectorRequest;
import com.kaanaydemir.directorapi.entities.Director;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DirectorMapper {
    Director convert(DirectorDto dto);
    DirectorDto convert(Director entity);

    Director convertFromRequest(CreateDirectorRequest request);
}
