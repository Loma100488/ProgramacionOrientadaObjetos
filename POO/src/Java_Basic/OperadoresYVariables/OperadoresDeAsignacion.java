package Java_Basic.OperadoresYVariables;

public class OperadoresDeAsignacion
{
    public static void main(String[]args)
    {
        //un solo = corresponde a la asignación de valores a una variable
        int a = 1, b =2;
        int c = a + 5 -b;
        System.out.println ("c = " + c);

        var cadena ="hola";
        var cadenaDos ="hola";
        var validacion = cadena == cadenaDos;
        System.out.println ("el resultado es  = " + validacion);//compara referencias de objetos

        var validacionDOS = cadena.equals(cadenaDos);
        System.out.println ("el resultado es  = " + validacionDOS);//compara referencias de objetos
    }


}
