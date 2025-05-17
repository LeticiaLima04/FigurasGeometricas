package br.edu.figurasgeometricasplanas;

public class Losango {
	private double diagonal_maior;
	private double diagonal_menor;
	private double area;
	
	public Losango() {
		diagonal_maior = 0;
		diagonal_menor = 0;
		area = 0;
	}
	
	public void recebe_diagonal_maior(double diagonal_maior) {
		this.diagonal_maior = diagonal_maior; 
	}
    
	public void receba_diagonal_menor(double diagonal_menor) {
		this.diagonal_menor = diagonal_menor; 
	}
	
	
	public void calcArea() {
		area = (diagonal_maior * diagonal_menor)/2;
	}
	
	public void mostrar_area() {
		 System.out.println("A area do LOSANGO é: " + area);
	}
	
	public void mostrar_forma() {
		 System.out.println("- LOSANGO -");
	 }
	 public double mostrar_area_retorno() {
		 System.out.println("A area do LOSANGOO é: " + area + " com retorno");
		 System.out.println(" ");
		 return area;
	 }


}