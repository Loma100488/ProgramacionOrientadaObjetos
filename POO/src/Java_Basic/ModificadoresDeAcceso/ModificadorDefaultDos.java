package Java_Basic.ModificadoresDeAcceso;

class ModificadorDefaultDos
{
    public static void main(String[] args)
    {

            ModificadorDefault objModificadorDefault = new ModificadorDefault();
           // ModificadorPrivate objModificadorPrivate = new ModificadorPrivate();
             MetodoPublico objModificadorPublico = new MetodoPublico();

            objModificadorDefault.ejemplo();
            objModificadorDefault.ejemploDos();
            //objModificadorPrivate.
            objModificadorPublico.ejemplocuatro();

            /*Modificador de acceso por defecto, nos permite acceder a los metodos o atributos de una clase.
        Siempre y cuando se encuentren en el mismo package, sino estuviera las dos clases en el mismo package,
        al utilizar este modificador de acceso, nos devolveria un error del compilacion*/

        }

}
