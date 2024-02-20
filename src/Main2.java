import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce el número para la criba de Erastótenes:");
        int dato=teclado.nextInt();
        int vector[]=new int[dato];
        System.out.println("\nVector inicial hasta :"+dato);
        for (int i = 0; i < vector.length; i++) {
            if (i%10==0) System.out.println();
            System.out.print(i+1+"\t");
        }
        vector=generarPrimos(dato);
        System.out.println("\nVector de primos hasta:"+dato);
        for (int i = 0; i < vector.length; i++) {
            if (i%10==0) System.out.println();
            System.out.print(vector[i]+"\t");
        }
    }
    public static int[] generarPrimos (int max)
    {
        if (max >= 2) {
            int dim = max + 1; // Tamaño del array
            boolean[] esPrimo = new boolean[dim];

            extracted(dim, esPrimo);

            extracted1(dim, esPrimo);

            int cuenta = getCuenta(dim, esPrimo);

            int[] primos = getInts(cuenta, dim, esPrimo);
            return primos;
        } else {
            return new int[0];
        }
    }

    private static int[] getInts(int cuenta, int dim, boolean[] esPrimo) {
        int i;
        int j;
        int[] primos = new int[cuenta];
        for (i=0, j=0; i< dim; i++) {
            if (esPrimo[i])
                primos[j++] = i;
        }
        return primos;
    }

    private static int getCuenta(int dim, boolean[] esPrimo) {
        int i;
        int cuenta = 0;
        for (i=0; i< dim; i++) {
            if (esPrimo[i])
                cuenta++;
        }
        return cuenta;
    }

    private static void extracted1(int dim, boolean[] esPrimo) {
        int j;
        int i;
        for (i=2; i<Math.sqrt(dim)+1; i++) {
            if (esPrimo[i]) {
                for (j=2*i; j< dim; j+=i)
                    esPrimo[j] = false;
            }
        }
    }

    private static void extracted(int dim, boolean[] esPrimo) {
        int i;
        for (i=0; i< dim; i++)
            esPrimo[i] = true;

        esPrimo[0] = esPrimo[1] = false;
    }
}
