import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class Ejercicio2MoverCeros {
    public static void main(String[] args){
        Object[] receiptArray = {false, 1, 0, 1, 2, 0, 1, 3, "a"};
        Object[] result = moveZero(receiptArray);
        // Imprime el resultado
        System.out.println("Array original: " + Arrays.toString(receiptArray));
        System.out.print("Resultado: ");
        for (Object obj : result) {
            System.out.print(obj + " ");
        }
    }
    private static Object[] moveZero(Object[] receiptArray){
        List<Object> noZeros = new ArrayList<>(); // Para almacenar elementos que no son ceros
        List<Object> zeros = new ArrayList<>();   // Para almacenar todos los ceros

        for (Object obj : receiptArray) {
            if (obj instanceof Integer && (Integer) obj == 0) {
                zeros.add(obj); // Si es un cero, lo agregamos a la lista de ceros
            } else {
                noZeros.add(obj); // Si no es cero, lo agregamos a la lista de no ceros
            }
        }
        // Combina los no ceros y ceros
        noZeros.addAll(zeros);
        // Convierte la lista resultante de vuelta a un array
        return noZeros.toArray();
    }

}
