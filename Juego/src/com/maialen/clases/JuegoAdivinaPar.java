package com.maialen.clases;

public class JuegoAdivinaPar extends JuegoAdivinaNumero{

	public JuegoAdivinaPar(int numVidas, int valor) {
		super(numVidas, valor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean validaNumero(int num) {
		return num%2==0;
	}
	
}
