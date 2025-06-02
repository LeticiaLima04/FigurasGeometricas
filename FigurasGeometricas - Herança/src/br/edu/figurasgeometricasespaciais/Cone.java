package br.edu.figurasgeometricasespaciais;

public class Cone extends FiguraEspacial {
    private double raio;
    private double geratriz;

    public Cone() {
        raio = 10;
        geratriz = 10;
        altura = 10; 
        diagonal = 0;
        area = 0;
        area_base = 0;
        area_total_base = 0;
        area_lateral = 0;
        area_total = 0;
        volume = 0;
    }

    public void setRaio(double pRaio) {
        raio = pRaio;
    }

    public double getRaio() {
        return raio;
    }

    public void setGeratriz(double pGeratriz) {
        geratriz = pGeratriz;
    }

    public double getGeratriz() {
        return geratriz;
    }


    public void setAltura(double pAltura) {
        this.altura = pAltura;
    }
    
    public void calcDiagonal() {
        diagonal = Math.sqrt(raio * raio + altura * altura);
    }

    public void calcArea() {
        area_base = Math.PI * raio * raio;
    }

    public void calcAreaTotalBase() {
        area_total_base = area_base;
    }

    public void calcAreaTotal() {
        area_lateral = Math.PI * raio * geratriz;
        area_total = area_base + area_lateral;
    }

    public void calcVolume() {
        volume = (1.0 / 3.0) * area_base * altura;
    }

    public void mostrar_forma() {
        System.out.println("- CONE -");
    }
    public void calcAltura() {
    	
    }
}
