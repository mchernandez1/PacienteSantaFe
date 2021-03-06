package models;

/**
 * Created by Maria on 7/05/2017.
 */

public class Paciente
{
    private long documento;

    private String nombre;

    private String tipoSangre;

    private String pais;

    private String ciudad;

    private long telefono;

    private long celular;


    public Paciente(long documento, String nombre, String tipoSangre, String pais, String ciudad, long telefono, long celular, String tratamientos, String examenes) {
        this.documento = documento;
        this.nombre = nombre;
        this.tipoSangre = tipoSangre;
        this.pais = pais;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.celular = celular;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

}
