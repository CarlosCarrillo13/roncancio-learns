package com.roncancio.prueba.roncancioprueba.repos;

import com.roncancio.prueba.roncancioprueba.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
}
