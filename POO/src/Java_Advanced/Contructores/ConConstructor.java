package Java_Advanced.Contructores;

import java.util.Scanner;

public class ConConstructor
{
public ConConstructor()
{

    Scanner entrada = new Scanner(System.in);

    String nombre ="";

    System.out.println("¿Cuál es tu nombre?");
    nombre = entrada.nextLine();
    System.out.println("Tu nombre es: " + nombre);

}
}