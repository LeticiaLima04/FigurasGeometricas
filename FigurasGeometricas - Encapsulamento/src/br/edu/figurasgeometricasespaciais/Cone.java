package br.edu.figurasgeometricasespaciais;

public class Cone {
    private double raio;
    private double geratriz;
    private double altura;
    private double areaBase;
    private double areaLateral;
    private double areaTotal;
    private double volume;

    public Cone() {
        raio = 0;
        geratriz = 0;
        altura = 0;
        areaBase = 0;
        areaLateral = 0;
        areaTotal = 0;
        volume = 0;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public void setGeratriz(double geratriz) {
        this.geratriz = geratriz;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void calcAreaBase() {
        areaBase = Math.PI * raio * raio;
    }

    public void calcAreaLateral() {
        areaLateral = Math.PI * raio * geratriz;
    }

    public void calcAreaTotal() {
        areaTotal = areaBase + areaLateral;
    }

    public void calcVolume() {
        volume = (1.0 / 3.0) * areaBase * altura;
    }

    public void mostrar_area_base() {
        System.out.println("Área da BASE do Cone: " + areaBase);
    }

    public void mostrar_area_lateral() {
        System.out.println("Área LATERAL do Cone: " + areaLateral);
    }

    public void mostrar_area_total() {
        System.out.println("Área TOTAL do Cone: " + areaTotal);
    }

    public void mostrar_volume() {
        System.out.println("Volume do Cone: " + volume);
    }

    public double mostrar_area_base_retorno() {
        System.out.println("Área da base do Cone com retorno: " + areaBase);
        return areaBase;
    }

    public double mostrar_area_lateral_retorno() {
        System.out.println("Área lateral do Cone com retorno: " + areaLateral);
        return areaLateral;
    }

    public double mostrar_area_total_retorno() {
        System.out.println("Área total do Cone com retorno: " + areaTotal);
        return areaTotal;
    }

    public double mostrar_volume_retorno() {
        System.out.println("Volume do Cone com retorno: " + volume);
        return volume;
    }

    public void mostrar_forma() {
        System.out.println("- CONE -");
    }
}
