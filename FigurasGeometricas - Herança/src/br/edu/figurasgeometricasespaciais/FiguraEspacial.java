package br.edu.figurasgeometricasespaciais;

public abstract class FiguraEspacial {
    protected double altura;
    protected double diagonal;
    protected double area;
    protected double area_base;
    protected double area_total_base;
    protected double area_lateral;
    protected double area_total;
    protected double volume;

    public void mostrar_area() {
        System.out.println("Área: " + area);
    }

    public void mostrar_area_base() {
        System.out.println("Área da Base: " + area_base);
    }

    public void mostrar_area_total_base() {
        System.out.println("Área Total da Base: " + area_total_base);
    }

    public void mostrar_area_lateral() {
        System.out.println("Área Lateral: " + area_lateral);
    }

    public void mostrar_area_total() {
        System.out.println("Área Total: " + area_total);
    }

    public void mostrar_volume() {
        System.out.println("Volume: " + volume);
    }

    public double getArea() {
        System.out.println("Área com retorno: " + area);
        return area;
    }

    public double getAreaBase() {
        System.out.println("Área da Base com retorno: " + area_base);
        return area_base;
    }

    public double getAreaTotalBase() {
        System.out.println("Área Total da Base com retorno: " + area_total_base);
        return area_total_base;
    }

    public double getAreaLateral() {
        System.out.println("Área Lateral com retorno: " + area_lateral);
        return area_lateral;
    }

    public double getAreaTotal() {
        System.out.println("Área Total com retorno: " + area_total);
        return area_total;
    }

    public double getVolume() {
        System.out.println("Volume com retorno: " + volume);
        System.out.println(" ");
        return volume;
    }

    public abstract void calcAltura();
    public abstract void calcDiagonal();
    public abstract void calcAreaTotalBase();
    public abstract void calcArea();
    public abstract void calcAreaTotal();
    public abstract void calcVolume();
}
