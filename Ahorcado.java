/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjAhorcado;

/**
 *
 * @author Bruno
 */
public class Ahorcado {
    
    private String[] palabra;
    private String [] asteriscos;
    private int cantLetras;
    private int cantJugadas;

    public Ahorcado(String[] palabra, String[] asteriscos, int cantLetras, int cantJugadas) {
        this.palabra = palabra;
        this.asteriscos = asteriscos;
        this.cantLetras = cantLetras;
        this.cantJugadas = cantJugadas;
    }

    public Ahorcado() {
    }

    public String[] getAsteriscos() {
        return asteriscos;
    }

    public void setAsteriscos(String[] asteriscos) {
        this.asteriscos = asteriscos;
    }

    
    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public void setCantLetras(int cantLetras) {
        this.cantLetras = cantLetras;
    }

    public void setCantJugadas(int cantJugadas) {
        this.cantJugadas = cantJugadas;
    }
    

    public int getCantLetras() {
        return cantLetras;
    }

    public int getCantJugadas() {
        return cantJugadas;
    }
    
    
    
}
