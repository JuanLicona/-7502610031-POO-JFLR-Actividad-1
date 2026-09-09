package Ejercicio3;

public class Error {

String Nombre;
int Edad;


    static void main(String[] args) {
Error Erro = new Error();
        System.out.println(Error.getEdad(Erro));

    }
    public Error (){
        this.Nombre = "Felipe";
        this.Edad = 20;
    }

   // public static int getEdad() {
//
   //     return this.Edad;
   // }


    public static int getEdad(Error parametro_que_llega){
        return parametro_que_llega.Edad;
    }
}
