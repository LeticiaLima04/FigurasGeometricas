package br.edu.figurasgeometricasespaciais;

public class Paralelepipedo {
    private double comprimento;
    private double largura;
    private double altura;
    private double areaBase;
    private double areaTotal;
    private double diagonal;
    private double volume;

    public Paralelepipedo() {
        comprimento = 0;
        largura = 0;
        altura = 0;
        areaBase = 0;
        areaTotal = 0;
        diagonal = 0;
        volume = 0;
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

    public double getAltura() {
        return altura;
    }

    public void calcAreaBase() {
        areaBase = comprimento * largura;
    }

    public void calcDiagonal() {
        diagonal = Math.sqrt(comprimento * comprimento + altura * altura + largura * largura);
    }

    public void calcAreaTotal() {
        areaTotal = 2 * (comprimento * largura + comprimento * altura + largura * altura);
    }

    public void calcVolume() {
        volume = comprimento * largura * altura;
    }

    public void mostrar_area_base() {
        System.out.println("Área da Base: " + areaBase);
    }

    public void mostrar_area_total() {
        System.out.println("Área Total: " + areaTotal);
    }

    public void mostrar_volume() {
        System.out.println("Volume: " + volume);
    }

    public void mostrar_diagonal() {
        System.out.println("Diagonal: " + diagonal);
    }

    public double mostrar_area_base_retorno() {
        System.out.println("Área da base com retorno: " + areaBase);
        return areaBase;
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

    public double mostrar_diagonal_retorno() {
        System.out.println("Diagonal com retorno: " + diagonal);
        return diagonal;
    }
    
    public void mostrar_forma() {
        System.out.println("- PARALELEPÍPEDO -");
    }
}
