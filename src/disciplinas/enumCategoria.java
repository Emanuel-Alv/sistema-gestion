/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package disciplinas;


public enum enumCategoria {
    INFANTIL("Niños"), JUVENIL("Adolescentes"), ADULTA("Adultos");
    private String categoria;
    
    public String getCategoria(){
        return this.categoria ;   
    }

    private enumCategoria(String categoria) {
        this.categoria = categoria;
    }
}
