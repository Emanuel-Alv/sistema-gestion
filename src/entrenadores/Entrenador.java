/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entrenadores;
import personas.Persona;
import disciplinas.TipoDisciplina;
import java.time.LocalDate;
/**
 *
 * @author Student
 */
public class Entrenador extends Persona{
     private TipoDisciplina especialidad; 
     private int experiencia;

    public int getExperiencia() {
        return experiencia;
    }

 
    
   public TipoDisciplina getEspecialidad(){
    return this.especialidad;
   } 

   public void seEspecialidad(TipoDisciplina especialidad) {
        this.especialidad = especialidad;
    }
   
   public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
    
    public Entrenador(int experiencia, TipoDisciplina especialidad, int identificacion, String nombreCompleto, LocalDate fechaNacimiento, int telefonoContacto) {
        super(identificacion, nombreCompleto, fechaNacimiento, telefonoContacto);
        this.especialidad = especialidad;
        this.experiencia = experiencia;
    }
    
    
    @Override
    public String toString() {
        return super.toString() + 
               " Especialidad: " + this.especialidad.getTipo() + 
               " Experiencia: " + this.experiencia + " años";
    }
}