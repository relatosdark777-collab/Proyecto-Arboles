import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArbolInventario inventario = new ArbolInventario();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- TREE-STOCK INVENTARIO ---");
            System.out.println("1. Registrar Producto\n2. Mostrar Inventario\n3. Buscar Producto\n0. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("ID: "); int id = sc.nextInt();
                    System.out.print("Nombre: "); String n = sc.next();
                    inventario.insertar(id, n);
                    break;
                case 2:
                    inventario.mostrarInorden(inventario.getRaiz());
                    break;
                case 3:
                    System.out.print("ID a buscar: "); int idB = sc.nextInt();
                    System.out.println(inventario.buscar(inventario.getRaiz(), idB) ? "Existe" : "No existe");
                    break;
            }
        } while (opcion != 0);
    }
}