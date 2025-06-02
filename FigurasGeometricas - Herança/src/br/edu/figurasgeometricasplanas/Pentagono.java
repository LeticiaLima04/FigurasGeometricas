package br.edu.figurasgeometricasplanas;

public class Pentagono extends FiguraPlana {
    private double lado;
    private double apotema;

    public Pentagono() {
        lado = 0;
        apotema = 0;
        area = 0;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void calc_apotema() {
        apotema = lado / (2 * Math.tan(Math.PI / 5));
    }

    public double getApotema() {
        return apotema;
    }

    public void calcArea() {
        area = (5 * lado * apotema) / 2;
    }

    public void mostrar_forma() {
        System.out.println("- PÊNTAGONO -");
    }
}
