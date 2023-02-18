package Java_Basic.OperadoresYVariables;

public class OperadoresCondicionales {
    public static void main(String[] args) {
        var a = 4;
        var resultado = a >= 15 && a <= 10;

        if (resultado) {
            System.out.println("Dentro de rango");

        } else {
            System.out.println("fuera de rango");
        }
    }
}
