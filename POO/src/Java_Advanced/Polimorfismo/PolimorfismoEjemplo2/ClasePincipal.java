package Java_Advanced.Polimorfismo.PolimorfismoEjemplo2;

public class ClasePincipal {

    public static void main(String[] args)

    {
        System.out.println("Suma");
    ClasePadre suma = new ClaseHijaSuma();
    suma.pedirDatos();
    suma.Operaciones();
    suma.MostrarResultado();

        System.out.println("******************");
        System.out.println("Resta");
        ClasePadre resta = new ClaseHijaResta();
        resta.pedirDatos();
        resta.Operaciones();
        resta.MostrarResultado();
    }

}
