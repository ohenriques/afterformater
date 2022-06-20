package com.afterformater.afterformater.controller;

import com.afterformater.afterformater.entity.Software;
import com.afterformater.afterformater.repository.imp.SoftwareServiceImp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

// TODO: APLICAR O HATEOS e usar o do Spring talvez.
@RestController
@RequestMapping("/api")
public class SoftwareController {

    private static final Logger logger = LoggerFactory.getLogger(SoftwareController.class);

    SoftwareServiceImp service;

    SoftwareController(SoftwareServiceImp repository) {
        this.service = repository;
    }

    @GetMapping()
    public ResponseEntity<Software> getSoftware() {
        logger.info("get all software");
        return new ResponseEntity(service.findAll(), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Software> save(@RequestBody Software dto) {
        return new ResponseEntity<Software>(service.save(dto), HttpStatus.CREATED);
    }

    @GetMapping("/software/id/{id}")
    public Optional<Software> findById(@PathVariable(value = "id") long id) {
        return service.findById(id);
    }

    @GetMapping("/software/nome/{nome}")
    public Software findByName(@PathVariable(value = "nome") String nome) {
        return service.findByNome(nome);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable(value = "id") Long id) {
        service.deleteById(id);
    }
}
