package p03_01Ariketa14;

import java.util.Random;

public class p03_01Ariketa14 {

    public static void main(String[] args) {

        int[][] biDimentsioa = new int[5][3];
        Random random = new Random();

        int totalZutabe = 0;
        int totalErrenkada = 0;

        // Bi dimentsioako arraya bete
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {

                // 0-5 arteko ausazko zenbakia
                int ausazkoBalioa = random.nextInt(6);
                biDimentsioa[i][j] = ausazkoBalioa;
            }
        }

        // Bi dimentsioako arraya pantailaratu
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(biDimentsioa[i][j] + " ");
            }

            System.out.println();

        }
        int temp = 0;

        // Errenkadaren batur egiteko
        for (int i = 0; i < biDimentsioa[i].length; i++) {
            for (int j = 0; j < biDimentsioa[i].length; j++) {
                temp += biDimentsioa[i][j];
            }
            System.out.println(i + 1 + ".Errenkada batura " + temp + " da");
            totalErrenkada += temp;
            temp = 0;
        }

        // Zutabearen batura egiteko
        for (int i = 0; i < biDimentsioa[i].length; i++) {
            for (int j = 0; j < biDimentsioa[i].length; j++) {
                temp += biDimentsioa[j][i];
            }
            System.out.println(i + 1 + ".Zutabearen batura " + temp + " da");
            totalZutabe += temp;
            temp = 0;
        }

        // Eging duan izango da erekutsi zutabe eta errenkadaren totala
        System.out.println("Zutabe totala: " + totalZutabe);
        System.out.println("Zutabe totala: " + totalErrenkada);

        if (totalErrenkada == totalZutabe) {

            // berdinak baldin badira esango du berdinak dira bestela ez
            System.out.println("Berdinak dira.");
        } else {

            System.out.println("Ez dira berdinak.");
        }
    }
}
