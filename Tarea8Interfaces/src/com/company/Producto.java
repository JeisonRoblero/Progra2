package com.company;

public class Producto implements Comparador{
    private int idProducto;
    private String nombreProducto;
    private double precioProducto;

    public Producto(int idProducto, String nombreProducto, double precioProducto) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
    }

    @Override
    public boolean igualQue(Object par1) {
        Producto p = (Producto)par1;
        return this.precioProducto == p.precioProducto;
    }

    @Override
    public boolean menorQue(Object par1) {
        Producto p = (Producto)par1;
        return this.precioProducto < p.precioProducto;
    }

    @Override
    public boolean menorIgualQue(Object par1) {
        Producto p = (Producto)par1;
        return this.precioProducto <= p.precioProducto;
    }

    @Override
    public boolean mayorQue(Object par1) {
        Producto p = (Producto)par1;
        return this.precioProducto > p.precioProducto;
    }

    @Override
    public boolean mayorIgualQue(Object par1) {
        Producto p = (Producto)par1;
        return this.precioProducto >= p.precioProducto;
    }

}
