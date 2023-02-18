package Java_Basic.ClasesYObjetos;

public class PruebaPersona

{

    public static void main(String[] args)
    {
    Persona objPersona = new Persona();

    objPersona.nombre = "Alberto";
    objPersona.apellido="Lopez";
    objPersona.genero="Hombre";
    objPersona.edad=34;
    objPersona.nacionalidad="Mexicana";

    objPersona.MostrarInformacion();
    }

}
