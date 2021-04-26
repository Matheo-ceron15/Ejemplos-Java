package clases.y.objetos;

import java.util.Scanner;

public class TransaccionesBancarias {
    public static void main(String[] args) {

        CuentaBancaria cuenta = new CuentaBancaria();
        Scanner leer = new Scanner (System.in);
        
        String duiCliente, nombreCliente;
        long telefonoCliente;
        double abono, retiro;
        System.out.println("Ingrese los datos que solicitan:");
        System.out.println("Nombre del propietario:");
        nombreCliente=leer.nextLine();
        System.out.println("Numero de Dui:");
        duiCliente=leer.nextLine();
        System.out.println("Telefono:");
        telefonoCliente=leer.nextLong();
        Cliente propietario = new Cliente(duiCliente, nombreCliente, telefonoCliente); //crear objeto propietario
        cuenta.propietarioCuenta=propietario;
        
        System.out.println("Ingresar la cantidad a abonar: ");
        cuenta.abonar(abono=leer.nextDouble());
        System.out.println("Ingrese cantidad a retirar: ");
        cuenta.retirar(retiro=leer.nextDouble());
        System.out.println("------------------------");
        System.out.println("Su saldo en la cuenta es: " + cuenta.saldoCuenta);//obtener saldo cuenta
        

        System.out.println("Datos del propietario: \n" + cuenta.datosPropetarioCuenta());
    }
}
