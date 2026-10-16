package vjeezbe;

import java.util.Scanner;

public class prviZadatak {
	
	public static int brojRijeci(String recenica) {
		String rijeci [] = recenica.split(" ");
		
		return rijeci.length;
	}

	public static void main(String[] args) {
		/* Unijeti recenicu koja sadrzi vise rijeci odvojenih prazninama i odredite broj rijeci */
		
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite recenicu: ");
		
		String s = ulaz.nextLine().trim();
		
		System.out.println(brojRijeci(s));
		

	}

}
