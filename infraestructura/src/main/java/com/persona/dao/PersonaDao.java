package com.persona.dao;

import com.persona.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaDao extends JpaRepository<PersonaEntity, Long> {
}
