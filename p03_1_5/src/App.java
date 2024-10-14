
public class App {

    public static void main(String[] args) throws Exception {

        int zenbakiak[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        /**
         * Arrayko elementu baikoitza bere burua biderkatuko du eta emaitza
         * imprimatuko da.
         *
         */
        for (int i = 0; i < zenbakiak.length; i++) {
            zenbakiak[i] = zenbakiak[i] * zenbakiak[i];
            System.out.println(zenbakiak[i]);
        }
    }
}
