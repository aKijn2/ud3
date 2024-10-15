package p03_01Ariketa11;

import java.util.Scanner;

public class p03_01Ariketa11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Zenbat izen gorde nahi ditugu
        System.out.println("Zenbat izen gorde nahi dituzu: ");
        int zenbat = sc.nextInt();

        // Sartu nahi ditugun izenak
        System.out.println("Sartu izenak:");
        String izenakArray = sc.next();

        // Izenak arrayra pasatu eta gorde izenak.
        String[] izenak = new String[zenbat];
        for (int i = 0; i < zenbat; i++) {
            System.out.print((i + 1) + ". Izena: ");
            izenak[i] = sc.next();
        }

        double[][] altuerak = new double[zenbat][3];

        // Sartu nahi ditugun altuerak izenen kopuru arabera
        for (int i = 0; i < zenbat; i++) {
            System.out.println(izenak[i] + "ren hiru altuera altuak sartzeko:");
            for (int j = 0; j < 3; j++) {
                System.out.print((j + 1) + ". Altuera: ");
                altuerak[i][j] = sc.nextDouble();
            }
        }

        // Batez besteko altuera kalkulatu eta erakutsi
        for (int i = 0; i < zenbat; i++) {
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
            for (int i = 0; i < zenbat; i++) {
                altuenBatezBestekoa += altuerak[i][j];
            }

            batezBestekoak[j] = altuenBatezBestekoa / zenbat;
        }

        // Pantailan hiru altuera altuen batez bestekoak erakutsi
        for (int j = 0; j < 3; j++) {
            System.out.println("Hiru altuera altuen batez bestekoa " + (j + 1) + ". altitudean: " + batezBestekoak[j] + " metro da.");
        }
    }
}
