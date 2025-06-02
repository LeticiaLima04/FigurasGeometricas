package br.edu.figurasgeometricasespaciais;

public class Cubo {
    private double aresta;
    private double areaBase;
    private double areaLateral;
    private double areaTotal;
    private double volume;

    public Cubo() {
        aresta = 0;
        areaBase = 0;
        areaLateral = 0;
        areaTotal = 0;
        volume = 0;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }

    public double getAresta() {
        return aresta;
    }

    public void calcAreaBase() {
        areaBase = aresta * aresta;
    }

    public void calcAreaLateral() {
        areaLateral = 4 * (aresta * aresta);
    }

    public void calcAreaTotal() {
        areaTotal = 6 * (aresta * aresta);
    }

    public void calcVolume() {
        volume = aresta * aresta * aresta;
    }

    public void mostrar_area_base() {
        System.out.println("Área da BASE do Cubo: " + areaBase);
    }

    public void mostrar_area_lateral() {
        System.out.println("Área LATERAL do Cubo: " + areaLateral);
    }

    public void mostrar_area_total() {
        System.out.println("Área TOTAL do Cubo: " + areaTotal);
    }

    public void mostrar_volume() {
        System.out.println("Volume do Cubo: " + volume);
    }

    public double mostrar_area_base_retorno() {
        System.out.println("Área da base do Cubo com retorno: " + areaBase);
        return areaBase;
    }

    public double mostrar_area_lateral_retorno() {
        System.out.println("Área lateral do Cubo com retorno: " + areaLateral);
        return areaLateral;
    }

    public double mostrar_area_total_retorno() {
        System.out.println("Área total do Cubo com retorno: " + areaTotal);
        return areaTotal;
    }

    public double mostrar_volume_retorno() {
        System.out.println("Volume do Cubo com retorno: " + volume);
        System.out.println(" ");
        return volume;
    }

    public void mostrar_forma() {
        System.out.println("- CUBO -");
    }
}
