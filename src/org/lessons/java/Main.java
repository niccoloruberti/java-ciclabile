package org.lessons.java;

import org.lessons.java.pojo.ElencoInteri;

public class Main {

	public static void main(String[] args) {
		
		int[] numeriInteri = {1, 9, 6, 8, 5};
		
		ElencoInteri elenco = new ElencoInteri(numeriInteri, 0);
		
		while (elenco.hasAncoraElementi()) {
			
			System.out.println(elenco.getElementoSuccessivo());
		}

	}

}
