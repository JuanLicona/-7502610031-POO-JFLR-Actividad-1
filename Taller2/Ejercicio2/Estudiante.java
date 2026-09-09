package Ejercicio2;

public class Estudiante {

    String Nombre;
    int Edad;

    public Estudiante(){

        this.Nombre="Juan";
        this.Edad=17;

    }

    public Estudiante(String Nombre, int Edad) {

        this.Nombre = Nombre;
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public void ImprimirDetalles() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " +  getEdad());
    }
}
