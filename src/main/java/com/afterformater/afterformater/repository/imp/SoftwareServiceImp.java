package com.afterformater.afterformater.repository.imp;

import com.afterformater.afterformater.entity.Software;
import com.afterformater.afterformater.repository.SoftwareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SoftwareServiceImp {

    @Autowired
    private SoftwareRepository repository;

    public List<Software> findAll() {
        return repository.findAll();
    }

    public Software save(Software dto) {
        return repository.save(dto);
    }

    //    TODO: Refatorar e colocar um tratamento melhor
    public Optional<Software> findById(long id) {
        Optional<Software> entity = repository.findById(id);
        if (!entity.isPresent()) {
            return null;
        }
        return entity;
    }

    public Software findByNome(String nome) {
        return repository.findByNome(nome);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
