package Service;

import Entity.Cuota;
import Entity.ENUMTIPOSEGURO;
import Entity.Poliza;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class ServicePoliza {

    private Scanner read;
    private ServiceCliente sCliente;
    private ServiceCuota sCuota;
    private ServiceVehiculo sVehiculo;
    private ArrayList<Cuota> cuotas;

    public ServicePoliza() {

        read = new Scanner(System.in).useDelimiter("\n");
        sCliente = new ServiceCliente();
        sCuota = new ServiceCuota();
        sVehiculo = new ServiceVehiculo();
        cuotas = new ArrayList();

    }

    public Poliza crearPoliza() {

        int year;
        int month;
        int day;
        int cantidadDeCuotas;
        String respuesta;
        String tipoDeSeguro;

        GregorianCalendar fecha = new GregorianCalendar();

        Poliza p1 = new Poliza();

        p1.setCliente(sCliente.crearCliente());

        p1.setVehiculo(sVehiculo.crearVehiculo());

        //Seteo la fecha de inicio
        System.out.println("Ingrese el anio de inicio de la poliza");
        year = read.nextInt();

        System.out.println("Ingrese el mes de inicio de la poliza");
        month = read.nextInt();

        System.out.println("Ingrese el dia de inicio de la poliza");
        day = read.nextInt();

        fecha.set(year, month, day);
        p1.setFechaInicioPoliza(fecha);

        //Seteo la fecha de fin de la poliza
        System.out.println("Ingrese el anio de fin de la poliza");
        year = read.nextInt();

        System.out.println("Ingrese el mes de fin de la poliza");
        month = read.nextInt();

        System.out.println("Ingrese el dia de fin de la poliza");
        day = read.nextInt();

        fecha.set(year, month, day);
        p1.setFechaFinPoliza(fecha);

        //Seteo el tipo de seguro
        System.out.println("Seleccione el tipo de Seguro");

        for (ENUMTIPOSEGURO aux : ENUMTIPOSEGURO.values()) {

            System.out.print(aux);

        }

        tipoDeSeguro = read.next();

        for (ENUMTIPOSEGURO aux : ENUMTIPOSEGURO.values()) {

            if (aux.toString().equalsIgnoreCase(tipoDeSeguro)) {

                p1.setTipoSeguro(aux);

            }

        }

        //Seteo el monto asegurado
        System.out.println("Ingrese el monto asegurado");
        p1.setMontoAsegurado(read.nextDouble());

        //Seteo si incluye granizo
        System.out.println("Incluye granizo? s/n");
        respuesta = read.next();

        if (respuesta.equalsIgnoreCase("s")) {
            p1.setIncluyeGranizo(true);
        } else {
            p1.setIncluyeGranizo(false);
        }

        if (p1.isIncluyeGranizo()) {

            System.out.println("Cuanto es el maximo monto asegurado por granizo");
            p1.setMontoMaximoGranizo(read.nextInt());

        }

        System.out.println("Ingrese la cantidad de cuotas");
        cantidadDeCuotas = read.nextInt();

        for (int i = 0; i < cantidadDeCuotas; i++) {
            Cuota c1 = new Cuota();

            c1 = sCuota.crearCuota();

            cuotas.add(c1);
        }

        p1.setCuotas(cuotas);

        System.out.println("Ingrese el numero de la poliza");

        p1.setNumeroPoliza(read.nextDouble());

        return p1;

    }

}
