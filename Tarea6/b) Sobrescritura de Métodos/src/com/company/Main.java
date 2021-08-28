
package com.company;

public class Main {
    
    public static void main(String[] args){
        Auto auto1 = new Auto();
        Recursos rs = new Recursos();
        
        //NOTA: 
        //El cambio aquí es en la clase "Recurso" ya que ahí se sobrescribe
        //el metodo acelerar()
        
        //llamando al método encender sin parámetros
        auto1.encender();
        
        //llamando al método acelerar sin parámetros
        rs.acelerar();
        
        //llamando al método acelerar con parámetro de tipo int (entero)
        rs.acelerar(5);
        
        //llamando al método acelerar con parámetro de tipo String
        rs.acelerar("Deportivo");
    }
}
