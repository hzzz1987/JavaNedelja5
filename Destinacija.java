package vjeezbe;

import java.util.ArrayList;

public class Destinacija {
	
	private String naziv, drzava;
	private int ocjena, udaljenostKm, brojPosjeta;
	
	

	public Destinacija(String naziv, String drzava, int ocjena, int udaljenostKm, int brojPosjeta) {
		this.naziv = naziv;
		this.drzava = drzava;
		this.ocjena = ocjena;
		this.udaljenostKm = udaljenostKm;
		this.brojPosjeta = brojPosjeta;
	}
	public Destinacija() {
		this.naziv = "default";
		this.drzava = "default";
		this.ocjena = 5;
		this.udaljenostKm = 1000;
		this.brojPosjeta = 2000000000;
		
	}
	



	public String getNaziv() {
		return naziv;
	}




	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}




	public String getDrzava() {
		return drzava;
	}




	public void setDrzava(String drzava) {
		this.drzava = drzava;
	}




	public int getOcjena() {
		return ocjena;
	}




	public void setOcjena(int ocjena) {
		this.ocjena = ocjena;
	}




	public int getUdaljenostKm() {
		return udaljenostKm;
	}




	public void setUdaljenostKm(int udaljenostKm) {
		this.udaljenostKm = udaljenostKm;
	}




	public int getBrojPosjeta() {
		return brojPosjeta;
	}




	public void setBrojPosjeta(int brojPosjeta) {
		this.brojPosjeta = brojPosjeta;
	}
	




	public static void main(String[] args) {
		
		ArrayList<Destinacija> destinacije = new ArrayList <Destinacija>();
		
		Destinacija d1 = new Destinacija("Barcelona", "Spanija", 10, 2500, 20000000);
		Destinacija d2 = new Destinacija("Pariz", "Francuska", 9, 1800, 200001000);
		Destinacija d3 = new Destinacija();
		d3.setBrojPosjeta(1000);
		

	}

}


