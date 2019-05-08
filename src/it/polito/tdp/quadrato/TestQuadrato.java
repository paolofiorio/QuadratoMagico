package it.polito.tdp.quadrato;

public class TestQuadrato {

	public static void main(String[] args) {
		
		CercaQuadrato cq = new CercaQuadrato() ;
		long start=System.nanoTime();
		cq.genera(3) ;
		long stop=System.nanoTime();
		System.out.println("Running time:" +(stop-start)+" ns");
	}

}
