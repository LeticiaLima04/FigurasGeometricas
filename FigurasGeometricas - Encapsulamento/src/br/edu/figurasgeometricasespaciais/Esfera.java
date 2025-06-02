package br.edu.figurasgeometricasespaciais;

public class Esfera {
    private double raio;
    private double area;
    private double volume;

    public Esfera() {
        raio = 0;
        area = 0;
        volume = 0;
    }

    public void setRaio(double pRaio) {
        this.raio = pRaio;
    }

    public double getRaio() {
        return raio;
    }

    public void calcArea() {
        area = 4 * Math.PI * (raio * raio);
    }

    public void calcVolume() {
        volume = (4.0 / 3.0) * Math.PI * (raio * raio * raio);
    }

    public void mostrar_area() {
        System.out.println("Área da Esfera: " + area);
    }

    public void mostrar_volume() {
        System.out.println("Volume da Esfera: " + volume);
    }

    public double mostrar_area_retorno() {
        System.out.println("Área da Esfera com retorno: " + area);
        return area;
    }

    public double mostrar_volume_retorno() {
        System.out.println("Volume da Esfera com retorno: " + volume);
        System.out.println(" ");
        return volume;
    }
    
    public void mostrar_forma() {
        System.out.println("- ESFERA -");
    }
}
