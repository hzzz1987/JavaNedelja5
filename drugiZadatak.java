package vjeezbe;

import java.util.Scanner;

public class drugiZadatak {
	public static boolean jePalindrom(String s) {
		
		s = s.replace(" ", "");
		s = s.toLowerCase();
		
		String original = s;
		boolean jePalindrom = false;
		String obrnuti = new StringBuilder(s).reverse().toString();
		
		if(obrnuti.equals(original)) {
			return true;
		}else {
			return false;
		}
	}
	

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite recenicu: ");
		
		String s = ulaz.nextLine();
		
		System.out.println("Rcenica je: " + jePalindrom (s));

	}

}
