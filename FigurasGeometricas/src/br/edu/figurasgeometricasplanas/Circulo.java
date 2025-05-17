package br.edu.figurasgeometricasplanas;

public class Circulo {
	private double raio;
	private double area;
	
	
	public Circulo() {
		raio = 0;
		area = 0;
	}
	public void recebe_raio(double raio) {
		this.raio = raio;
	}

	public void calcArea() {
		area = raio * raio * Math.PI;
	}
	
	public void mostrar_area() {
		 System.out.println("A area do CIRCULO é: " + area);
	 }
	
	 public void mostrar_forma() {
		 System.out.println("- CIRCULO -");
	 }
	 public double mostrar_area_retorno() {
		 System.out.println("A area do CIRCULO é: " + area + " com retorno");
		 System.out.println(" ");
		 return area;
	 }
}