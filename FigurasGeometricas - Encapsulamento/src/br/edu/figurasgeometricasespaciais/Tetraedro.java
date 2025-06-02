package br.edu.figurasgeometricasespaciais;

public class Tetraedro {
    private double aresta;
    private double areaBase;
    private double altura;
    private double volume;

    public Tetraedro() {
        aresta = 0;
        areaBase = 0;
        altura = 0;
        volume = 0;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }

    public double getAresta() {
        return aresta;
    }

    public void calcAreaBase() {
        areaBase = (aresta * aresta) * Math.sqrt(3) / 4;
    }

    public void calcAltura() {
        altura = (aresta * Math.sqrt(6)) / 3;
    }

    public void calcVolume() {
        volume = (aresta * aresta * aresta * Math.sqrt(2)) / 12;
    }

    public void mostrar_area_base() {
        System.out.println("Área da BASE do Tetraedro: " + areaBase);
    }

    public void mostrar_volume() {
        System.out.println("Volume do Tetraedro: " + volume);
    }

    public double mostrar_area_base_retorno() {
        System.out.println("Área da base do Tetraedro com retorno: " + areaBase);
        return areaBase;
    }

    public double mostrar_volume_retorno() {
        System.out.println("Volume do Tetraedro com retorno: " + volume);
        System.out.println(" ");
        return volume;
    }

    public double getAltura() {
        return altura;
    }

    public void mostrar_forma() {
        System.out.println("- TETRAEDRO -");
    }
}
