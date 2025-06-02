package br.edu.figurasgeometricasplanas;

public class Hexagono extends FiguraPlana {
    private double lado;

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

    public void mostrar_forma() {
        System.out.println("- HEXÁGONO -");
    }
}
