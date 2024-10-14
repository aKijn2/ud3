
public class App {

    public static void main(String[] args) throws Exception {
        // Arrayren deklarazioa
        int lista[];

        // Array sortzea
        lista = new int[5];

        // Datuen betelana
        for (int i = 0; i < lista.length; i++) {
            lista[i] = i + 1;
        }

        // Array datuak erakusten ditu
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }
    }
}
