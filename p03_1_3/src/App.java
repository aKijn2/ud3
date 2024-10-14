
public class App {

    public static void main(String[] args) throws Exception {

        /**
         * Array bat dugu izenak izenekoa bertan 4 izen ditugu gordeta. Ondoren
         * bigarren posizioko izenari aldatzen dio izena Alex bihurtzen. Azkenik
         * dugu for bat non egiten dagoena da izen kopurua txikiagoa baldin bada
         * i baino imprimitzek izenak. Handiagoa izaten baldin bada i kodigo
         * honen kaxuan ez luke imprimatuko izenak adibidez 6 bat balioa baldin
         * bazuen.
         */
        String izenak[] = {
            "Xan",
            "Maria",
            "Andoni",
            "Garaipena"
        };

        izenak[2] = "Alex";

        for (int i = 0; i < izenak.length; i++) {
            System.out.println(izenak[i]);
        }
    }
}
