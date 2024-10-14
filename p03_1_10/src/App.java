
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Zenbat errenkada edukitzea nahi duzu: ");
        int zenb = sc.nextInt();

        // Zenbakiak 1 edo handiagoa izateko ziurtatu
        while (zenb <= 1) {
            System.out.print("Zenbaki bat sartu mesedez: (1 edo handiagoa) ");
            zenb = sc.nextInt();
        }

        // Arrayak sortu
        int[][] arr = new int[zenb][zenb];
        int[][] arr2 = new int[zenb][zenb];

        // Arraya bete erabilzaileak sartutako zenbakiekin.
        for (int i = 0; i < zenb; i++) {
            for (int j = 0; j < zenb; j++) {
                System.out.print("Sartu zenbaki bat: ");
                arr[i][j] = sc.nextInt();
            }
        }

        // arr2 eta arr berdinak izateko, arr arrayaren errenkada eta zutabeak alderantziz jarriko ditugu arr2 arrayan
        for (int i = 0; i < zenb; i++) {
            for (int j = 0; j < zenb; j++) {
                arr2[i][j] = arr[j][i];
            }
        }

        // Simetrikoa den edo ez adierazi
        boolean sim = true;

        // Baldintza ez baldin badute betetzen, simetrikoa ez dela adieraziko du
        for (int i = 0; i < zenb; i++) {
            for (int j = 0; j < zenb; j++) {
                if (arr[i][j] != arr2[i][j]) {
                    sim = false;
                }
            }
        }

        // Arraya pantailaratu.
        for (int i = 0; i < zenb; i++) {
            for (int j = 0; j < zenb; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Simetrikoa den edo ez adierazi
        if (sim) {
            System.out.println("Arraya simetrikoa da.");
        } else {
            System.out.println("Arraya ez da simetrikoa.");
        }
    }
}
