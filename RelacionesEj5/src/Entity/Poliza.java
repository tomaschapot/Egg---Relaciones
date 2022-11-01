package Entity;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Poliza {

    private Double numeroPoliza;
    private GregorianCalendar fechaInicioPoliza;
    private GregorianCalendar fechaFinPoliza;
    private ArrayList<Cuota> cuotas;
    private Vehiculo vehiculo;
    private Cliente cliente;
    private boolean incluyeGranizo;
    private Integer montoMaximoGranizo;
    private Double montoAsegurado;
    private ENUMTIPOSEGURO tipoSeguro;
    private ENUMCUOTA cantidadDeCuotas;

    public Poliza() {

        cuotas = new ArrayList();
        vehiculo = new Vehiculo();
        cliente = new Cliente();
        fechaInicioPoliza = new GregorianCalendar();
        fechaFinPoliza = new GregorianCalendar();
    }

    public Poliza(Double numeroPoliza, GregorianCalendar fechaInicioPoliza,
            GregorianCalendar fechaFinPoliza, ArrayList<Cuota> cuotas, Vehiculo vehiculo, Cliente cliente,
            boolean incluyeGranizo, Integer montoMaximoGranizo, Double montoAsegurado,
            ENUMTIPOSEGURO tipoSeguro, ENUMCUOTA cantidadCuotas) {

        this.numeroPoliza = numeroPoliza;
        this.fechaInicioPoliza = fechaInicioPoliza;
        this.fechaFinPoliza = fechaFinPoliza;
        this.cuotas = cuotas;
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.incluyeGranizo = incluyeGranizo;
        this.montoMaximoGranizo = montoMaximoGranizo;
        this.montoAsegurado = montoAsegurado;
        this.tipoSeguro = tipoSeguro;
        this.cantidadDeCuotas = cantidadCuotas;
    }

    public Double getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(Double numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public GregorianCalendar getFechaInicioPoliza() {
        return fechaInicioPoliza;
    }

    public void setFechaInicioPoliza(GregorianCalendar fechaInicioPoliza) {
        this.fechaInicioPoliza = fechaInicioPoliza;
    }

    public GregorianCalendar getFechaFinPoliza() {
        return fechaFinPoliza;
    }

    public void setFechaFinPoliza(GregorianCalendar fechaFinPoliza) {
        this.fechaFinPoliza = fechaFinPoliza;
    }

    public ArrayList<Cuota> getCuotas() {
        return cuotas;
    }

    public void setCuotas(ArrayList<Cuota> cuotas) {
        this.cuotas = cuotas;
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

    public ENUMCUOTA getCantidadDeCuotas() {
        return cantidadDeCuotas;
    }

    public void setCantidadDeCuotas(ENUMCUOTA cantidadDeCuotas) {
        this.cantidadDeCuotas = cantidadDeCuotas;
    }

    @Override
    public String toString() {
        return "Poliza{" + "numeroPoliza=" + numeroPoliza + ", fechaInicioPoliza=" + fechaInicioPoliza + ", fechaFinPoliza=" + fechaFinPoliza + ", cuotas=" + cuotas + ", vehiculo=" + vehiculo + ", cliente=" + cliente + ", incluyeGranizo=" + incluyeGranizo + ", montoMaximoGranizo=" + montoMaximoGranizo + ", montoAsegurado=" + montoAsegurado + ", tipoSeguro=" + tipoSeguro + ", cantidadDeCuotas=" + cantidadDeCuotas + '}';
    }

    

}
