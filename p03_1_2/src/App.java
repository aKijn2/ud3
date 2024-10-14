
public class App {

    public static void main(String[] args) throws Exception {
        /**
         * Array bat dugu izenak izenekoa bertan 4 izen ditugu gordeta.
         * Ondoren egiten duena da 2 posizioko izena Andoni dala Alex izenera aldatzen du.
         * Eta azkenik imprimatu egiten ditu.
         */
        String izenak[] = {
            "Xan",
            "Maria",
            "Andoni",
            "Garaipena"
        };
        izenak[2] = "Alex";
        System.out.println(izenak[0]);
        System.out.println(izenak[1]);
        System.out.println(izenak[2]);
        System.out.println(izenak[3]);
    }
}
