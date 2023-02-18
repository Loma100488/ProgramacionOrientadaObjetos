package Java_Basic.SentenciasDeControl;

import java.util.Arrays;

public class SentenciasDeControl

{
    public static void main(String[] args)
    {

        boolean condicion = true;

        if(condicion)
        {
            System.out.println("condicion verdadera");
        }
        else
        {
            System.out.println("Condicion falsa");
        }
        System.out.println(" ");

        int x = 9;

        if (x== 10 || x >=12)
        {
            System.out.println("Esto es correcto");
        }
        else {
            System.out.println("Esto es incorrecto");
        }
        System.out.println(" ");

        int numero =7;
       String texto = "Numero Desconocido";
        if  (numero ==1)
        {
            texto ="Numero uno";
        }
        else if(numero == 2)
        {
            texto = "Numero dos";
        }
        else if (numero == 3)
        {
            texto = "Numero tres";
        }
        else if (numero ==4){
            texto ="Numero cuatro";
        }
        else {
            texto = "Numero Desconocido";
        }
        System.out.println("Texto : " + texto);
    }
}
