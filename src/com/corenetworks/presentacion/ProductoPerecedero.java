package com.corenetworks.presentacion;

import com.corenetworks.modelo.Producto;

public class ProductoPerecedero extends Producto {

    private String fCadicidad;



    public ProductoPerecedero() {






    }

    public ProductoPerecedero(String nombre, int cantidad, double pvp, String fCadicidad) {
        super(nombre, cantidad, pvp);
        this.fCadicidad = fCadicidad;


    }

    public String getfCadicidad() {
        return fCadicidad;
    }

    public void setfCadicidad(String fCadicidad) {
        this.fCadicidad = fCadicidad;
    }

    @Override
    public String toString() {
        return "ProductoPerecedero{" +
                "fCadicidad='" + fCadicidad + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                ", pvp=" + pvp +
                '}';


    }


}

