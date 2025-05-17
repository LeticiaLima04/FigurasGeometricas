package br.edu.figurasgeometricasplanas;

public class Triangulo {
	private double base;
	private double altura;
	private double area;
	
	public Triangulo() {
		base = 0;
		altura = 0;
		area = 0;
	}
	public void recebe_altura(double altura) {
		this.altura = altura;
	}
	
	public void recebe_base(double p_base) {
		base = p_base;
	}
	public void calcArea() {
		area = (base * altura)/2;
	}
	 public void mostrar_area() {
		 System.out.println("A area do TRIANGULO é: " + area);
	 }
	 
	 public void mostrar_forma() {
		 System.out.println("- TRIANGULO -");
	 }
	 
	 public double mostrar_area_retorno() {
		 System.out.println("A area do TRIANGULO é: " + area + " com retorno");
		 System.out.println(" ");
		 return area;
	 }

}