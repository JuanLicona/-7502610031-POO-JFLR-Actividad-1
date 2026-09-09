package Ejercicio2;

public class Intancia {

    static void main(String[] args) {

        Matematicas.n1 = 5;
        Matematicas.n2 = 3;


        Matematicas.Suma();
        System.out.println("Suma:" + Matematicas.Resultado);

        Matematicas.Resta();
        System.out.println("Resta:" + Matematicas.Resultado);

        Matematicas.Multiplicacion();
        System.out.println("Multiplicacion:" + Matematicas.Resultado);

        Matematicas.Division();
        System.out.println("Division:" + Matematicas.Resultado);
    }
}
