package no.hvl.dat100.lab5.tabeller;

import java.util.Arrays;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for (int i = 0; i < tabell.length; i++) {

			System.out.print(tabell[i]);

		}

	}

	// b)

	public static String tilStreng(int[] tabell) {

		int tall[] = { 42, 67, 89 };

		String str = "[";

		for (int i = 0; i < tall.length; i++) {

			if (i > 0) {
				str += ",";
			}

			str += Integer.toString(tall[i]);

		}

		str += "]";

		System.out.println(str);

		return str;
	}

	// c)
	public static int summer(int[] tabell) {

		// for løkke
		int sum = 0;
		int i = 0;

		for (i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}

		System.out.println("Sum: " + sum);

		// while løkke
		while (i < tabell.length) {

			sum += tabell[i];
			i++;

		}
		System.out.println("Sum: " + sum);

		// utvidet for løkke
		int nysum = 0;

		for (int sums : tabell) {
			nysum += sums;

		}
		System.out.println("Sum: " + nysum);

		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean funnet = false;
		int pos = 0;

		while (!funnet && pos < tabell.length) {
			if (tabell[pos] == tall) {
				funnet = true;
			}
			pos++;
		}
		System.out.println(funnet);

		return funnet;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int index = -1;

		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				index = i;
				break;
			}
		}
		System.out.println(index);

		return index;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] ny = new int[tabell.length];

		for (int i = 0; i < tabell.length; i++) {
			ny[i] = tabell[tabell.length - 1 - i];
		}
		System.out.println(Arrays.toString(ny));

		return ny;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		for (int i = 0; i < tabell.length - 1; i++) {
			if (tabell[i] > tabell[i + 1]) {
				return false;
			}
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] tabell3 = new int[tabell1.length + tabell2.length];

		for (int i = 0; i < tabell1.length; ++i) {
			tabell3[i] = tabell1[i];

		}
		for (int i = 0; i < tabell2.length; ++i) {
			tabell3[tabell1.length + i] = tabell2[i];

		}
		System.out.println(Arrays.toString(tabell3));

		return tabell3;
	}
}
