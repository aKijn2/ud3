import  java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        do {
        System.out.print("Sartu zenbat elementu izango dituen: ");
        int tamaina = sc.nextInt();

        // Array-a sortu
        int[] arr = new int[tamaina];

        // Array-a bete
        for (int i = 0; i < tamaina; i++) {
            System.out.print("Sartu " + i + " elementua: ");
            arr[i] = sc.nextInt();
        }

        // Array-a pantailaratu
        System.out.print("Gordetako elementuak: ");
        for (int i = 0; i < tamaina; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Amaitzeko idatzi 'amaitu' edo 'beste' beste elementuak sartzeko");
        String aukera = sc.next();

        // amaitu idazten baldin badugu programa amaitu egingo da.
        if (aukera.equals("amaitu")) {
            break;
        }
        } while (true);
    }
}