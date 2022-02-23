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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Servicio s = new Servicio();
        Ahorcado a = new Ahorcado();
        a=s.crearJuego(); 
        boolean aux= true;
        do {
            a=s.buscarLetra(a);
            if(a.getCantJugadas() == 0 || a.getCantLetras() == a.getPalabra().length){
             
                aux = false;
            }
            
        } while (aux);
        
        if(a.getCantLetras() == a.getPalabra().length){
            
            System.out.println("Ganaste!!!");
            System.out.println("La palabra es:" );
            s.mostrar(a.getPalabra());
            
            
        }else{
            
            System.out.println("Perdiste Looser");
            System.out.println("La palabra es:" );
            s.mostrar(a.getPalabra());
        }
        
       
        
        
        
        
    }
    
}
