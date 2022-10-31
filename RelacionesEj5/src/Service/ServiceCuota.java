package Service;

import Entity.Cuota;
import Entity.ENUMCUOTA;
import Entity.ENUMPAGO;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class ServiceCuota {

    private Scanner read;

    public ServiceCuota() {

        read = new Scanner(System.in).useDelimiter("\n");

    }

    public Cuota crearCuota() {
        
        String cantCuotas;
        String formaDePago;
        String estadoPago;
        GregorianCalendar fechaVencimiento;
        int anio;
        int mes;
        int dia;
        
        
        
        fechaVencimiento = new GregorianCalendar();
        Cuota c1 = new Cuota();

        System.out.println("Ingrese el numero de la cuota");

        for (ENUMCUOTA cuota : ENUMCUOTA.values()) {
            System.out.print(cuota.getNumero() + " ");
        }
        System.out.println("");

        
        cantCuotas = read.next();

        //Setea la cantidad de cuotas.
        for (ENUMCUOTA cuota : ENUMCUOTA.values()) {

            if (cuota.toString().equalsIgnoreCase(cantCuotas) || cuota.getNumero().toString().equalsIgnoreCase(cantCuotas)) {

                c1.setCantidadCuotas(cuota);

            }

        }
        
        
        //Setea la forma de pago
        
        System.out.println("Ingrese la forma de pago");
        
        
        for(ENUMPAGO pago: ENUMPAGO.values()){
            
            System.out.print(pago + " ");
           
            
        }
        System.out.println("");
        
        formaDePago = read.next();
        
        for(ENUMPAGO pago: ENUMPAGO.values()){
            
            if(pago.toString().equalsIgnoreCase(formaDePago)){
                c1.setFormaDePago(pago);
            }
            
        }
        

        //Setea la fecha de vencimiento
        
        System.out.println("Ingrese la fecha de vencimiento de la cuota (Formato en numero)");
        
        System.out.println("---Anio Ej: 1996 ---");

        anio = read.nextInt();
        
        System.out.println("---Mes Ej: 12 ---");
        
        mes = read.nextInt();
        
        System.out.println("---Dia Ej 8---");
        
        dia = read.nextInt();
        
        fechaVencimiento.set(anio, mes,dia);
        
        c1.setFechaDeVencimiento(fechaVencimiento);
        
        
        //Seteo el monto total
        
        System.out.println("Ingrese el monto total de la cuota");
        c1.setMontoTotal(read.nextDouble());
        
        //Seteo si esta paga
        
        System.out.println("Ingrese si esta paga s/n ");
        
        estadoPago = read.next();
        
        if(estadoPago.equalsIgnoreCase("s")){
            c1.setEstadoPago(true);
        }else{
            c1.setEstadoPago(false);
        }
        

        return c1;

    }

}
