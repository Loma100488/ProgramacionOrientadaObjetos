package Java_Basic.Ciclos;

public class For {
    public static void main(String[] args) {
        /*for (int i =0; i <10; i++) //Este incremento se usa de 1 en 1
        {
            System.out.println("for 1 : " + i);
        }
        System.out.println("");
        System.out.println("****************************************");
        System.out.println("****************************************");
            for (int i =0; i <10; i+=3)//Esta sintaxis se usa para decidir el incremento
            {
                System.out.println("for 2 : " + i);
            }
        System.out.println("****************************************");
        System.out.println("****************************************");

        for (int i =1; i<=10; i++ ){
            if (i==7)
            {
                break;
            }
            System.out.println("for 3: " + " " + i);
        }*/
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                continue;
            }
            System.out.println("for 4: " + " " + i);
        }
    }
}


