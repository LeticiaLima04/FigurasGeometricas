package br.edu.figurasgeometricasplanas;

public class Quadrado {

    private double lado;
    private double area;

    public Quadrado() {
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
        area = lado * lado;
    }

    public void mostrar_area() {
        System.out.println("A area do QUADRADO é: " + area);
    }

    public void mostrar_forma() {
        System.out.println("- QUADRADO -");
    }

    public double mostrar_area_retorno() {
        System.out.println("A area do QUADRADO é: " + area + " com retorno");
        System.out.println(" ");
        return area;
    }

    public double getArea() {
        return area;
    }
}
