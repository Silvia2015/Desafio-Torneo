package com.batalla;

import org.apache.commons.math3.util.CombinatoricsUtils;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Personaje implements IActividades, IMovimientos {
	
	private String nombre;
	private double poder;
	private double energia;
	
	public Personaje() {
		
	}
	public Personaje(String nombre, int poder, int energia) {
		this.nombre = nombre;
		this.poder = CombinatoricsUtils.factorial(poder);
		this.energia = CombinatoricsUtils.factorial(energia);
	}
	
	
	public void ataqueBasico() {
		System.out.println(this.nombre+", ha lanzado una onda de Ki.");
	}
	
	public void ataqueAvanzado() {
		System.out.println(this.nombre+", ha lanzado una Onda Vita Kaio-ken Dios x10.");
	}
	
	public void defenderAtaque() {
		System.out.println(this.nombre+", ha defendido con un Escudo de Energ�a.");
	}
	
	public void esquivarAtaque() {
		System.out.println(this.nombre+" ha esquivado con una Ilusi�n de Imagen");
	}
	
	public void avanzar() {
		System.out.println(this.nombre+", avanz� hacia adelante.");
	}
	
	public void derecha() {
		System.out.println(this.nombre+", gir� a la derecha");
	}
	
	public void izquierda() {
		System.out.println(this.nombre+", gir� a la izquierda");
	}
	
	public void retroceder() {
		System.out.println(this.nombre+", retrocedi�.");
	}
	
	public String toString() {
		return "Hola, soy "+this.nombre+", mi poder alcanza "+this.poder+" y mi energ�a no supera los "+this.energia +".";
	}
	

}
