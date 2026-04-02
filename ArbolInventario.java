public class ArbolInventario {
    private Producto raiz;

    public void insertar(int id, String nombre) {
        raiz = insertarRecursivo(raiz, id, nombre);
    }

    private Producto insertarRecursivo(Producto actual, int id, String nombre) {
        if (actual == null) return new Producto(id, nombre);
        if (id < actual.id) actual.izquierdo = insertarRecursivo(actual.izquierdo, id, nombre);
        else if (id > actual.id) actual.derecho = insertarRecursivo(actual.derecho, id, nombre);
        return actual;
    }

    public void mostrarInorden(Producto actual) {
        if (actual != null) {
            mostrarInorden(actual.izquierdo);
            System.out.println("ID: " + actual.id + " | Nombre: " + actual.nombre);
            mostrarInorden(actual.derecho);
        }
    }

    public boolean buscar(Producto actual, int id) {
        if (actual == null) return false;
        if (id == actual.id) return true;
        return id < actual.id ? buscar(actual.izquierdo, id) : buscar(actual.derecho, id);
    }

    public Producto getRaiz() { return raiz; }
}