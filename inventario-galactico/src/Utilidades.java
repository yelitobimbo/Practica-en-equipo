public class Utilidades {

    public static <T> void intercambiar(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static <T> int contar(T[] arr, T elemento) {
        int total = 0;
        for (T x : arr) {
            if (x.equals(elemento)) total++;
        }
        return total;
    }

    public static <T extends Comparable<T>> T maximo(T[] arr) {
        T mayor = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(mayor) > 0) mayor = arr[i];
        }
        return mayor;
    }
}