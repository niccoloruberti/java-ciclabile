package org.lessons.java.pojo;

public class ElencoInteri {
	
	private int[] elencoInteri;
	private int indice = 0;

	//costruttore
	public ElencoInteri(int[] elencoInteri, int indice) {
		
		setElencoInteri(elencoInteri);
		setIndice(indice);
		
	}
	
	//getter e setter
	public int[] getElencoInteri() {
		return elencoInteri;
	}

	public void setElencoInteri(int[] elencoInteri) {
		this.elencoInteri = elencoInteri;
	}
	
	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}
	
	//altri metodi
	public int getElementoSuccessivo() {
		
		int elem = getElencoInteri()[indice];
		indice++;
		return elem;
		
	}
	
	public boolean hasAncoraElementi() {
		
		if (getIndice() < getElencoInteri().length ) {
			return true;
		}
		
		return false;
	}

}
