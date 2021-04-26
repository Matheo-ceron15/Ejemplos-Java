package encapsulamiento.herencia;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TransaccionesBancarias {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        BufferedReader leer = new  BufferedReader( new InputStreamReader(System.in));
        
        double abonoCuenta, cargoCuenta;
        try {
        //ingreso respectivo de la herencia
        System.out.println("Dui del cliente: ");
        Long numDui= Long.parseLong(leer.readLine());
        System.out.println("Nombre cliente: ");
        String nombres = leer.readLine();
        System.out.println("Telefono del cliente: ");
        String telefono = leer.readLine();
        //ingreso de valores de prueba  
        System.out.println("Ingresar el abono a la cuenta: ");
        abonoCuenta = Double.parseDouble(leer.readLine());
        System.out.println("Ingresar el cargo a la cuenta");
        cargoCuenta = Double.parseDouble(leer.readLine());
        
        //asignar valores de los atributos heredados
        cuenta.setNumDui(numDui);
        cuenta.setNomCliente(nombres);
        cuenta.setTelCliente(telefono);
        //asignar valores al metodo SET
        cuenta.setAbonoCuenta(abonoCuenta);
        cuenta.setCargoCuenta(cargoCuenta);
        cuenta.setSaldoCuenta();
        
        //retorno de valores del metodo get de la clase heredada
            System.out.println("Numero de Dui: " + cuenta.getNumDui());
            System.out.println("Nombre del cliente: " + cuenta.getNomCliente());
            System.out.println("Telefono del cliente: " + cuenta.getTelCliente());
        //retornar valores con el metodo GET
        System.out.println("Abono: " + cuenta.getAbonoCuenta());
        System.out.println("Cargo: " + cuenta.getCargoCuenta());
        System.out.println("Saldo: " + cuenta.getSaldoCuenta());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        //PASO 8, PAGINA 11
    }
}
