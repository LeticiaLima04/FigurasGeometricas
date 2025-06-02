package br.edu.figurasgeometricasespaciais;

public class Cilindro extends FiguraEspacial {
    private double raio;

    public Cilindro() {
        raio = 10;
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

    public void calcDiagonal() {
        diagonal = Math.sqrt(4 * raio * raio + altura * altura);
    }


    public void setAltura(double pAltura) {
        this.altura = pAltura;
    }
    
    public void calcArea() {
        area_base = Math.PI * raio * raio;
    }

    public void calcAreaTotalBase() {
        area_total_base = 2 * area_base;
    }

    public void calcAreaTotal() {
        area_lateral = 2 * Math.PI * raio * altura;
        area_total = area_total_base + area_lateral;
    }

    public void calcVolume() {
        volume = area_base * altura;
    }

    public void mostrar_forma() {
        System.out.println("- CILINDRO -");
    }
    public void calcAltura() {
    	
    }
}


