package Java_Advanced.Polimorfismo.PolimorfismoEjemplo2;

public class ClaseHijaSuma extends ClasePadre

{
    @Override  //------->> A esto se le conoce como sobreescribir metodos, es decir cuando estamos utilizando el polimorfismo.
    public void Operaciones()
    {
        resultado= valorUno + valorDos;
    }
}
