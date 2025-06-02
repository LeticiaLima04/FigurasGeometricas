package br.edu.figurasgeometricasplanas;

public class Trapezio {
    private double base_maior;
    private double base_menor;
    private double altura;
    private double area;

    public Trapezio() {
        base_maior = 0;
        base_menor = 0;
        altura = 0;
        area = 0;
    }

    public void setBaseMaior(double base_maior) {
        this.base_maior = base_maior;
    }

    public double getBaseMaior() {
        return base_maior;
    }

    public void setBaseMenor(double base_menor) {
        this.base_menor = base_menor;
    }

    public double getBaseMenor() {
        return base_menor;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void calcArea() {
        area = ((base_maior + base_menor) * altura) / 2;
    }

    public void mostrar_area() {
        System.out.println("A area do TRAPÉZIO é: " + area);
    }

    public void mostrar_forma() {
        System.out.println("- TRAPÉZIO -");
    }

    public double mostrar_area_retorno() {
        System.out.println("A area do TRAPÉZIO é: " + area + " com retorno");
        System.out.println(" ");
        return area;
    }

    public double getArea() {
        return area;
    }
}
