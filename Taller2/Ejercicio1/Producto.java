package Ejercicio1;

public class Producto {

    String Nombre;
    int Precio;


    public Producto() {
        this.Nombre = "";
        this.Precio = 0;
    }

    public Producto(String Nombre, int Precio) {

        this.Nombre = Nombre;
        this.Precio = Precio;
    }

    public void MostrarProducto() {
        System.out.println("Nombre: " + Nombre);
        System.out.println("Precio: " + Precio);

    }
}
