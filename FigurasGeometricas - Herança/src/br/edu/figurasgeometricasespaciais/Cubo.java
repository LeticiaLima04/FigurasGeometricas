package br.edu.figurasgeometricasespaciais;

public class Cubo extends FiguraEspacial {
    private double aresta;

    public Cubo() {
        aresta = 0;
        altura = 0;
        diagonal = 0;
        area = 0;
        area_base = 0;
        area_total_base = 0;
        area_lateral = 0;
        area_total = 0;
        volume = 0;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }

    public double getAresta() {
        return aresta;
    }

    public void calcAltura() {
        altura = aresta;
    }

    public void calcDiagonal() {
        diagonal = Math.sqrt(3) * aresta;
    }

    public void calcAreaTotalBase() {
        area_total_base = area_base;
    }

    public void calcArea() {
        area_base = aresta * aresta;
    }

    public void calcAreaTotal() {
        area_total = 6 * (aresta * aresta);
        area_lateral = 4 * (aresta * aresta);
    }

    public void calcVolume() {
        volume = aresta * aresta * aresta;
    }

    public void mostrar_forma() {
        System.out.println("- CUBO -");
    }
}
