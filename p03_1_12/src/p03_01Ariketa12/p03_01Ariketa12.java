package p03_01Ariketa12;

public class p03_01Ariketa12 {

	public static void main(String[] args) {
		// 10 elementuko array-a sortu
		int[] arraya = new int[10];

		// Array-a bete ausazko balioekin (1-100 artean)
		for (int i = 0; i < arraya.length; i++) {
			int balioa = (int) (Math.random() * 100) + 1;
			arraya[i] = balioa;
		}

		// Array-a ordenatu burbuilaren metodoa erabiliz
		burbuilaOrdenazioa(arraya);

		// Arraya bistaratu
		System.out.println("Arraya ordenatuta:");
		for (int balio : arraya) {
			System.out.print(balio + " ");
		}
	}

	// Burubilaren metodoa erabiliz arraya ordenatzeko
	public static void burbuilaOrdenazioa(int[] arraya) {
		int n = arraya.length;
		boolean aldatua;
		do {
			aldatua = false;
			for (int i = 1; i < n; i++) {
				if (arraya[i - 1] > arraya[i]) {
					// Balioak aldatu
					int aux = arraya[i - 1];
					arraya[i - 1] = arraya[i];
					arraya[i] = aux;
					aldatua = true;
				}
			}
		} while (aldatua);
	}
}