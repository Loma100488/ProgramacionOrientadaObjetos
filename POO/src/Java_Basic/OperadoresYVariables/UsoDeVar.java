package Java_Basic.OperadoresYVariables;

import java.net.SocketOption;

public class UsoDeVar
{
    public static void main(String[]args)
    {
        //uso de la palabra reservada "var", infiere en los tipos de datos
        var intEntera = 10;
        System.out.println(intEntera);
        var miNombre = "Alberto";

                //concatenacion con variable
        System.out.println("Mi nombre es : " + miNombre);

        //concatenacion de variables ejemplo 2

        var usuario = "Lopez";
        var ocupacion = "tester";
        var perfil = ocupacion + " " + usuario;
        System.out.println ("Perfil :" + perfil);

        var i =3;
        var j = 4;

        System.out.println(i + j);// se realiza la suma ya que no hay un texto previo
        System.out.println (i + j + " " + perfil);//evalua de izquierda a derecha, realiza la suma y coloca el texto
        System.out.println(perfil + i + j);//contexto cadena


    }
}
