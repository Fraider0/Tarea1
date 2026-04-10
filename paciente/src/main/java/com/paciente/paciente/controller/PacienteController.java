package com.paciente.paciente.controller;

import com.paciente.paciente.models.PacienteModel;
import com.paciente.paciente.services.PacienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    private final PacienteService service;

    public PacienteController(PacienteService service) {
        this.service = service;
    }

    @PostMapping
    public void save(@RequestBody PacienteModel pacienteModel) {
        if (pacienteModel == null) {
            return;
        }
        service.save(pacienteModel);
    }

    @GetMapping
    public List<PacienteModel> getPacientes() {
        return service.getPacientes();
    }

    @DeleteMapping("/{nombre}")
    public void eliminar(@PathVariable String nombre) {
        service.deletePaciente(nombre);
    }

    @PutMapping("/{id}")
    public void actualizar(@PathVariable Integer id, @RequestBody PacienteModel pacienteModel) {
        pacienteModel.setId(id);
        service.actualizar(pacienteModel);
    }

    @PatchMapping("/{id}")
    public void actualizarParcial(@PathVariable Integer id, @RequestBody PacienteModel pacienteModel) {
        service.actualizarParcial(id, pacienteModel);
    }
}