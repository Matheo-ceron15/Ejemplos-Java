package encapsulamiento.herencia;

public class ConvertirTipoDato {
    public static void main(String[] args) {
        ConvertirTipoDato polimorfismo  =  new ConvertirTipoDato();
        System.out.println("Valor int a String: " + polimorfismo.convertirAString(10));
        System.out.println("valor double a String; " + polimorfismo.convertirAString(10.0));
        System.out.println("Valor float a String: " + polimorfismo.convertirAString(10.12));
    }       
        public String convertirAString (int valorInt){
        String  conversion = String.valueOf(valorInt);
        return conversion;
        }
        public String convertirAString (double valorDouble){
        String  conversion = String.valueOf(valorDouble);
        return conversion;
        }
        public String convertirAString (float valorFloat){
        String  conversion = String.valueOf(valorFloat);
        return conversion;
        }
        
}
