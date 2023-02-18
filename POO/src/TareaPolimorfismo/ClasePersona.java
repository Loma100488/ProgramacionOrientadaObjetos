package TareaPolimorfismo;

import java.util.Scanner;

public abstract class ClasePersona
{

        protected String nombre;
    protected String Sexo;
    protected String resultado;

        Scanner entrada = new Scanner(System.in);

        public void pedirDatos()
        {
            System.out.println("Ingresa tu Nombre: ");
            nombre=entrada.nextLine();

            System.out.println("Ingresa tu sexo ");
            Sexo = entrada.nextLine();

        }

        public abstract void Operaciones();

        public void MostrarResultado()

        {

            System.out.println("Tu nombre es : " + nombre + " y tu sexo es: " + Sexo);


        }
}

