package Java_Advanced.Contructores;

public class ClasePrincipal
{

    public static void main(String[] args)
    {

        //Instancia a la clase que no tiene constructor
        SinConstructor sin = new SinConstructor();
        sin.PedirNombre();
        sin.imprimir();

        ConConstructor con = new ConConstructor();
    }
}
