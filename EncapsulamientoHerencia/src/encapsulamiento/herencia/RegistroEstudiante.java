package encapsulamiento.herencia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RegistroEstudiante {
    public static void main(String[] args) throws IOException {
        Estudiante est = new Estudiante();//Objeto de la clase estudiante
        //clase respetctiva para recoger datos del teclado
        BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));
        try{
            System.out.println("Carnet del estudiante:");
            long carnet =  Long.parseLong(leer.readLine());
            System.out.println("Nombre del estudiante: ");
            String nombre = leer.readLine();
            System.out.println("Apellidos: ");
            String apellidos= leer.readLine();
            
            //asignando valores a cada atributo
            est.setCarnetEstudiante(carnet);
            est.setNombreEstudiante(nombre);
            est.setApellidosEstudiante(apellidos);
            
            //recuperacion de datos
            System.out.println("<<<<Recuperando valores>>>>");
            System.out.println("Carnet: " + est.getCarnetEstudiante());
            System.out.println("Nombres: " + est.getNombreEstudiante());
            System.out.println("Apellidos: " + est.getApellidosEstudiante());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
