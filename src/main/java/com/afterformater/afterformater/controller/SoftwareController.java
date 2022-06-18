package com.afterformater.afterformater.controller;

import com.afterformater.afterformater.entity.Software;
import com.afterformater.afterformater.repository.imp.SoftwareServiceImp;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class SoftwareController {

    SoftwareServiceImp repository;

    SoftwareController(SoftwareServiceImp repository) {
        this.repository = repository;
    }

    @GetMapping()
    public List<Software> getSoftware() {
        return repository.findAll();
    }

    @PostMapping()
    public Software save(@RequestBody Software dto) {
        return repository.save(dto);
    }

    @GetMapping("/software/id/{id}")
    public Optional<Software> findById(@PathVariable(value = "id") long id) {
        return repository.findById(id);
    }

    @GetMapping("/software/nome/{nome}")
    public Software findByName(@PathVariable(value = "nome") String nome) {
        return repository.findByNome(nome);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable(value = "id") Long id) {
        repository.deleteById(id);
    }
}
