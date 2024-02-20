package refactorizar;

import java.util.Scanner;

public class MainApuntes {
    public static void main(String[] args) {
        int dia, mes, anyo;
        Scanner teclado= new Scanner(System.in);
        System.out.println ("Introduce un día: ");
        dia = teclado.nextInt();
        System.out.println ("Introduce un mes: ");
        mes = teclado.nextInt();
        System.out.println ("Introduce un año: ");
        anyo = teclado.nextInt();
        Fecha f1=new Fecha(dia,mes,anyo);
        if (f1.valida())
            System.out.println("La fecha: " + dia+"/" + mes + "/"+anyo+ " es válida");
        else
            System.out.println("La fecha: "+dia+"/"+mes+"/"+anyo+" NO es válida");
    }

}
