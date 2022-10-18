/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpruebaguia.entidades;

/**
 *
 * @author tomic
 */
public class Dni {

    private String codigo;
    private long numero;

    public Dni() {

    }

    ;
    
    public Dni(String codigo, long numero) {
        this.codigo = codigo;
        this.numero = numero;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Dni{" + "codigo=" + codigo + ", numero=" + numero + '}';
    }

}
