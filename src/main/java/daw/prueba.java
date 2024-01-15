/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author aiman
 */
public class prueba {
    private String prueba ;
    private int numPrueba;
    
    //constructor 

    public prueba(String prueba, int numPrueba) {
        this.prueba = prueba;
        this.numPrueba = numPrueba;
    }
    // constructor por defecto

    public prueba() {
    }

    public String getPrueba() {
        return prueba;
    }

    public void setPrueba(String prueba) {
        this.prueba = prueba;
    }

    public int getNumPrueba() {
        return numPrueba;
    }

    public void setNumPrueba(int numPrueba) {
        this.numPrueba = numPrueba;
    }
    
}
