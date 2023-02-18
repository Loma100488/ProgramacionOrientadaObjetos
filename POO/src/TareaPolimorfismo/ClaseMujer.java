package TareaPolimorfismo;

public class ClaseMujer extends ClasePersona {
    @Override  //------->> A esto se le conoce como sobreescribir metodos, es decir cuando estamos utilizando el polimorfismo.
    public void Operaciones()
    {
        resultado= nombre + Sexo;
    }
}


