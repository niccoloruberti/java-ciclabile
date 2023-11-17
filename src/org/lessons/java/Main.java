package org.lessons.java;

import org.lessons.java.pojo.ElencoInteri;

public class Main {

	public static void main(String[] args) {
		
		int[] numeriInteri = {1, 9, 6, 8, 5};
		
		ElencoInteri elenco = new ElencoInteri(numeriInteri, 0);
		
		//stampo il primo elenco
		
		while (elenco.hasAncoraElementi()) {
			
			System.out.println(elenco.getElementoSuccessivo());
		}
		
		System.out.println("----------");
		
		ElencoInteri elenco2 = new ElencoInteri();
		
		elenco2.addElemento(2);
		
		elenco2.addElemento(5);
		
		elenco2.addElemento(7);
		
		//stampo il secondo elenco
		
		while (elenco2.hasAncoraElementi()) {
			
			System.out.println(elenco2.getElementoSuccessivo());
		}

	}

}
