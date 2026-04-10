package com.paciente.paciente.services;

import com.paciente.paciente.models.PacienteModel;
import com.paciente.paciente.repository.PacienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService {

    private final PacienteRepository repository;

    public PacienteService(PacienteRepository repository) {
        this.repository = repository;
    }

    public void save(PacienteModel enfermo) {
        repository.savePaciente(enfermo);
    }

    public List<PacienteModel> getPacientes() {
        return repository.getPacientes();
    }

    public void deletePaciente(String nombre) {
        repository.eliminarPorNombre(nombre);
    }

    public void actualizar(PacienteModel pacienteModel) {
        if (pacienteModel.getId() == null) {
            System.out.println("El Id es necesario para actualizar");
            return;
        }
        repository.actualizar(pacienteModel);
    }

    public void actualizarParcial(Integer idPaciente, PacienteModel datos) {
        if (idPaciente == null) {
            System.out.println("El Id es obligatorio");
            return;
        }

        PacienteModel existente = repository.buscarPorID(idPaciente);

        if (existente == null) {
            return;
        }

        String nombrePaciente = datos.getNombre() != null ? datos.getNombre() : existente.getNombre();
        Integer edadPaciente = datos.getEdad() != null ? datos.getEdad() : existente.getEdad();
        String diagnosticoPaciente = datos.getDiagnostico() != null ? datos.getDiagnostico() : existente.getDiagnostico();
        Boolean atendidoPaciente = datos.getAtendido() != null ? datos.getAtendido() : existente.getAtendido();
        PacienteModel actualizado = new PacienteModel(idPaciente, nombrePaciente, edadPaciente, diagnosticoPaciente, atendidoPaciente);
        repository.actualizar(actualizado);
    }
}