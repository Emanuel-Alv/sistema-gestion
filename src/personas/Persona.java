/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;
import java.time.LocalDate;
import java.time.Period;
/**
 *
 * @author Student
 */
public class Persona {
    private int identificacion;
    private String nombreCompleto;
    private LocalDate fechaNacimiento;
    private int telefonoContacto;
    
    public int getIdentificacion(){
        return identificacion;
    }
    
    public String getNombreCompleto(){
        return nombreCompleto;
    }
    
    public LocalDate getFechaNacimiento(){
        return fechaNacimiento;
    }
    
    public int getTelefonoContacto(){
        return telefonoContacto;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setTelefonoContacto(int telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public int getEdad(){
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    public Persona(int identificacion, String nombreCompleto, LocalDate fechaNacimiento, int telefonoContacto) {
        this.identificacion = identificacion;
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
        this.telefonoContacto = telefonoContacto;
    }

    @Override
    public String toString() {
        return  "Identificacion: " + identificacion + 
                "Nombre Completo:" + nombreCompleto + 
                "Fecha Nacimiento: " + fechaNacimiento + 
                "Edad: " + getEdad() + "Años"+
                "telefono Contacto=" + telefonoContacto;
    } 
}
