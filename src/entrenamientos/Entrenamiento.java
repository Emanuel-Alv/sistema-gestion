/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entrenamientos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Student
 */
public class Entrenamiento {
    private LocalDate fecha;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private int [] asistencia;
    
    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public LocalTime getHoraFinal() {
        return horaFin;
    }

    public int[] getAsistencia() {
        return asistencia;
    }
    
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setHoraFinal(LocalTime horaFinal) {
        this.horaFin = horaFin;
    }
    
    public int getDuracion(){
        //esto calcula la duracion en minutos entre dos horas
        return (int) ChronoUnit.MINUTES.between(horaInicio, horaFin);
    }

    public Entrenamiento(LocalDate fecha, LocalTime horaInicio, LocalTime horaFin, int[] asistencia) {
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.asistencia = asistencia;
    }
    
    public void registrarAsistencia(int i, int valor){
        if(i >= 0 && i < asistencia.length){
            this.asistencia[i] = valor;
        }else{
            System.out.println("Indice del atleta no valido");}
    }
        
    public int totalAsistencia(){
        int conta = 0;
        for (int estado : asistencia){
            if (estado==1){
                conta++;
            }
        }
        return conta--;
    }
    
    @Override
    public String toString() {
        return "Fecha: " + fecha + 
               "Hora Inicio: " + horaInicio + 
               "Hora Fin=" + horaFin + 
               "Duracion: " + getDuracion()+
               "Asistencia: " + getAsistencia();
    }
       
}