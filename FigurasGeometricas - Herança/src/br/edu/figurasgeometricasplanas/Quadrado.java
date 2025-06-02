package br.edu.figurasgeometricasplanas;

public class Quadrado extends FiguraPlana {
    private double lado;

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

    public void mostrar_forma() {
        System.out.println("- QUADRADO -");
    }
}
