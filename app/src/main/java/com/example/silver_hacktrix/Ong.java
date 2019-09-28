package com.example.silver_hacktrix;

public class Ong {
    private String nombre;
    private String nit;
    private String descripcion;
    private String telefono;
    private String contacto;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public Ong(String nombre) {
        this.nombre = nombre;
    }

    public Ong(String nombre, String nit, String descripcion, String telefono, String contacto) {
        this.nombre = nombre;
        this.nit = nit;
        this.descripcion = descripcion;
        this.telefono = telefono;
        this.contacto = contacto;
    }
}
