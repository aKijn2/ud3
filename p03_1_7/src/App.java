
public class App {

    public static void main(String[] args) throws Exception {

        //5x5 matrize bidimentsionala sortzen
        int[][] matrizea = new int[5][5];
        for (int i = 0; i < matrizea.length; i++) {
            for (int j = 0; j < matrizea[i].length; j++) {
                // Diagonal nagusia 1 eta bestea 0
                if (i == j) {
                    matrizea[i][j] = 1;
                } else {
                    matrizea[i][j] = 0;
                }
            }
        }

        // Matrizea inprimatzen
        for (int i = 0; i < matrizea.length; i++) {
            for (int j = 0; j < matrizea[i].length; j++) {
                System.out.print(matrizea[i][j] + " ");
            }
            System.out.println();
        }
    }
}
