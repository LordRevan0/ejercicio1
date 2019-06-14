package com.Revan;


public class Main {





    public static void main (String[] args) {
        double impuesto=0;
        Producto leche = new Producto(40,"Leche de vaca",20,false);
        Producto queso = new Producto(30,"queso de vaca",30,true);
        Producto quesillo = new Producto(20,"quesillo de vaca",40,true);

    if (leche.CalcularImpuesto()) {
        impuesto= leche.precio * 0.15;
        System.out.println(impuesto);

    }
    else {
        System.out.println(0);
    }


    }



}
