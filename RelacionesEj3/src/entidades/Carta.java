/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import enums.Numero;
import enums.Palo;

/**
 *
 * @author tomic
 */
public class Carta {
    
    private Numero numero;
    private Palo palo;
    
    public Carta(){
        
    };
    
    public Carta(Numero numero, Palo palo){
        
        this.palo = palo;
        this.numero = numero;
    }

    public Numero getNumero() {
        return numero;
    }

    public void setNumero(Numero numero) {
        this.numero = numero;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Carta: " + numero +" " + palo ;
    }
    
    
    
}
