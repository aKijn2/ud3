package p03_01Ariketa13;

import java.util.Scanner;

public class p03_01Ariketa13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 5 elementuko dimentsio bakarreko array-a sortu
		String[] izenak = new String[5];

		// Erabiltzaileak izenak sartzen ditu
		System.out.println("Sartu 5 izen:");
		for (int i = 0; i < izenak.length; i++) {
			izenak[i] = sc.nextLine();
		}

		// Arraya ordenatu burbuilaren metodoa erabiliz
		burbuilaOrdenazioa(izenak);

		// Arraya pantailan erakutsi
		System.out.println("Arraya ordenatuta:");
		for (String izena : izenak) {
			System.out.println(izena);
		}

		// Izenak ordenatuta daudela egiaztatu
		boolean ordenatuta = true;
		for (int i = 1; i < izenak.length; i++) {
			if (izenak[i - 1].compareTo(izenak[i]) > 0) {
				ordenatuta = false;
				break;
			}
		}

		if (ordenatuta) {
			System.out.println("Izenak ordenatuta daude.");
		} else {
			System.out.println("Izenak ordenatu gabe daude.");
		}
	}

	// Burubilaren metodoa erabiliz arraya ordenatzeko
	public static void burbuilaOrdenazioa(String[] arraya) {
		int n = arraya.length;
		boolean aldatua;
		do {
			aldatua = false;
			for (int i = 1; i < n; i++) {
				if (arraya[i - 1].compareTo(arraya[i]) > 0) {
					// Izenak aldatu
					String aux = arraya[i - 1];
					arraya[i - 1] = arraya[i];
					arraya[i] = aux;
					aldatua = true;
				}
			}
		} while (aldatua);
	}
}