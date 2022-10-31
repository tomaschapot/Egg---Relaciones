package Entity;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Cuota {

    private ENUMCUOTA cantidadCuotas;
    private Double montoTotal;
    private boolean estadoPago;
    private GregorianCalendar fechaDeVencimiento;
    private ENUMPAGO formaDePago;

    public Cuota() {

        fechaDeVencimiento = new GregorianCalendar();
    }

    public Cuota(ENUMCUOTA cantidadCuotas, Double montoTotal, boolean estadoPago, GregorianCalendar fechaDeVencimiento, ENUMPAGO formaDePago) {
        this.cantidadCuotas = cantidadCuotas;
        this.montoTotal = montoTotal;
        this.estadoPago = estadoPago;
        this.fechaDeVencimiento = fechaDeVencimiento;
        this.formaDePago = formaDePago;
    }

    public ENUMCUOTA getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(ENUMCUOTA cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public Double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(Double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public boolean isEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(boolean estadoPago) {
        this.estadoPago = estadoPago;
    }

    public GregorianCalendar getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    public void setFechaDeVencimiento(GregorianCalendar fechaDeVencimiento) {
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    public ENUMPAGO getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(ENUMPAGO formaDePago) {
        this.formaDePago = formaDePago;
    }

    @Override
    public String toString() {
        return "Cuota{" + "cantidadCuotas=" + cantidadCuotas + ", montoTotal="
                + montoTotal + ", estadoPago=" + estadoPago + ", fechaDeVencimiento="
                + fechaDeVencimiento.get(Calendar.MONTH) + "/"
                + fechaDeVencimiento.get(Calendar.DATE) + "/" + fechaDeVencimiento.get(Calendar.YEAR)
                + ", formaDePago=" + formaDePago + '}';
    }

}
