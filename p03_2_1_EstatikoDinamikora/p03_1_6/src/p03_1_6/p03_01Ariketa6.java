package p03_1_6;

import java.util.Scanner;

public class p03_01Ariketa6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String erantzuna;
        do {

            System.out.println("Zenbateko almazenamendu nahi duzu: ");
            int almazena = sc.nextInt();

            // Izenak gordetzeko array 
            String[] izenak = new String[almazena];

            // Izenak sartu
            for (int i = 0; i < almazena; i++) {
                System.out.println("Sartu zure izena: ");
                izenak[i] = sc.next();
            }

            // Izenak pantailaratuko ditu
            System.out.println("Emaitza: ");
            for (int i = 0; i < almazena; i++) {
                System.out.println(izenak[i]);
            }

            System.out.println("Idatzi izen bat: ");
            String izenak1 = sc.next();

            int aurkituPosizioa = -1;

            /**
             * Bulean izenak1 izena aurkitu arte jarraituko du. Aurkitzen
             * duenean posizioa gordeko du aurkituPosizioa aldagaian.
             */
            for (int i = 0; i < almazena; i++) {
                if (izenak[i].equals(izenak1)) {
                    aurkituPosizioa = i;
                    break;
                }
            }
            if (aurkituPosizioa != -1) {
                System.out.println(izenak1 + " listan dago eta bere posizioa: " + aurkituPosizioa + " da.");
            } else {
                System.out.println(izenak1 + " listan ez dago.");
            }
            // Erantzuna idatziko dugu
            System.out.println("Jarraitu nahi duzu? bai/ez");
            erantzuna = sc.next();

            // Kodigoa buclean seguituko du bai baldin bada, ez baldin bada bukatu egingo da buclea.
        } while (erantzuna.equals("bai") || erantzuna.equals("Bai"));

    }
}
