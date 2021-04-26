package clases.y.objetos;

public class Estudiante {
    long carnet ;
    String nombre, apellido;
    public void registroEstudiante () {
        System.out.println("----Metodo para registro de estudiante:----");
    }
    public void consultarEstudiante() {
        System.out.println("----Metodo para consultar estudiante:------");
    }
    public void eliminarEstudiante(){
        System.out.println("----Metodo para eliminar estudiante:-------");
    }
    public static void main(String[] args) {
        Estudiante est = new Estudiante(); //El objeto est es la instancia de la clase Estudiante
        //asignacion de valores
        est.carnet = 1234;
        est.nombre = "Esmeralda";
        est.apellido  ="Hernandez";
        
        est.registroEstudiante();
        est.consultarEstudiante();
        est.eliminarEstudiante();
        
        System.out.println("Carnet    :" + est.carnet);
        System.out.println("Nombre    :" + est.nombre);
        System.out.println("Apellido  :" + est.apellido);
    }
}
