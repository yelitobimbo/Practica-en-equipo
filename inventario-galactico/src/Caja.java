public class Caja<T extends Comparable<T>> {
    private T[] elementos;
    private int cantidad;

    @SuppressWarnings("unchecked")
    public Caja(int capacidad) {
        elementos = (T[]) new Comparable[capacidad];
        cantidad = 0;
    }

    public void agregar(T elemento) {
        if (cantidad == elementos.length) {
            throw new IllegalStateException("La caja está llena (capacidad: " + elementos.length + ")");
        }
        elementos[cantidad++] = elemento;
    }

    public T obtenerMayor() {
        if (cantidad == 0) {
            throw new IllegalStateException("La caja está vacía, no hay mayor");
        }
        T mayor = elementos[0];
        for (int i = 1; i < cantidad; i++) {
            if (elementos[i].compareTo(mayor) > 0) mayor = elementos[i];
        }
        return mayor;
    }

    public T obtenerMenor() {
        if (cantidad == 0) {
            throw new IllegalStateException("La caja está vacía, no hay menor");
        }
        T menor = elementos[0];
        for (int i = 1; i < cantidad; i++) {
            if (elementos[i].compareTo(menor) < 0) menor = elementos[i];
        }
        return menor;
    }
}