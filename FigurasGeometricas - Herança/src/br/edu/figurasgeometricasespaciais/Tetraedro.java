package br.edu.figurasgeometricasespaciais;

public class Tetraedro extends FiguraEspacial {
    private double aresta;

    public Tetraedro() {
        aresta = 0;
        altura = 0;
        area_base = 0;
        volume = 0;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }

    public double getAresta() {
        return aresta;
    }

    public void calcAreaBase() {
        area_base = (aresta * aresta) * Math.sqrt(3) / 4;
    }

    public void calcAltura() {
        altura = (aresta * Math.sqrt(6)) / 3;
    }

    public void calcDiagonal() {
    	diagonal = aresta;
    }

    public void calcAreaTotalBase() {
    	area_total_base = 4 * area_base;
    }

    public void calcArea() {
        area = area_base;
    }

    public void calcAreaTotal() {
        area_total = area_total_base;
    }

    public void calcVolume() {
        volume = (aresta * aresta * aresta * Math.sqrt(2)) / 12;
    }

    public void mostrar_forma() {
        System.out.println("- TETRAEDRO -");
    }
}
