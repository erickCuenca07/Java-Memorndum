import java.util.Scanner;
public class Ejercicio2CalculoIMC {
    public static void main (String[] args){
        double weight,height;
        Scanner in = new Scanner (System.in);
        //get weight
        System.out.println("Introduzca su peso en kilogramos");
        weight = in.nextDouble();
        System.out.println("");
        //get height
        System.out.println("Introduzca su altura en centrimetos");
        height = in.nextDouble()/100;
        System.out.println("");

        System.out.println(calculateIMC(weight, height));

    }
    private static String calculateIMC(double weight, double height){
        if(height <=0)
            throw new IllegalArgumentException("La altura debe ser mayor que 0");

        double imc = weight / (height * height);

        System.out.println("Para un peso de " + weight + " kilogramos y");
        System.out.println("Para una altura de " + height + " metros");
        System.out.println("El indice de masa corporal es " + (int)imc);

        if (imc <= 18.5) {
            return "Usted tiene infrapeso";
        } else if (imc <= 25.0) {
            return "Usted esta normal";
        } else if (imc <= 30.0) {
            return "Usted tiene sobrepeso";
        } else {
            return "Usted esta obeso";
        }
    }
}
