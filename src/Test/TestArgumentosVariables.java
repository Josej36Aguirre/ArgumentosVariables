
package Test;


public class TestArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumertos(3,4,5);
        imprimirNumertos(1,2);
        variosParametros("Varios Parametros = ",5,7,9,12,15,18);
    }
    private static void variosParametros(String nombre, int... numeros){
        System.out.println("nombre = " + nombre);
        imprimirNumertos(numeros);
    }
    private static void imprimirNumertos(int... numeros){
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento: "+numeros[i]);
            suma += numeros[i];
            System.out.println("Suma= "+suma);
           
        }
        
    }
}
