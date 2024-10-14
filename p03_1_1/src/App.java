
public class App {

    public static void main(String[] args) throws Exception {

        // array bat 10 baliorekin
        int[] zenbakiak = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // imprimatu arraya
        System.out.println("Gordeta ditugun balio guztiak:");
        for (int i = 0; i < zenbakiak.length; i++) {
            System.out.println(zenbakiak[i]);
        }
        // elementu guztien batuketa
        int batuketa = 0;
        for (int i = 0; i < zenbakiak.length; i++) {
            batuketa = batuketa + zenbakiak[i];
        }
        System.out.println("Elementu guztien batuketa: " + batuketa);

        // elementu guztie balio handiena
        int balioHandiena = zenbakiak[0];
        for (int i = 1; i < zenbakiak.length; i++) {
            if (zenbakiak[i] > balioHandiena) {
                balioHandiena = zenbakiak[i];
            }
        }
        System.out.println("Balio handiena: " + balioHandiena);

        // arrayeko elementuen batazbestekoa
        double batazbestekoa = (double) batuketa / zenbakiak.length;
        System.out.println("Elementuen batazbestekoa: " + batazbestekoa);
    }
}
