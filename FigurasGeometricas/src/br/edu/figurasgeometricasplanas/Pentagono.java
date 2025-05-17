package br.edu.figurasgeometricasplanas;

public class Pentagono {
	private double lado;
	private double apotema;
	private double area;
	
	public Pentagono() {
		lado = 0;
		area = 0;
	}
		

	public void recebe_lado(double lado) {
			this.lado = lado; 
	}
	
	public void calc_apotema() {
		apotema = lado / (2 * Math.tan(Math.PI / 5));
	}
	
	public void calcArea() {
		area = (5 * lado * apotema) / 2;
	}
	
	public void mostrar_area() {
		 System.out.println("A area do PÊNTAGONO é: " + area);
	}
	
	public void mostrar_forma() {
		 System.out.println("- PÊNTAGONO -");
	 }
	 public double mostrar_area_retorno() {
		 System.out.println("A area do PÊNTAGONO é: " + area + " com retorno");
		 System.out.println(" ");
		 return area;
	 }
}
