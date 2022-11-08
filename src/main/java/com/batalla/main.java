package com.batalla;

public class main {

	public static void main(String[] args) {
		Personaje goku = new Personaje("GOKÚ",5,10);
		Personaje vegeta = new Personaje("VEGETA",6,9);
		Torneo torneo = new Torneo(goku,vegeta);
		torneo.presentarContrincantes();
		torneo.pelea();
	}

}
