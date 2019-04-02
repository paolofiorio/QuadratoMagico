package it.polito.tdp.quadrato;

import java.util.ArrayList;
import java.util.List;

public class Quadrato {
	
	private int size ;
	private List<Integer> mappa ;
	
	public Quadrato(int size) {
		this.setSize(size) ;
		mappa = new ArrayList<Integer>() ;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public void add(Integer n) {
		mappa.add(n) ;
	}
	
	public void removeLast() {
		mappa.remove(mappa.size()-1) ;
	}

}
