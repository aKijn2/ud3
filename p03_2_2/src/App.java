import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> izenakList = new ArrayList<>();

        while (true) {
            System.out.println("Idatzi listan gorde nahi dituzun izenak:");
            String izenak = sc.nextLine();
            String[] izenakArray = izenak.split(" ");

            for (String izena : izenakArray) {
                if (!izenakList.contains(izena)) {
                    izenakList.add(izena);
                }
            }
            System.out.println("*****************Zerrenda*****************");
            for (String izena : izenakList) {
                System.out.println(izena);
            }
            System.out.println("******************************************");


            System.out.println("Idatzi listan gorde nahi dituzun izenak:");
            String bestea = sc.nextLine();

            if (bestea.equals("0")) {
                break;
            } else {
                if (!izenakList.contains(bestea)) {
                    izenakList.add(bestea);
                } else {
                    System.out.println("Izen hori jada existitzen da.");
                }
            }
        }
        sc.close();
    }
}