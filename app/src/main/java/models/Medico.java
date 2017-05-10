package models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maria on 9/05/2017.
 */

public class Medico
{
    private Long idMedico;

    /**
     * Nombre del medico.
     */
    private String nombreMedico;

    /**
     * Especialidad medico.
     */
    private String especialidadMedico;

    /**
     * Descripción general del medico.
     */
    private String descripcionMedico;


    private List<Paciente> pacientesDelMedico;

    public Medico( String nombre, String especialidad, String descripcion) {
        this.nombreMedico = nombre;
        this.especialidadMedico = especialidad;
        this.descripcionMedico = descripcion;
        pacientesDelMedico = new ArrayList<Paciente>();
    }

    public Medico(long id, String nombre, String especialidad, String descripcion, List<Paciente> pacientesDoctor) {
        this.idMedico = id;
        this.nombreMedico = nombre;
        this.especialidadMedico = especialidad;
        this.descripcionMedico = descripcion;
        this.pacientesDelMedico = pacientesDoctor;
    }

    //-------------------------------------------------------------
    //Metódos
    //-------------------------------------------------------------
    public Long getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Long idMedico) {
        this.idMedico = idMedico;
    }

    public String getNombreMedico() {
        return nombreMedico;
    }

    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }

    public String getEspecialidadMedico() {
        return especialidadMedico;
    }

    public void setEspecialidadMedico(String especialidadMedico) {
        this.especialidadMedico = especialidadMedico;
    }

    public String getDescripcionMedico() {
        return descripcionMedico;
    }

    public void setDescripcionMedico(String descripcionMedico) {
        this.descripcionMedico = descripcionMedico;
    }


    public List<Paciente> getPacientesDelMedico() {
        return pacientesDelMedico;
    }

    public void setPacientesDelMedico(List<Paciente> pacientesDelMedico) {
        this.pacientesDelMedico = pacientesDelMedico;
    }

}
