
package com.company;

public class Auto {
    
    public void encender(){
        System.out.println("El auto se está encendiendo");
    }
    
    /**
     * Primer método usando el nombre acelerar sin parametros
     */
    public void acelerar(){
        System.out.println("Acelerando +10 km/h");
    }
    
    /**
     * Sobre cargando el método acelerar, en este caso el parámetro es entero
     * observamos que tiene el mismo nombre pero diferentes parametros
     * respecto al anterior
     * @param x 
     */
    public void acelerar(int x){
        System.out.println("Acelerando +" + x + " km/h");
    }
    
    /**
     * Sobrecarga del método: el nombre es el mismo "Acelerar" pero
     * en este caso el tipo de parámetro cambió, ahora recibe un String
     * @param modo 
     */
    public void acelerar(String modo){
        System.out.println("Acelerando en modo "+modo);
    }
    
    
    
}
