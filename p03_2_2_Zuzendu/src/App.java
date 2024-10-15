
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Arralist bat non gordeko dira guk ezartzen ditugun izenak
        ArrayList<String> izenLista = new ArrayList<>();

        // bukle infinito bat
        while (true) {
            System.out.println("Idatzi listan gorde nahi dituzun izenak:");
            String izenak = sc.nextLine();

            String[] izenArray = izenak.split(" ");

            // Array batetik ArrayList batetara pasatzen ditugu izenak
            for (String izena : izenArray) {
                if (!izenLista.contains(izena)) {
                    izenLista.add(izena);
                }
            }

            System.out.println("*****************Zerrenda*****************");

            for (String izena : izenLista) {
                System.out.println(izena);
            }

            System.out.println("******************************************");

            System.out.println("Idatzi listan gorde nahi dituzun izenak:");
            String bestea = sc.nextLine();

            // bestea izen berri bat sartu bada, ez da existitzen izen zerrendan
            if (bestea.equals("0")) {
                break;
            } else {
                if (!izenLista.contains(bestea)) {
                    izenLista.add(bestea);
                } else {
                    System.out.println("Izen hori jada existitzen da.");
                }
            }

            // bestea izen berri bat sartu bada, ez da existitzen izen zerrendan
            if (bestea.equals("0")) {
                break;
            } else {
                if (!izenLista.contains(bestea)) {
                    izenLista.add(bestea);
                } else {
                    System.out.println("Izen hori jada existitzen da.");
                }
            }
        }
    }
}
