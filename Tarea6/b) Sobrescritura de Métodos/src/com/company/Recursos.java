
package com.company;

public class Recursos extends Auto{

    //Constructor sin parametros para 
    //Mandarlo a llamar en la clase principal
    public Recursos() {
    }
    
    //Sobrescritura del método de la clase padre Auto
    @Override
    public void acelerar(){
        System.out.println("----- SOBRESCRIBIENDO METODO ACELERAR: ----");
        System.out.println("Acelerando el motor desde la clase 'Recurso'");
    }
    
}
