package br.edu.figurasgeometricasplanas;

public class Hexagono {
    private double lado;
    private double area;

    public Hexagono() {
        lado = 0;
        area = 0;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void calcArea() {
        area = (3 * Math.sqrt(3) * lado * lado) / 2;
    }

    public void mostrar_area() {
        System.out.println("A area do HEXAGONO é: " + area);
    }

    public void mostrar_forma() {
        System.out.println("- HEXAGONO -");
    }

    public double mostrar_area_retorno() {
        System.out.println("A area do HEXAGONO é: " + area + " com retorno");
        System.out.println(" ");
        return area;
    }

    public double getArea() {
        return area;
    }
}
