package p03_01Ariketa11;

import java.util.Scanner;

public class p03_01Ariketa11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] izenak = {"Xurio", "Tespis", "María", "Meltxor", "Elena", "Luisa", "Anabela", "Pedro", "Pello", "Pablo"};

		double[][] altuerak = new double[10][3];

        for (int i = 0; i < 10; i++) {
            System.out.println(izenak[i] + "ren hiru altuera altuak sartzeko:");
            for (int j = 0; j < 3; j++) {
                System.out.print((j + 1) + ". Altuera: ");
                altuerak[i][j] = sc.nextDouble();
            }
        }
        for (int i = 0; i < 10; i++) {
            double altuenBatezBestekoa = 0;
            for (int j = 0; j < 3; j++) {
                altuenBatezBestekoa += altuerak[i][j];
            }
            double altuenBatezBesteko = altuenBatezBestekoa / 3;
            System.out.println(izenak[i] + "en batez bestekoak " + altuenBatezBesteko + " metro da.");
        }

        // Hiru altuera altuen arteko batez besteko altuera kalkulatu
        double[] batezBestekoak = new double[3];
        for (int j = 0; j < 3; j++) {
            double altuenBatezBestekoa = 0;
            for (int i = 0; i < 10; i++) {
                altuenBatezBestekoa += altuerak[i][j];
            }
            batezBestekoak[j] = altuenBatezBestekoa / 10;
        }

        // Pantailan hiru altuera altuen batez bestekoak erakutsi
        for (int j = 0; j < 3; j++) {
            System.out.println("Hiru altuera altuen batez bestekoa " + (j + 1) + ". altitudean: " + batezBestekoak[j] + " metro da.");
        }
    }
}
