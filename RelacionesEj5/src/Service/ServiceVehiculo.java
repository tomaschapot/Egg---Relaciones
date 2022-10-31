package Service;

import Entity.ENUMTIPOVEHICULO;
import Entity.Vehiculo;
import java.util.Scanner;

public class ServiceVehiculo {

    private Scanner read;

    public ServiceVehiculo() {

        read = new Scanner(System.in).useDelimiter("\n");

    }

    public Vehiculo crearVehiculo() {

        String tipoVehiculo;

        Vehiculo v1 = new Vehiculo();

        System.out.println("Ingrese el tipo de vehiculo");

        for (ENUMTIPOVEHICULO tipo : ENUMTIPOVEHICULO.values()) {
            System.out.print(tipo);
        }

        System.out.println("");

        tipoVehiculo = read.next();

        for (ENUMTIPOVEHICULO tipo : ENUMTIPOVEHICULO.values()) {
            if (tipo.toString().equalsIgnoreCase(tipoVehiculo)) {

                v1.setTipoVehiculo(tipo);

            }
        }

        System.out.println("Ingrese el anio del vehiculo");
        v1.setAnio(read.nextInt());

        System.out.println("Ingrese la marca");
        v1.setMarca(tipoVehiculo);

        System.out.println("Ingrese el modelo");
        v1.setModelo(read.next());

        System.out.println("Ingrese el numero de Chasis");
        v1.setNumeroDeChasis(read.nextDouble());

        System.out.println("Ingrese el numero de motor");
        v1.setNumeroDeMotor(read.nextDouble());

        return v1;

    }

}
