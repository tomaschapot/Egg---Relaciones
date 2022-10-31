package Entity;

public enum ENUMCUOTA {

    UNO(1), DOS(2), TRES(3), CUATRO(4), CINCO(5), SEIS(6), SIETE(7), OCHO(8), NUEVE(9),
    DIEZ(10), ONCE(11), DOCE(12);

    private final Integer numero;

    private ENUMCUOTA(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

}
