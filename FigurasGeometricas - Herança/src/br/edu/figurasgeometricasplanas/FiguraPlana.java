package br.edu.figurasgeometricasplanas;

public abstract class FiguraPlana {
    protected double area;
    
    public void mostrar_area() {
        System.out.println("Área: " + area);
    }
    
    public double getArea() {
        System.out.println("Área com retorno: " + area);
        System.out.println(" ");
        return area;
    }
    
    public abstract void calcArea();
}
