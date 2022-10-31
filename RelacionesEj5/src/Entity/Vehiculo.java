package Entity;

public class Vehiculo {

    private String marca;
    private String modelo;
    private Integer anio;
    private Double numeroDeMotor;
    private Double numeroDeChasis;
    private ENUMTIPOVEHICULO tipoVehiculo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, Integer anio, Double numeroDeMotor, Double numeroDeChasis, ENUMTIPOVEHICULO tipoVehiculo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.numeroDeMotor = numeroDeMotor;
        this.numeroDeChasis = numeroDeChasis;
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Double getNumeroDeMotor() {
        return numeroDeMotor;
    }

    public void setNumeroDeMotor(Double numeroDeMotor) {
        this.numeroDeMotor = numeroDeMotor;
    }

    public Double getNumeroDeChasis() {
        return numeroDeChasis;
    }

    public void setNumeroDeChasis(Double numeroDeChasis) {
        this.numeroDeChasis = numeroDeChasis;
    }

    public ENUMTIPOVEHICULO getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(ENUMTIPOVEHICULO tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", numeroDeMotor=" + numeroDeMotor + ", numeroDeChasis=" + numeroDeChasis + ", tipoVehiculo=" + tipoVehiculo + '}';
    }

}
