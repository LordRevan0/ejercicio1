package com.Revan;

public class Producto {

       public int codigo;
       public String descripcion;
       public double precio;
       public boolean gravado;
       public double impuesto;




        public Producto (int codigo1 , String descripcion1, double precio1, boolean gravado1){
            this.codigo=codigo1;
            this.descripcion=descripcion1;
            this.precio=precio1;
            this.gravado=gravado1;



        }
        public boolean CalcularImpuesto(){
        if (gravado==true)
        {


            return true;


        }
            else
                 {

                 return false;
                 }


        }





}


