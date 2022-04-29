package com.proyecto.vtb.vtaskback.impl;

import com.proyecto.vtb.vtaskback.DAO.api.EstudianteRepository;
import com.proyecto.vtb.vtaskback.Service.api.EstudianteServiceAPI;
import com.proyecto.vtb.vtaskback.commons.GenericServiceImpl;
import com.proyecto.vtb.vtaskback.estudiante.model.Estudiante;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
@Service
public class EstudianteServiceImpl extends GenericServiceImpl<Estudiante , Long> implements EstudianteServiceAPI {

    private EstudianteRepository estudianteRepository;
    @Override
    public CrudRepository<Estudiante, Long> getDao() {
        return estudianteRepository;
    }


}
