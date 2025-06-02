package br.edu.figurasgeometricasespaciais;

public class Piramide {
    private double lado;
    private double ladoBase;
    private double altura;
    private double areaBase;
    private double areaLateral;
    private double areaTotal;
    private double volume;

    public Piramide() {
        lado = 0;
        ladoBase = 0;
        altura = 0;
        areaBase = 0;
        areaLateral = 0;
        areaTotal = 0;
        volume = 0;
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

    public void calcAreaBase() {
        areaBase = lado * lado;
    }

    public void calcAreaLateral() {
        areaLateral = 4 * (ladoBase * altura) / 2;
    }

    public void calcAreaTotal() {
        areaTotal = areaBase + areaLateral;
    }

    public void calcVolume() {
        volume = (1.0 / 3.0) * areaBase * altura;
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
        System.out.println("- PIRÂMIDE -");
    }
}
