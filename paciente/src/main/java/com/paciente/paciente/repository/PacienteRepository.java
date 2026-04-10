package com.paciente.paciente.repository;

import com.paciente.paciente.models.PacienteModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class PacienteRepository {

    private final List<PacienteModel> listaPacientes = new ArrayList<>();

    public void savePaciente(PacienteModel paciente) {
        if (paciente == null || paciente.getId() == null) {
            return;
        }

        for (PacienteModel p : listaPacientes) {
            if (Objects.equals(p.getId(), paciente.getId())) {
                return;
            }
        }

        listaPacientes.add(paciente);
    }

    public List<PacienteModel> getPacientes() {
        return listaPacientes;
    }

    public PacienteModel buscarPorID(Integer id) {
        if (id == null) {
            return null;
        }

        for (PacienteModel paciente : listaPacientes) {
            if (Objects.equals(paciente.getId(), id)) {
                return paciente;
            }
        }
        return null;
    }

    public void actualizar(PacienteModel actualizado) {
        if (actualizado == null || actualizado.getId() == null) {
            return;
        }

        for (int i = 0; i < listaPacientes.size(); i++) {
            if (Objects.equals(listaPacientes.get(i).getId(), actualizado.getId())) {
                listaPacientes.set(i, actualizado);
                return;
            }
        }
    }

    public void eliminarPorId(Integer id) {
        if (id == null) {
            return;
        }
        listaPacientes.removeIf(paciente -> Objects.equals(paciente.getId(), id));
    }

    public void eliminarPorNombre(String nombre) {
        if (nombre == null) {
            return;
        }
        listaPacientes.removeIf(paciente -> Objects.equals(paciente.getNombre(), nombre));
    }
}