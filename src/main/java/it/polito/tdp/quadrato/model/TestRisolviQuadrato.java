package it.polito.tdp.quadrato.model;

import java.util.List;

public class TestRisolviQuadrato {

	public static void main(String args[]) {
		RisolviQuadrato r = new RisolviQuadrato(4) ;
		/*List<List<Integer>> soluzioni = r.risolvi() ;
		for(List<Integer> sol: soluzioni)
			System.out.println(sol) ;*/
		//r.quadrati();
		
		List<List<Integer>>soluzioni=r.quadrati();
		
		for(List<Integer>sol : soluzioni) {
			System.out.println(sol);
		}
	}
	
}
