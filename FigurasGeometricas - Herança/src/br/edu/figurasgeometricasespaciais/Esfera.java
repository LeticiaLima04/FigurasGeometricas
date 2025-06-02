package br.edu.figurasgeometricasespaciais;

public class Esfera extends FiguraEspacial {
    private double raio;

    public Esfera() {
        raio = 0;
        area = 0;
        volume = 0;
        altura = 0;
        diagonal = 0;
        area_base = 0;
        area_total_base = 0;
        area_lateral = 0;
        area_total = 0;
    }

    public void setRaio(double pRaio) {
        this.raio = pRaio;
    }

    public double getRaio() {
        return raio;
    }

    public void calcAltura() {
        altura = 2 * raio;  
    }

    public void calcDiagonal() {
        diagonal = 2 * raio; 
    }

    public void calcAreaTotalBase() {
        area_total_base = 0; 
    }

    public void calcArea() {
        area = 4 * Math.PI * raio * raio; 
    }

    public void calcAreaTotal() {
        area_total = area; 
    }

    public void calcVolume() {
        volume = (4.0 / 3.0) * Math.PI * raio * raio * raio;
    }

    public void mostrar_forma() {
        System.out.println("- ESFERA -");
    }
}
