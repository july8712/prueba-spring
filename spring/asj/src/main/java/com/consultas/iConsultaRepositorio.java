package com.consultas;

import com.consultas.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iConsultaRepositorio extends JpaRepository<Consulta, Integer> {
}
