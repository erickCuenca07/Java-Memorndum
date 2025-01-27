public class Ejercico2SumaDiguitos {
    public static void main (String[] args){
        int number = 12;
        System.out.println("La suma de los dígitos de 1 a " + number + " es: " + addDigits(number));
    }
    private static int addDigits(int repit){
        if(repit <= 0)
            throw new IllegalArgumentException("El numero debe ser mayor que 0");

        int sumTotal = 0;

        for(int i = 1; i <= repit; i++){
            int number = i;
            while(number > 0){
                sumTotal += number % 10; // Esto suma el último dígito del número
                number /=10; //elimina el ultimo diguito
            }
        }
        return sumTotal;
    }
}
