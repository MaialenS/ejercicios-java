package com.maialen.clases;

import java.util.ArrayList;
import java.util.Scanner;

import com.maialen.factoria.Factoria;
import com.maialen.interfaces.IJugable;
import com.maialen.interfaces.IJuego;




public class Aplicacion {

	private static ArrayList<IJugable> juegos=new ArrayList<IJugable>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		addJuego(Factoria.getJuegoAN());
		addJuego(Factoria.getJuegoImpar());
		addJuego(Factoria.getJuegoPar());
		
		IJugable juego= eligeJuego();
		while(juego!=null){
			//para poder llamar a la clase hacer cast
			((Juego) juego).reiniciarPartida();
			juego.juega();
			juego=eligeJuego();
		}
		
		
	}
	
	public static IJugable eligeJuego(){
		System.out.println("Intoduce el numero de la opcion deseada");
		int i=1;
		for(IJugable j: juegos){
			System.out.println("Opcion "+i+"  ******************");
			j.muestraNombre();
			j.muestraInfo();
			i++;
		}
		System.out.println("Opcion "+i+" para terminar");
		//pedir un numero y leerlo del teclado
		System.out.println("Introduce un numero:");
		Scanner entrada = new Scanner(System.in);
		int num = entrada.nextInt();
		
		if (num>juegos.size()){
			return null;
		}else{
			return juegos.get(num-1);
		}
		
		
	}
	
	

	/**
	 * Add a new validator
	 */
	public static void addJuego(IJugable j) {
		if(!juegos.contains(j)) {
			juegos.add(j);
		}
	}
	
}