
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Arraylist bat izenak gordetzeko
        ArrayList<String> izenLista = new ArrayList<>();

        // Bucle infinito bat
        while (true) {
            System.out.println("");
            System.out.println("Idatzi listan gorde nahi dituzun izenak:");
            String izenak = sc.nextLine();
            System.out.println("");

            // Ikusi 0 dan buclea amaitzeok
            if (izenak.equals("0")) {
                break;
            }

            String[] izenArray = izenak.split(" ");

            // Gehitu izenak arrayetik listara
            for (String izena : izenArray) {
                if (!izenLista.contains(izena)) {
                    izenLista.add(izena);
                } else {
                    System.out.println("");
                    System.out.println("Izen hori jadanik sartu duzu: " + izena);
                    System.out.println("");
                }
            }
            System.out.println("");
            System.out.println("*****************Zerrenda*****************");

            for (String izena : izenLista) {
                System.out.println(izena);
            }

            System.out.println("******************************************");
            System.out.println("");
        }
    }
}
