package Modelos;

import java.time.LocalDate;

public class Persona {

    // Atributos

    private String id;
    private String nombre;
    private String apellido;
    private String correo;
    private String numeroDocumento;
    private String telefono;
    private LocalDate fechaNacimiento;

    // Constructor
    public Persona() {}

    // Métodos Persona

    // Getters & Setters

    // id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id != null) {

            this.id = id;
        } else {
            System.out.println("El id no puede estar vacio");
        }
    }

    // nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // apellido
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // correo
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    // Documento
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    // Telefono
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {

    }

    // Fecha Nacimiento
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

}
