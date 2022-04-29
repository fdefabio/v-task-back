package com.proyecto.vtb.vtaskback.DAO.api;

import com.proyecto.vtb.vtaskback.estudiante.model.Estudiante;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EstudianteRepository extends MongoRepository <Estudiante, Long> {

}
