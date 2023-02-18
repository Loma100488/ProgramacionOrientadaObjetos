package TareaPolimorfismo;


import Java_Advanced.Polimorfismo.PolimorfismoEjemplo2.ClaseHijaResta;
import Java_Advanced.Polimorfismo.PolimorfismoEjemplo2.ClaseHijaSuma;
import Java_Advanced.Polimorfismo.PolimorfismoEjemplo2.ClasePadre;

public class ClasePrincipal{
    public static void main(String[] args)

    {
        System.out.println("Hombre");
        ClasePersona hombre = new ClaseHombre();
        hombre.pedirDatos();
        hombre.Operaciones();
        hombre.MostrarResultado();

        System.out.println("******************");
        System.out.println("Mujer");
        ClasePersona mujer = new ClaseMujer();
        mujer.pedirDatos();
        mujer.Operaciones();
        mujer.MostrarResultado();
    }

}

