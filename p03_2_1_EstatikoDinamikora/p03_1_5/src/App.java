
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Sartu nahi dituzun balioak arrayean:");
        int zenbakiBal = sc.nextInt();

        // Array dinamiko bat guk sartzen ditugun balioarekin
        int[] zenbakiak = new int[zenbakiBal];

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
