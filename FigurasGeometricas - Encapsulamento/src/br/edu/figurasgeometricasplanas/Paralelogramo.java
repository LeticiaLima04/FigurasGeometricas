package br.edu.figurasgeometricasplanas;

public class Paralelogramo {
    private double base;
    private double altura;
    private double area;

    public Paralelogramo() {
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
        System.out.println("A area do PARALELOGRAMO é: " + area);
    }

    public void mostrar_forma() {
        System.out.println("- PARALELOGRAMO -");
    }

    public double mostrar_area_retorno() {
        System.out.println("A area do PARALELOGRAMO é: " + area + " com retorno");
        System.out.println(" ");
        return area;
    }

    public double getArea() {
        return area;
    }
}
