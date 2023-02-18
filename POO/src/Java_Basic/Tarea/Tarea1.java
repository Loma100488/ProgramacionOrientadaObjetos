package Java_Basic.Tarea;


//Realizar un programa que calcule el promedio final de tres materias y que el programa nos
// indique si el alumno aprobo reprobo

/*las calificaciones son:
matematicas: 5
Biologia 8
Quimica 7*/


public class Tarea1
{
    public static void main(String[] args)
    {
        float matematicas = 5, Biologia= 8, Quimica =7;
        var resultado = (matematicas + Biologia + Quimica) /3;
        System.out.println("El resultado es: " + resultado);

        if (resultado >=6)
        {
            System.out.println("Aprobaste");
        }
        else {
            System.out.println("Reprobaste");
        }

    }

}
