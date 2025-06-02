package br.edu.figurasgeometricasplanas;

public class Losango extends FiguraPlana {
    private double diagonal_maior;
    private double diagonal_menor;

    public Losango() {
        diagonal_maior = 0;
        diagonal_menor = 0;
        area = 0;
    }

    public void setDiagonalMaior(double diagonal_maior) {
        this.diagonal_maior = diagonal_maior;
    }

    public double getDiagonalMaior() {
        return diagonal_maior;
    }

    public void setDiagonalMenor(double diagonal_menor) {
        this.diagonal_menor = diagonal_menor;
    }

    public double getDiagonalMenor() {
        return diagonal_menor;
    }

    public void calcArea() {
        area = (diagonal_maior * diagonal_menor) / 2;
    }

    public void mostrar_forma() {
        System.out.println("- LOSANGO -");
    }
}
