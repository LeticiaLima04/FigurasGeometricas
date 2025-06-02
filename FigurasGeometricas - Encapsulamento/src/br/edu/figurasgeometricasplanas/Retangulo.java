package br.edu.figurasgeometricasplanas;

public class Retangulo {
    private double base;
    private double altura;
    private double area;

    public Retangulo() {
        base = 0;
        altura = 0;
        area = 0;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void calcArea() {
        area = base * altura;
    }

    public void mostrar_area() {
        System.out.println("A area do RETÂNGULO é: " + area);
    }

    public void mostrar_forma() {
        System.out.println("- RETÂNGULO -");
    }

    public double mostrar_area_retorno() {
        System.out.println("A area do RETÂNGULO é: " + area + " com retorno");
        System.out.println(" ");
        return area;
    }

    public double getArea() {
        return area;
    }
}
