package Entity;

import java.util.Date;

public class Poliza {

    private Double numeroPoliza;
    private Date fechaInicioPoliza;
    private Date fechaFinPoliza;
    private Cuota cuota;
    private Vehiculo vehiculo;
    private Cliente cliente;
    private boolean incluyeGranizo;
    private Integer montoMaximoGranizo;
    private Double montoAsegurado;
    private ENUMTIPOSEGURO tipoSeguro;

    public Poliza() {

        cuota = new Cuota();
        vehiculo = new Vehiculo();
        cliente = new Cliente();
        fechaInicioPoliza = new Date();
        fechaFinPoliza = new Date();
    }

    public Poliza(Double numeroPoliza, Date fechaInicioPoliza,
            Date fechaFinPoliza, Cuota cuota, Vehiculo vehiculo, Cliente cliente,
            boolean incluyeGranizo, Integer montoMaximoGranizo, Double montoAsegurado,
            ENUMTIPOSEGURO tipoSeguro) {

        this.numeroPoliza = numeroPoliza;
        this.fechaInicioPoliza = fechaInicioPoliza;
        this.fechaFinPoliza = fechaFinPoliza;
        this.cuota = cuota;
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.incluyeGranizo = incluyeGranizo;
        this.montoMaximoGranizo = montoMaximoGranizo;
        this.montoAsegurado = montoAsegurado;
        this.tipoSeguro = tipoSeguro;
    }

    public Double getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(Double numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public Date getFechaInicioPoliza() {
        return fechaInicioPoliza;
    }

    public void setFechaInicioPoliza(Date fechaInicioPoliza) {
        this.fechaInicioPoliza = fechaInicioPoliza;
    }

    public Date getFechaFinPoliza() {
        return fechaFinPoliza;
    }

    public void setFechaFinPoliza(Date fechaFinPoliza) {
        this.fechaFinPoliza = fechaFinPoliza;
    }

    public Cuota getCuota() {
        return cuota;
    }

    public void setCuota(Cuota cuota) {
        this.cuota = cuota;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean isIncluyeGranizo() {
        return incluyeGranizo;
    }

    public void setIncluyeGranizo(boolean incluyeGranizo) {
        this.incluyeGranizo = incluyeGranizo;
    }

    public Integer getMontoMaximoGranizo() {
        return montoMaximoGranizo;
    }

    public void setMontoMaximoGranizo(Integer montoMaximoGranizo) {
        this.montoMaximoGranizo = montoMaximoGranizo;
    }

    public Double getMontoAsegurado() {
        return montoAsegurado;
    }

    public void setMontoAsegurado(Double montoAsegurado) {
        this.montoAsegurado = montoAsegurado;
    }

    public ENUMTIPOSEGURO getTipoSeguro() {
        return tipoSeguro;
    }

    public void setTipoSeguro(ENUMTIPOSEGURO tipoSeguro) {
        this.tipoSeguro = tipoSeguro;
    }

    @Override
    public String toString() {
        return "Poliza{" + "numeroPoliza=" + numeroPoliza
                + ", fechaInicioPoliza=" + fechaInicioPoliza + ", fechaFinPoliza="
                + fechaFinPoliza + ", cuota=" + cuota + ", vehiculo=" + vehiculo
                + ", cliente=" + cliente + ", incluyeGranizo=" + incluyeGranizo
                + ", montoMaximoGranizo=" + montoMaximoGranizo + ", montoAsegurado="
                + montoAsegurado + ", tipoSeguro=" + tipoSeguro + '}';
    }

}
