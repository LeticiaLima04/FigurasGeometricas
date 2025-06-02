package br.edu.figurasgeometricasplanas;

public class Circulo extends FiguraPlana {
    private double raio;

    public Circulo() {
        raio = 0;
        area = 0;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void calcArea() {
        area = raio * raio * Math.PI;
    }

    public void mostrar_forma() {
        System.out.println("- CIRCULO -");
    }
}
