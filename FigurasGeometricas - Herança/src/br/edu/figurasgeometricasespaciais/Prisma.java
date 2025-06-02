package br.edu.figurasgeometricasespaciais;

public class Prisma extends FiguraEspacial {
    private double aresta;
    private double base;
    private double lateral;

    public Prisma() {
        aresta = 10;
        base = 10;
        area_base = 0;
        area_lateral = 0;
        area_total = 0;
        volume = 0;
    }

    public void setAresta(double pAresta) {
        this.aresta = pAresta;
    }

    public double getAresta() {
        return aresta;
    }

    public void setBase(double pBase) {
        this.base = pBase;
    }

    public double getBase() {
        return base;
    }
    
    public void setLateral(double pLateral) {
        this.lateral = pLateral;
    }

    public double getLateral() {
        return lateral;
    }

    public void calcAltura() {
        
    }

    public void calcDiagonal() {
        
    }

    public void calcAreaTotalBase() {
        area_total_base = 2 * aresta * base;
    }

    public void calcArea() {
        area_base = aresta * aresta;
    }

    public void calcAreaLateral() {
        area_lateral = 4 * aresta * base;
    }

    public void calcAreaTotal() {
        area_total = 2 * area_base + area_lateral;
    }

    public void calcVolume() {
        volume = area_base * base;
    }

    public void mostrar_forma() {
        System.out.println("- PRISMA -");
    }
}
