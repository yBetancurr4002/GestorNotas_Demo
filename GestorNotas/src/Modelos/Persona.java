package Modelos;

import java.time.LocalDate;
import java.time.Period;

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

    public Persona(
            String id,
            String nombre,
            String apellido,
            String correo,
            String numeroDocumento,
            String telefono,
            LocalDate fechaNacimiento
            ) {

        /*
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.numeroDocumento = numeroDocumento;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        */
        setId(id);
        setNombre(nombre);
        setApellido(apellido);
        setCorreo(correo);
        setNumeroDocumento(numeroDocumento);
        setTelefono(telefono);
        setFechaNacimiento(fechaNacimiento);
    }

    // Métodos Persona

    // CalcularEdad
    public int ObtenerEdad() {
        // Restar la Hoy() - FechaNacimiento
        LocalDate fechaNacimiento = getFechaNacimiento();
        LocalDate fechaActual = LocalDate.now();
        return fechaActual.getYear() - fechaNacimiento.getYear();
    }

    public int ObtenerEdadPorIA() {
        LocalDate hoy = LocalDate.now(); // Obtiene la fecha actual del sistema
        Period periodo = Period.between(fechaNacimiento, hoy);
        return periodo.getYears();
    }

    // MostrarInfo Basica
    public String mostrarInfoBasica() {
        return String.format("Nombre: %s %s, Edad: %d años, Correo: %s",
                nombre, apellido, correo);
    }

    public String mostrarInfoBasicaIa() {
        return "Nombre: " + nombre + " " + apellido +
                ", Edad: " +
                ", Correo: " + correo;
    }
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
        if (nombre != null) {
            this.nombre = nombre;
        } else {
            System.out.println("El nombre no puede estar vacio");
        }

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
        this.telefono = telefono;
    }

    // Fecha Nacimiento
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

}
