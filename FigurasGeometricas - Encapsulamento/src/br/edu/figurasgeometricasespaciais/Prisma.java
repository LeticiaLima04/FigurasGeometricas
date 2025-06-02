package br.edu.figurasgeometricasespaciais;

public class Prisma {
    private double aresta;
    private double base;
    private double lateral;
    private double areaBase;
    private double areaLateral;
    private double areaTotal;
    private double volume;

    public Prisma() {
        aresta = 10;
        base = 10;
        lateral = 10;
        areaBase = 0;
        areaLateral = 0;
        areaTotal = 0;
        volume = 0;
    }

    public void setAresta(double pAresta) {
        this.aresta = pAresta;
    }

    public double getAresta() {
        return aresta;
    }

    public void setLateral(double pLateral) {
        this.lateral = pLateral;
    }

    public double getLateral() {
        return lateral;
    }

    public void setBase(double pBase) {
        this.base = pBase;
    }

    public double getBase() {
        return base;
    }

    public void calcAreaBase() {
        areaBase = aresta * aresta;
    }

    public void calcAreaLateral() {
        areaLateral = 4 * aresta * base;
    }

    public void calcAreaTotal() {
        areaTotal = 2 * areaBase + areaLateral;
    }

    public void calcVolume() {
        volume = areaBase * base;
    }

    public void mostrar_area_base() {
        System.out.println("Área da Base: " + areaBase);
    }

    public void mostrar_area_lateral() {
        System.out.println("Área Lateral: " + areaLateral);
    }

    public void mostrar_area_total() {
        System.out.println("Área Total: " + areaTotal);
    }

    public void mostrar_volume() {
        System.out.println("Volume: " + volume);
    }

    public double mostrar_area_base_retorno() {
        System.out.println("Área da base com retorno: " + areaBase);
        return areaBase;
    }

    public double mostrar_area_lateral_retorno() {
        System.out.println("Área Lateral com retorno: " + areaLateral);
        return areaLateral;
    }

    public double mostrar_area_total_retorno() {
        System.out.println("Área Total com retorno: " + areaTotal);
        return areaTotal;
    }

    public double mostrar_volume_retorno() {
        System.out.println("Volume com retorno: " + volume);
        System.out.println(" ");
        return volume;
    }

    public void mostrar_forma() {
        System.out.println("- PRISMA -");
    }
}
