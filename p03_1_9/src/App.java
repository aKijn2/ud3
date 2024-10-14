
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Zenbat errenkada kopuru edukitzea nahi duzu: ");
        int errenkadaKop = sc.nextInt();

        // bi dimentsioko array bat
        int[][] arraya = new int[errenkadaKop][];

        // errenkada bakoitzeko zutabe kopurua eskatu
        for (int i = 0; i < errenkadaKop; i++) {
            System.out.println("Sartu " + i + ". errenkadako zutabe kopurua: ");
            int zutabeKop = sc.nextInt();
            arraya[i] = new int[zutabeKop];
        }

        // arraya bete
        for (int i = 0; i < errenkadaKop; i++) {
            for (int j = 0; j < arraya[i].length; j++) {
                System.out.println("Sartu " + i + ". errenkadako " + j + ". zutabea: ");
                arraya[i][j] = sc.nextInt();
            }
        }
    }
}
