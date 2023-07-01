package com.kaanaydemir.directorapi.controllers;

import com.kaanaydemir.directorapi.dtos.DirectorDto;
import com.kaanaydemir.directorapi.dtos.createdirector.CreateDirectorRequest;
import com.kaanaydemir.directorapi.services.DirectorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/directors")
public class DirectorController {

    private final DirectorService directorService;

    public DirectorController(DirectorService directorService) {
        this.directorService = directorService;
    }

    @GetMapping
    public List<DirectorDto> getAll(){
        return directorService.getAllDto();
    }

    @PostMapping
    public ResponseEntity<String> save(@RequestBody CreateDirectorRequest request){
        return ResponseEntity.ok(directorService.createDirectorWithRequest(request));
    }

    @GetMapping("/{id}")
    public DirectorDto getById(@PathVariable String id){
        return directorService.getDtoById(id);
    }
}
