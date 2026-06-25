/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package disciplinas;

/**
 *
 * @author emalv
 */
public enum TipoDisciplina {
    
    Futbol("Futbol"),Basketball("Basketball"),Voleibol("Voleibol");
    
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    private TipoDisciplina(String tipo) {
        this.tipo = tipo;
    }
    
}
