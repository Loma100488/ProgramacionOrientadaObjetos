package Java_Advanced.Contructores;

import java.util.Scanner;

public class SinConstructor

{
    private Scanner entrada  =new Scanner(System.in);


    String nombre ="";

    public void PedirNombre()
    {
        System.out.println("¿Cuál es tu nombre?");
        nombre = entrada.nextLine();

    }
    public void imprimir()
    {
        System.out.println("Tu nombre es: " + nombre);


    }


}

