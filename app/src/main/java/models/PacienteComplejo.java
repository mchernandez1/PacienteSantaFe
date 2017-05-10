package models;

import java.util.List;

/**
 * Created by Maria on 9/05/2017.
 */

public class PacienteComplejo
{
    //Lista de medicos o se mapea la relación ManyToOne
    private List<Medico> medicos;

    private Medico medico;

    public List<Medico> getMedicos() {
        return medicos;
    }

    public void setMedicos(List medicos) {
        this.medicos = medicos;
    }

    public Medico getMedico() {
        return medico;

    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }




}
