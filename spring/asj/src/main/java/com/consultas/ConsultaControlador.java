package com.consultas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/huellitas-perdidas")
@CrossOrigin(origins = "http://localhost:4200/")
public class ConsultaControlador {
    @Autowired
    private iConsultaRepositorio repositorio;

    //este metodo va a listar los usuarios
    @GetMapping("/consultas")
    public List<Consulta>listarTodasLasConsultas(){
        return repositorio.findAll();
    }
    @PostMapping("/usuarios")
    public Consulta guardarUsuario(@RequestBody Consulta consulta){
        return repositorio.save(consulta);
    }
}
