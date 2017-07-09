package co.poli.ppi.entidades;

import javax.swing.JComboBox;

/**
 * Declaración de la clase Anotacion
 *
 * @author Juan David Cobos Cano
 * @version 9/07/17
 */
public class Anotacion {

    /**
     * Declaración de los atributos privados
     */
    private String fecha;
    private int codigo;
    private String nombreEstudiante;
    private String nombreDocente;
    private String descripcion;
    private String descargos;
    private String tipo;

    /**
     * Creación del constructor
     *
     * @param
     * codigo,nombreEstudiante,nombreDocente,descripcion,descargos,fecha,tipo,
     * usados en la lista simple ligada
     */
    public Anotacion(int codigo, String nombreEstudiante, String nombreDocente, String descripcion, String descargos, String fecha, String tipo) {
        this.fecha = fecha;
        this.codigo = codigo;
        this.nombreEstudiante = nombreEstudiante;
        this.nombreDocente = nombreDocente;
        this.descripcion = descripcion;
        this.descargos = descargos;
        this.tipo = tipo;
    }

    /**
     * Creación del los Getter and Setter
     *
     */
    /**
     * Getter Codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Setter Codigo
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Getter NombreEstudiante
     */
    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    /**
     * Setter NombreEstudiante
     */
    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    /**
     * Getter NombreDocente
     */
    public String getNombreDocente() {
        return nombreDocente;
    }

    /**
     * Setter NombreDocente
     */
    public void setNombreDocente(String nombreDocente) {
        this.nombreDocente = nombreDocente;
    }

    /**
     * Getter Descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Setter Descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Getter Descargos
     */
    public String getDescargos() {
        return descargos;
    }

    /**
     * Setter Descargos
     */
    public void setDescargos(String descargos) {
        this.descargos = descargos;
    }

    /**
     * Getter Fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Setter Fecha
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * Getter Tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Setter Tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Creación del toString
     */
    @Override
    public String toString() {
        return "Anotación"
                + "\nFecha: " + fecha
                + "\nCódigo: " + codigo
                + "\nNombre del estudiante: " + nombreEstudiante
                + "\nNombre del docente: " + nombreDocente
                + "\nTipo: " + tipo
                + "\nDescripción: " + descripcion
                + "\nDescargos: " + descargos
                + "\n ";

    }

}
