import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Producto {
    private String nombre;
    private String codigo;
    private double precio;
    private int cantidad;

    public Producto(String nombre, String codigo, double precio, int cantidad) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nCódigo: " + codigo + "\nPrecio: " + precio + "\nCantidad: " + cantidad;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Producto> listaProductos = new ArrayList<>();
        for (int producto = 1; producto <= 20; producto++) {
            System.out.print("Producto #" + producto + ": ");
            System.out.print("\nIngrese el nombre del producto: ");
            String nombre = scanner.next();
            System.out.print("Ingrese el codigo del producto: ");
            String codigo = scanner.next();
            System.out.print("Ingrese el precio del producto: ");
            double precio = scanner.nextDouble();
            System.out.print("Ingrese la cantidad del producto: ");
            int cantidad = scanner.nextInt();

            Producto nuevoProducto = new Producto(nombre, codigo, precio, cantidad);
            listaProductos.add(nuevoProducto);
        }
        Collections.sort(listaProductos, Comparator.comparing(Producto::getNombre));
        for (Producto producto : listaProductos) {
            System.out.println(producto);
        }
    }
}
