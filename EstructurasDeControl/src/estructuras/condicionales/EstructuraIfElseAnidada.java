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
public class EstructuraIfElseAnidada {
    public static void main(String[] args) {
                try{
            BufferedReader leer =  new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese la cantidad de su salario");
            double salario = Double.parseDouble(leer.readLine());
            //llamando al metodo
            ifElseAnidada(salario);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
           
    }
    public static void ifElseAnidada(double salario) {
        if(salario >235){
            System.out.println("Usted gana mas del salario minimo");
        }
        else if (salario < 0){
            System.out.println("Usted gana menos del salario minimo");
        }else{
            System.out.println("Ingreso de dato erroneo");
        }
        
    }
    
}

