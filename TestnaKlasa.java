package vjeezbe;

import java.util.ArrayList;

public class TestnaKlasa {
	
	public static ArrayList<Destinacija> filtriraj(ArrayList<Destinacija> destinacije){
		
		ArrayList <Destinacija> rezultat = new ArrayList<Destinacija>();
		// Destinacija a: destinacije
		
		for(int i = 0; i < destinacije.size(); i++) {
			if(destinacije.get(i).getOcjena() >= 8 && destinacije.get(i).getUdaljenostKm() <= 1000) {
				rezultat.add(destinacije.get(i));
			}
		}
		
		return rezultat;
	}
	
	public static Destinacija najvisePosjeta(ArrayList<Destinacija> destinacije) {
		Destinacija max = destinacije.get(0);
		for(int i = 1; i < destinacije.size(); i++) {
			if(destinacije.get(i).getBrojPosjeta() > max.getBrojPosjeta()) {
				max = destinacije.get(i);
			}
		}
		return max;
	}
	
	public static ArrayList<Destinacija> sortiranje(ArrayList<Destinacija> destinacije){
		destinacije.sort((d1,d2) -> Integer.compare(d2.getOcjena(), d1.getOcjena()));
		return destinacije;
	}
	
	
	public static void main(String[] args) {
		
	ArrayList<Destinacija> destinacije = new ArrayList <Destinacija>();
		
		Destinacija d1 = new Destinacija("Barcelona", "Spanija", 10, 2500, 20000000);
		Destinacija d2 = new Destinacija("Pariz", "Francuska", 9, 1800, 200001000);
		Destinacija d3 = new Destinacija();
		destinacije.add(d1);
		destinacije.add(d2);
		destinacije.add(d3);
		d3.setOcjena(8);
		d3.setUdaljenostKm(500);
		d3.setBrojPosjeta(1000);
		d3.setNaziv("Budimpesta");
		
		ArrayList<Destinacija> rez = new ArrayList<Destinacija>();
		
		rez =filtriraj(destinacije);
		
		for(Destinacija a: rez) {
			System.out.println(a.getNaziv());
		}
		ArrayList<Destinacija> novirez = new ArrayList<Destinacija>();
		
		System.out.println(najvisePosjeta(destinacije).getNaziv());
		
		
		
		
		
	}

}
