package com.company;

public class Test {

    public static void main(String[] args) {

        //Instanciando los dos objetos de la clase producto
        Producto p = new Producto(001,"Manzanas",5.50);
        Producto p2 = new Producto(002,"Peras",2.50);

        //Instanciando los dos objetos de la clase Alumno
        Alumno a = new Alumno("001-2021","Jeison Roblero",20);
        Alumno a2 = new Alumno("002-2021","Carlos Mendez",30);

        /**
         * Comparando el precio de los productos: Manzanas y peras o p1 y p2
         */
        System.out.println("------COMPARANDO EL PRECIO DE LOS PRODUCTOS------");
        if (p.igualQue(p2)){
            System.out.println("Las manzanas tienen el mismo precio que las peras");
        }

        if (p.menorQue(p2)){
            System.out.println("El precio de las manzanas es menor que el de las peras");
        }

        if (p.menorIgualQue(p2)){
            System.out.println("El precio de las manzanas es menor o igual que el de las peras");
        }

        if (p.mayorQue(p2)){
            System.out.println("El precio de las manzanas es mayor que el de las peras");
        }

        if (p.mayorIgualQue(p2)){
            System.out.println("El precio de las manzanas es mayor o igual que el de las peras");
        }

        /**
         * Comparando la edad de los alumnos
         */
        System.out.println("\n------COMPARANDO LA EDAD DE LOS ALUMNOS------");
        if (a.igualQue(a2)){
            System.out.println("La edad del alumno 1 es igual a la edad del alumno 2");
        }

        if (a.menorQue(a2)){
            System.out.println("La edad del alumno 1 es menor que la edad del alumno 2");
        }

        if (a.menorIgualQue(a2)){
            System.out.println("La edad del alumno 1 es menor o igual que la edad del alumno 2");
        }

        if (a.mayorQue(a2)){
            System.out.println("La edad del alumno 1 es mayor que la edad del alumno 2");
        }

        if (a.mayorIgualQue(a2)){
            System.out.println("La edad del alumno 1 es mayor o igual que la edad del alumno 2");
        }

    }
}
