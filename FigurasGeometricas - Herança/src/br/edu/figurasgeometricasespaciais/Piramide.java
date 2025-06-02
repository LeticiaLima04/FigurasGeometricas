package br.edu.figurasgeometricasespaciais;

public class Piramide extends FiguraEspacial {
    private double lado;
    private double ladoBase;

    public Piramide() {
        lado = 0;
        ladoBase = 0;
        altura = 0;
        area_base = 0;
        area_lateral = 0;
        area_total = 0;
        volume = 0;
        diagonal = 0;
    }

    public void setLado(double pLado) {
        this.lado = pLado;
    }

    public double getLado() {
        return lado;
    }

    public void setLadoBase(double pLadoBase) {
        this.ladoBase = pLadoBase;
    }

    public double getLadoBase() {
        return ladoBase;
    }

    public void setAltura(double pAltura) {
        this.altura = pAltura;
    }

    public double getAltura() {
        return altura;
    }

    public void calcAltura() {
    }

    public void calcDiagonal() {
    }

    public void calcAreaTotalBase() {
        area_total_base = lado * lado;
    }

    public void calcArea() {
        area_base = lado * lado;
    }

    public void calcAreaTotal() {
        area_total = area_base + area_lateral;
    }

    public void calcVolume() {
        volume = (1.0 / 3.0) * area_base * altura;
    }

    public void calcAreaLateral() {
        area_lateral = 2 * ladoBase * altura;
    }

    public void mostrar_forma() {
        System.out.println("- PIRÂMIDE -");
    }
}
