package br.edu.principal;

import br.edu.figurasgeometricasplanas.*;

public class Principal {

	public static void main(String[] args) {
		
		Triangulo tri = new Triangulo();
		tri.mostrar_forma();
		tri.recebe_altura(7); 
		tri.recebe_base(10);
		
		tri.calcArea();
		tri.mostrar_area();
		double recebe_area = tri.mostrar_area_retorno();
		
		Quadrado qua = new Quadrado();
		qua.mostrar_forma();
		qua.recebe_lado(13);
		
		qua.calcArea();
		qua.mostrar_area();
		recebe_area = qua.mostrar_area_retorno();
		
		Retangulo ret = new Retangulo();
		ret.mostrar_forma();
		ret.recebe_altura(7); 
		ret.recebe_base(10);
		
		ret.calcArea();
		ret.mostrar_area();
		recebe_area = ret.mostrar_area_retorno();
		
		Circulo cir = new Circulo();
		cir.mostrar_forma();
		cir.recebe_raio(13);
		
		cir.calcArea();
		cir.mostrar_area();
		recebe_area = cir.mostrar_area_retorno();
		
		Losango los = new Losango();
		los.mostrar_forma();
		los.recebe_diagonal_maior(7); 
		los.receba_diagonal_menor(10);
		
		los.calcArea();
		los.mostrar_area();
		recebe_area = los.mostrar_area_retorno();
		
		Trapezio tra = new Trapezio();
		tra.mostrar_forma();
		tra.receba_base_maior(7); 
		tra.receba_base_menor(10);
		tra.receba_altura(10);
		
		tra.calcArea();
		tra.mostrar_area();
		recebe_area = tra.mostrar_area_retorno();
		
		Paralelogramo par = new Paralelogramo();
		par.mostrar_forma();
		par.recebe_altura(7); 
		par.recebe_base(10);
		
		par.calcArea();
		par.mostrar_area();
		recebe_area = par.mostrar_area_retorno();
		
		Hexagono hex = new Hexagono();
		hex.mostrar_forma();
		hex.recebe_lado(13);
		
		hex.calcArea();
		hex.mostrar_area();
		recebe_area = hex.mostrar_area_retorno();
		
		Pentagono pen = new Pentagono();
		pen.mostrar_forma();
		pen.recebe_lado(13);
		
		pen.calc_apotema();
		pen.calcArea();
		pen.mostrar_area();
		recebe_area = pen.mostrar_area_retorno();
	}

}