/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author tomic
 */
public class Butaca {

    private Integer numeroDeButaca;
    private String letraButaca;
    private boolean ocupada;

    public Butaca() {

    }

    ;
   
   public Butaca(Integer numeroDeButaca, String letraButaca, boolean ocupada) {
        this.letraButaca = letraButaca;
        this.numeroDeButaca = numeroDeButaca;
        this.ocupada = ocupada;
    }

    public Integer getNumeroDeButaca() {
        return numeroDeButaca;
    }

    public void setNumeroDeButaca(Integer numeroDeButaca) {
        this.numeroDeButaca = numeroDeButaca;
    }

    public String getLetraButaca() {
        return letraButaca;
    }

    public void setLetraButaca(String letraButaca) {
        this.letraButaca = letraButaca;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    @Override
    public String toString() {
        return "Butaca: " + numeroDeButaca + "-" + letraButaca + " Ocupada: " + ocupada+ " ";
    }
   
   

}
