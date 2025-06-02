package br.edu.figurasgeometricasplanas;

public class Triangulo extends FiguraPlana {
    private double base;
    private double altura;

    public Triangulo() {
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
        area = (base * altura) / 2;
    }

    public void mostrar_forma() {
        System.out.println("- TRIÂNGULO -");
    }
}
