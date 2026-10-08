public class Main {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Par<String, Integer>[] productos = (Par<String, Integer>[]) new Par[4];
        productos[0] = new Par<>("Agua", 300);
        productos[1] = new Par<>("Combustible", 500);
        productos[2] = new Par<>("Comida", 150);
        productos[3] = new Par<>("Repuestos", 80);

        Caja<Integer> caja = new Caja<>(productos.length);
        Integer[] cantidades = new Integer[productos.length];
        for (int i = 0; i < productos.length; i++) {
            caja.agregar(productos[i].getValor());
            cantidades[i] = productos[i].getValor();
        }

        int mayor = Utilidades.maximo(cantidades);
        if (mayor == caja.obtenerMayor()) {
            for (Par<String, Integer> p : productos) {
                if (p.getValor() == mayor) {
                    System.out.println("Producto con mayor cantidad: " + p);
                }
            }
        }
    }
}