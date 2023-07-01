package com.kaanaydemir.directorapi.services;

import com.kaanaydemir.directorapi.dtos.DirectorDto;
import com.kaanaydemir.directorapi.dtos.createdirector.CreateDirectorRequest;
import com.kaanaydemir.directorapi.entities.Director;
import com.kaanaydemir.directorapi.mapper.DirectorMapper;
import com.kaanaydemir.directorapi.repositories.DirectorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DirectorService {

    private final DirectorRepository directorRepository;
    private final DirectorMapper directorMapper;

    public DirectorService(DirectorRepository directorRepository, DirectorMapper directorMapper) {
        this.directorRepository = directorRepository;
        this.directorMapper = directorMapper;
    }

    public String save(Director director) {
        Director save = directorRepository.save(director);
        return save.getId();
    }

    public String createDirectorWithRequest(CreateDirectorRequest request) {
        Director director = directorMapper.convertFromRequest(request);
        return save(director);
    }

    public void delete(String id) {
        directorRepository.deleteById(id);
    }

    public Director getById(String id) {
        return directorRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Director not found!"));
    }

    public DirectorDto getDtoById(String id) {
        return directorMapper.convert(getById(id));
    }

    public List<Director> getAll() {
        return directorRepository.findAll();
    }

    public List<DirectorDto> getAllDto() {
        return getAll().stream()
                .map(directorMapper::convert)
                .toList();
    }

    public String save(DirectorDto dto) {
        return save(directorMapper.convert(dto));
    }
}
