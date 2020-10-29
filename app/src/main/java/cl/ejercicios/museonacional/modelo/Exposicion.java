package cl.ejercicios.museonacional.modelo;

import cl.ejercicios.museonacional.R;

public class Exposicion {
    private String nombre;
    private String tipo;
    private String descripcion;
    private int idFoto;
    private boolean estado;
    public static final boolean ACTIVO=true;

    public Exposicion(String nombre, String descripcion, int idUbicacion, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.idFoto = idUbicacion;
        this.estado = ACTIVO;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdFoto() {
        return idFoto;
    }

    public void setIdFoto(int idFoto) {
        this.idFoto = idFoto;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
