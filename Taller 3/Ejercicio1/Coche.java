package Ejercicio1;

public class Coche {

    String marca;
    int modelo;
    static int contadoCoches;

public Coche(){
    Incremento();
}

    public static void Incremento(){
        contadoCoches++;
    }
}
