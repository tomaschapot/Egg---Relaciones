package Service;

import Entity.Cliente;
import java.util.Scanner;

public class ServiceCliente {

    private Scanner read;

    public ServiceCliente() {

        read = new Scanner(System.in).useDelimiter("\n");

    }

    ;
    
    
    private Cliente crearCliente() {

        Cliente cliente = new Cliente();

        System.out.println("Ingrese el nombre del cliente");
        cliente.setNombre(read.next());

        System.out.println("Ingrese el apellido del cliente");
        cliente.setApellido(read.next());
    
        System.out.println("Ingrese el DNI del cliente");
        cliente.setDni(read.nextInt());

        System.out.println("Ingrese el domicilio del cliente");
        cliente.setDomicilio(read.next());

        System.out.println("Ingrese el telefono del cliente");
        cliente.setTelefono(read.next());
        
        System.out.println("Ingrese el email del cliente");
        cliente.setEmail(read.next());

        return cliente;

    }
    

}
