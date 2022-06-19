package com.afterformater.afterformater.repository;

import com.afterformater.afterformater.entity.Software;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoftwareRepository extends JpaRepository<Software, Long> {
    Software findByNome(String nome);
}
