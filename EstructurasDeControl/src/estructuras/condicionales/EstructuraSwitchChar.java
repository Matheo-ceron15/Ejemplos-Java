/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.condicionales;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 *
 * @author Usuario
 */
public class EstructuraSwitchChar {
    public static void main(String[] args) {
         try{
            BufferedReader leer =  new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese el estado civil de la persona");
            String estadoCivil = leer.readLine();
            //llamando al metodo
            switchChar(estadoCivil.toUpperCase().charAt(0));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    //metodo 2
    public static void switchChar(char estadoCivil) {
        String mensajeEstadoCivil;
        
        switch ('S'){
            case 'S':
                mensajeEstadoCivil = "Soltero/a";
            break;
                case 'C':
                mensajeEstadoCivil = "Casado/a";
            break;
                case 'D':
                mensajeEstadoCivil = "Soltero/a";
            break;
                case 'A':
                mensajeEstadoCivil = "Acomàñado/a";
            break;
                case 'F':
                mensajeEstadoCivil = "Forever Alone";
            break;
                default:
                mensajeEstadoCivil = "Estado civil erroneo!!";
        }
        System.out.println("Su estado civil es:  " + mensajeEstadoCivil);
        
    }
}
