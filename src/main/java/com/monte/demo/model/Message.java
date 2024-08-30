package com.monte.demo.model;

public class Message {
    private String nombre;
    private String version;
    private String mensaje;

    // Constructor
    public Message(String nombre, String version, String mensaje) {
        this.nombre = nombre;
        this.version = version;
        this.mensaje = mensaje;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

}
