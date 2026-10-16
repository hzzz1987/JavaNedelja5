package vjeezbe;

import java.util.Scanner;

public class treciZadatak {
		
	public static int BrojTransakcije(String ulaz) {
		String [] rijeci = ulaz.split(" ");
		int suma = 0;
		for(int i = 0; i < rijeci.length; i++) {
			String vrijednost = rijeci[i].substring(1);
			if(rijeci[i].charAt(0) == 'S') {
				
				suma += Integer.parseInt(vrijednost);
			}else {
					
					suma -= Integer.parseInt(vrijednost);
				
			}
		}
		return suma;
	} 
	
	public static void main(String[] args) {
		/* napisati program koji za unijeti string provjerava da li je broker u plusu ili minusu nakon trgovine akcijama. Prefiks stringa
		 * sadrzi S kad je odradjena prodaja, a B kad je odradjena kupovina akcije.
		 * ulaz: a = "S50 S40 B50 B100 */
		
		Scanner ulaz = new Scanner (System.in);
		System.out.println("Unesite recenicu: ");
		String s = ulaz.nextLine();
		
		
		System.out.println(BrojTransakcije(s));
		}

	}


