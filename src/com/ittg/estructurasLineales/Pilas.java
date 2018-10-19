
package com.ittg.estructurasLineales;

import javax.swing.JOptionPane;

public class Pilas {
    
    int tamaño;
    int pila[]=new int[tamaño];
   
    
    public void crearPila(){
        tamaño=Integer.parseInt(JOptionPane.showInputDialog("Ingrese tamaño de su pila"));
    }
    public void insertar(){
        
        for(int i=0; i<pila.length; i++){
            pila[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese dato"));
        }
        
        for(int j=0; j<pila.length; j++){
            System.out.println(pila[j]);
        }
       }
    
    public void quitar(){
        
    }
    
    public void imprimir(){
        //int pila[]=new int[tamaño];
        
        for(int j=0-1; j>=tamaño; j--){
            System.out.println(pila[j]);
        }

}
        
    public static void main(String [] args){
        
        Pilas p=new Pilas();
        
        int opcion=Integer.parseInt(JOptionPane.showInputDialog("1. Crear pila\n2. Insertar\n3. Quitar\n4. Imprimir\n5. Salir\n\nIngrese opcion"));

        while(opcion<5){
            switch(opcion){
        
                case 1:
                    p.crearPila();
                    opcion=Integer.parseInt(JOptionPane.showInputDialog("1. Crear pila\n2. Insertar\n3. Quitar\n4. Imprimir\n5. Salir\n\nIngrese opcion"));
                    break;
        
                case 2:
                    p.insertar();
                    opcion=Integer.parseInt(JOptionPane.showInputDialog("1. Crear pila\n2. Insertar\n3. Quitar\n4. Imprimir\n5. Salir\n\nIngrese opcion"));
                    break;
                    
                case 3:
                    p.quitar();
                    opcion=Integer.parseInt(JOptionPane.showInputDialog("1. Crear pila\n2. Insertar\n3. Quitar\n4. Imprimir\n5. Salir\n\nIngrese opcion"));
                    break;
                    
                case 4:
                    p.imprimir();
                    opcion=Integer.parseInt(JOptionPane.showInputDialog("1. Crear pila\n2. Insertar\n3. Quitar\n4. Imprimir\n5. Salir\n\nIngrese opcion"));
                    break;
                    
                case 5:
                default:
                    System.out.println();
            }
        }
        if(opcion>5){
            JOptionPane.showMessageDialog(null,"no es opcion del menu");
        }
        else{
            JOptionPane.showMessageDialog(null,"saliendo");
        }
        
        
    }
}

