package br.edu.figurasgeometricasespaciais;

public class Cilindro {
    private double raio;
    private double altura;
    private double areaBase;
    private double areaLateral;
    private double areaTotal;
    private double volume;

    public Cilindro() {
        raio = 0;
        altura = 0;
        areaBase = 0;
        areaLateral = 0;
        areaTotal = 0;
        volume = 0;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void calcAreaBase() {
        areaBase = Math.PI * raio * raio;
    }

    public void calcAreaLateral() {
        areaLateral = 2 * Math.PI * raio * altura;
    }

    public void calcAreaTotal() {
        areaTotal = 2 * areaBase + areaLateral;
    }

    public void calcVolume() {
        volume = areaBase * altura;
    }

    public void mostrar_area_base() {
        System.out.println("Área da BASE do Cilindro: " + areaBase);
    }

    public void mostrar_area_lateral() {
        System.out.println("Área LATERAL do Cilindro: " + areaLateral);
    }

    public void mostrar_area_total() {
        System.out.println("Área TOTAL do Cilindro: " + areaTotal);
    }

    public void mostrar_volume() {
        System.out.println("Volume do Cilindro: " + volume);
    }

    public double mostrar_area_base_retorno() {
        System.out.println("Área da base do Cilindro com retorno: " + areaBase);
        return areaBase;
    }

    public double mostrar_area_lateral_retorno() {
        System.out.println("Área lateral do Cilindro com retorno: " + areaLateral);
        return areaLateral;
    }

    public double mostrar_area_total_retorno() {
        System.out.println("Área total do Cilindro com retorno: " + areaTotal);
        return areaTotal;
    }

    public double mostrar_volume_retorno() {
        System.out.println("Volume do Cilindro com retorno: " + volume);
        System.out.println(" ");
        return volume;
    }

    public void mostrar_forma() {
        System.out.println("- CILINDRO -");
    }
}
