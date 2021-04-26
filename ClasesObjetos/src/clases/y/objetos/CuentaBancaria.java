package clases.y.objetos;

public class CuentaBancaria {
            long numeroCuenta;
            Cliente propietarioCuenta;//atributo propietariocuenta  del tipo de la clase cliente
            double saldoCuenta;    
    public void abonar(double cantidad) {
        saldoCuenta  += cantidad; //logica de negocio
    }

    public void retirar(double cantidad) {
        if (cantidad>saldoCuenta) {
            System.out.println("!!Saldo insuficiente¡¡");
        }
        saldoCuenta -= cantidad;
    }
        public String datosPropetarioCuenta(){ //metodo para retorno  de los datos 
        String informacion = "";
        informacion += "Dui: " + propietarioCuenta.duiCliente + "\n";
        informacion += "Nombre: " + propietarioCuenta.nombreCliente +"\n";
        informacion += "Telefono: " + propietarioCuenta.telefonoCliente + "\n"; 
        return informacion;
    }
        
}
