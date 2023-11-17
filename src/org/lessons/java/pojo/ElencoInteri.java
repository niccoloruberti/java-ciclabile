package org.lessons.java.pojo;

public class ElencoInteri {
	
	private int[] elencoInteri;
	private int indice = 0;

	//costruttore
	public ElencoInteri(int[] elencoInteri, int indice) {
		
		setElencoInteri(elencoInteri);
		setIndice(indice);
		
	}
	
	public ElencoInteri() {
		
		setElencoInteri(new int[0]);
		setIndice(0);
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
	
	public void addElemento(int elem) {
		
        
        int[] nuovoElenco = new int[getElencoInteri().length + 1 ];
        
        System.arraycopy(getElencoInteri(), 0, nuovoElenco, 0, getElencoInteri().length);
       
        nuovoElenco[getElencoInteri().length] = elem;
        
        setElencoInteri(nuovoElenco);
		
	}

}
