
public class App {

    public static void main(String[] args) throws Exception {

        // 4x4 matrize bat sortu dugu
        int[][] matrizea = new int[4][4];
        int diagonalNagusia = 0;

        // Matrizea bete eta pantailaratu
        for (int i = 0; i < matrizea.length; i++) {
            for (int j = 0; j < matrizea[i].length; j++) {
                matrizea[i][j] = (int) (Math.random() * 100) + 1;
                System.out.print(matrizea[i][j] + " ");
                if (i == j) {
                    diagonalNagusia += matrizea[i][j];
                }
            }
            System.out.println();
        }

        int diagonalNagusiaGainetik = 0;
        int diagonalNagusiaAzpitik = 0;

        // Diagonal nagusiaren gainetik eta azpitik dauden elementuen geiqueta kalkulatu
        for (int i = 0; i < matrizea.length; i++) {
            for (int j = 0; j < matrizea[i].length; j++) {
                if (i < j) {
                    diagonalNagusiaGainetik += matrizea[i][j];
                } else if (i > j) {
                    diagonalNagusiaAzpitik += matrizea[i][j];
                }
            }
        }

        // Emaitzak pantailaratu
        System.out.println("Diagonal nagusiaren gainetik dauden elementuen eta azpitik dauden elementuen biderkaduraren batura: "
                + (diagonalNagusiaGainetik + diagonalNagusiaAzpitik));
    }
}
