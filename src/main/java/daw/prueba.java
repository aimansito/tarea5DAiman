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
    //getters y setters
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("prueba{");
        sb.append("prueba=").append(prueba);
        sb.append(", numPrueba=").append(numPrueba);
        sb.append('}');
        return sb.toString();
    }
    
    
}
