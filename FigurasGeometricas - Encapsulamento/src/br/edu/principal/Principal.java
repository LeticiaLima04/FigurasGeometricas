package br.edu.principal;

import br.edu.figurasgeometricasplanas.*;
import br.edu.figurasgeometricasespaciais.*;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("- Formas Geometricas Planas -");
		System.out.println(" ");
		
		Triangulo tri = new Triangulo();
		tri.mostrar_forma();
		tri.setAltura(7); 
		tri.setBase(10);
		tri.calcArea();
		tri.mostrar_area();
		double recebe_area = tri.mostrar_area_retorno();
		
		Quadrado qua = new Quadrado();
		qua.mostrar_forma();
		qua.setLado(13);
		qua.calcArea();
		qua.mostrar_area();
		recebe_area = qua.mostrar_area_retorno();
		
		Retangulo ret = new Retangulo();
		ret.mostrar_forma();
		ret.setAltura(7); 
		ret.setBase(10);
		ret.calcArea();
		ret.mostrar_area();
		recebe_area = ret.mostrar_area_retorno();
		
		Circulo cir = new Circulo();
		cir.mostrar_forma();
		cir.setRaio(13);
		cir.calcArea();
		cir.mostrar_area();
		recebe_area = cir.mostrar_area_retorno();
		
		Losango los = new Losango();
		los.mostrar_forma();
		los.setDiagonalMaior(7); 
		los.setDiagonalMenor(10);
		los.calcArea();
		los.mostrar_area();
		recebe_area = los.mostrar_area_retorno();
		
		Trapezio tra = new Trapezio();
		tra.mostrar_forma();
		tra.setBaseMaior(7); 
		tra.setBaseMenor(10);
		tra.setAltura(10);
		tra.calcArea();
		tra.mostrar_area();
		recebe_area = tra.mostrar_area_retorno();
		
		Paralelogramo par = new Paralelogramo();
		par.mostrar_forma();
		par.setAltura(7); 
		par.setBase(10);
		par.calcArea();
		par.mostrar_area();
		recebe_area = par.mostrar_area_retorno();
		
		Hexagono hex = new Hexagono();
		hex.mostrar_forma();
		hex.setLado(13);
		hex.calcArea();
		hex.mostrar_area();
		recebe_area = hex.mostrar_area_retorno();
		
		Pentagono pen = new Pentagono();
		pen.mostrar_forma();
		pen.setLado(13);
		pen.calc_apotema();
		pen.calcArea();
		pen.mostrar_area();
		recebe_area = pen.mostrar_area_retorno();

		System.out.println("- Formas Geometricas Espaciais -");
		System.out.println(" ");
		
		Esfera esf = new Esfera();
		esf.mostrar_forma();
        	esf.setRaio(7);
        	esf.calcArea();
        	esf.calcVolume();
		esf.mostrar_area();
		esf.mostrar_volume();
		esf.mostrar_area_retorno();
		esf.mostrar_volume_retorno();

		Paralelepipedo parale = new Paralelepipedo();
		parale.mostrar_forma();
        	parale.setAltura(8);
        	parale.setComprimento(10);
        	parale.setLargura(5);
       		parale.calcAreaBase();
        	parale.calcAreaTotal();
        	parale.calcDiagonal();
        	parale.calcVolume();
		parale.mostrar_area_base();
		parale.mostrar_area_total();
		parale.mostrar_volume();
		parale.mostrar_area_base_retorno();
		parale.mostrar_area_total_retorno();
		parale.mostrar_volume_retorno();

		Piramide pir = new Piramide();
		pir.mostrar_forma();
        	pir.setLado(6);
        	pir.setLadoBase(8);
        	pir.setAltura(10);
	        pir.calcAreaBase();
        	pir.calcAreaLateral();
        	pir.calcAreaTotal();
        	pir.calcVolume();
		pir.mostrar_area_base();
		pir.mostrar_area_lateral();
		pir.mostrar_area_total();
		pir.mostrar_volume();
		pir.mostrar_area_base_retorno();
		pir.mostrar_area_lateral_retorno();
		pir.mostrar_area_total_retorno();
		pir.mostrar_volume_retorno();

		Prisma pri = new Prisma();
		pri.mostrar_forma();
        	pri.setBase(12);
        	pri.setLateral(10);
        	pri.calcAreaBase();
        	pri.calcAreaLateral();
        	pri.calcAreaTotal();
        	pri.calcVolume();
		pri.mostrar_area_base();
		pri.mostrar_area_lateral();
		pri.mostrar_area_total();
		pri.mostrar_volume();
		pri.mostrar_area_base_retorno();
		pri.mostrar_area_lateral_retorno();
		pri.mostrar_area_total_retorno();
		pri.mostrar_volume_retorno();

		Tetraedro tet = new Tetraedro();
		tet.mostrar_forma();
        	tet.setAresta(6);
        	tet.calcAreaBase();
        	tet.calcAltura();
        	tet.calcVolume();
        	tet.mostrar_area_base();
        	tet.mostrar_volume();
    		tet.mostrar_area_base_retorno();
    		tet.mostrar_volume_retorno();

		Cubo cubo = new Cubo();
		cubo.mostrar_forma();
        	cubo.setAresta(10);
        	cubo.calcAreaTotal();
        	cubo.calcVolume();
		cubo.mostrar_area_total();
		cubo.mostrar_volume();
		cubo.mostrar_area_base_retorno();
		cubo.mostrar_area_lateral_retorno();
		cubo.mostrar_area_total_retorno();
		cubo.mostrar_volume_retorno();

		Cilindro cil = new Cilindro();
		cil.mostrar_forma();
	        cil.setRaio(7);
	        cil.setAltura(10);
	        cil.calcAreaBase();
	        cil.calcAreaLateral();
	        cil.calcAreaTotal();
	        cil.calcVolume();
		cil.mostrar_area_base();
		cil.mostrar_area_lateral();
		cil.mostrar_area_total();
		cil.mostrar_volume();
		cil.mostrar_area_base_retorno();
		cil.mostrar_area_lateral_retorno();
		cil.mostrar_area_total_retorno();
		cil.mostrar_volume_retorno();

		Cone cone = new Cone();
		cone.mostrar_forma();
	        cone.setRaio(5);
	        cone.setAltura(12);
	        cone.setGeratriz(5);
	        cone.calcAreaBase();
	        cone.calcAreaLateral();
	        cone.calcAreaTotal();
	        cone.calcVolume();
		cone.mostrar_area_base();
		cone.mostrar_area_lateral();
		cone.mostrar_area_total();
		cone.mostrar_volume();
		cone.mostrar_area_base_retorno();
		cone.mostrar_area_lateral_retorno();
		cone.mostrar_area_total_retorno();
		cone.mostrar_volume_retorno();
	}
}
