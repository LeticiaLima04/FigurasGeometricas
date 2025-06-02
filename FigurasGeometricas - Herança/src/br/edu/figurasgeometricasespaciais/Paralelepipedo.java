package br.edu.figurasgeometricasespaciais;

public class Paralelepipedo extends FiguraEspacial {
    private double comprimento;
    private double largura;

    public Paralelepipedo() {
        comprimento = 0;
        largura = 0;
        altura = 0; 
    }

    public void setComprimento(double pComprimento) {
        this.comprimento = pComprimento;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setLargura(double pLargura) {
        this.largura = pLargura;
    }

    public double getLargura() {
        return largura;
    }

    public void setAltura(double pAltura) {
        this.altura = pAltura;
    }
    
    public void calcAltura() {
        
    }

    public void calcDiagonal() {
        diagonal = Math.sqrt(comprimento * comprimento + largura * largura + altura * altura);
    }

    public void calcAreaTotalBase() {
        area_total_base = 2 * (comprimento * largura);
    }

    public void calcArea() {
        area_base = comprimento * largura;
    }

    public void calcAreaTotal() {
        area_total = 2 * (comprimento * largura + comprimento * altura + largura * altura);
    }

    public void calcVolume() {
        volume = comprimento * largura * altura;
    }

    public void mostrar_forma() {
        System.out.println("- PARALELEPÍPEDO -");
    }
}
