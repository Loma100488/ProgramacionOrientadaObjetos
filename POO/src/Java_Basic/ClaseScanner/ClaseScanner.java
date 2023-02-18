package Java_Basic.ClaseScanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ClaseScanner
{
    public static void main(String[] args)
    {
        System.out.println("Escribe tu nombre");
        Scanner consola = new Scanner(System.in);// esta funcion nos sirve para mandar a ala cosola
        var usuario = consola.nextLine();
        System.out.println("Nombre : " + usuario);
        System.out.println("Escribe tu profesión");
        var profesion = consola.nextLine();
        System.out.println("Usuario: " + profesion + " " + usuario);


    }
}
