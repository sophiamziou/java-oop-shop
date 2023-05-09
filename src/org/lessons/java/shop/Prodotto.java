package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

	private int codice;
	private String descrizione;
	private String nome;
	private double prezzo;
	private double iva;
	
	 public Prodotto(String nome, String descrizione, double prezzo, double iva) {
	        this.codice = new Random().nextInt(1000000);
			setNome(nome);
			setDescrizione(descrizione);
			setPrezzo(prezzo);
			setIva(iva);
	    }
	    public int getCodice() {
	        return codice;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getDescrizione() {
	        return descrizione;
	    }

	    public void setDescrizione(String descrizione) {
	        this.descrizione = descrizione;
	    }

	    public double getPrezzo() {
	        return prezzo;
	    }

	    public void setPrezzo(double prezzo) {
	        this.prezzo = prezzo;
	    }

	    public double getIva() {
	        return iva;
	    }

	    public void setIva(double iva) {
	        this.iva = iva;
	    }

	    public double getPrezzoIva() {
	        return getPrezzo() * (1 + getIva() / 100);
	    }

	    public String getNomeEsteso() {
	        return getCodice() + "-" + getNome();
	    }
	    
	    public String getCodiceFormat() {
	        return String.format("%08d", codice);
	    }
	    
	    @Override
	    public String toString() {
	        return
	        		"\n codice= " +  getCodice() + "/" + getCodiceFormat() + 
	                "\n nome= '" + getNome() + '\'' + 
	                "\n descrizione= '" + getDescrizione()  + '\'' + 
	                "\n prezzo= " + getPrezzo() + "€ (" + getIva() + "%)" +
	                "\n iva= " + getPrezzoIva() +
	                "\n}";
	    }
}
