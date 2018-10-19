
package com.ittg.estructurasLineales;

import javax.swing.JOptionPane;

public class PilaEjemplo {
    
    int pilaNumerica[]=new int[3];
    int tope=-1;
    
    public void insertar(){
        if(tope>=pilaNumerica.length-1){
            JOptionPane.showMessageDialog(null,"la pila esta llena");
        }
        else{
     
            tope+=1;
            pilaNumerica[tope]=Integer.parseInt(JOptionPane.showInputDialog("ingrese numero"));
            
        System.out.println(pilaNumerica[tope]+" ");
            
        }
    }
    
    public void eliminar(){
        if(tope==-1){
            JOptionPane.showMessageDialog(null,"la pila esta vacia");
        }
        else{
            System.out.println("se ha eliminado un elemento: "+(pilaNumerica[tope]=0));
            
        }
    }
    public void mostrar(){
        if(tope==-1){
            JOptionPane.showMessageDialog(null,"la pila esta vacia");
        }
        else{
            System.out.println("se ha eliminado un elemento: "+(pilaNumerica[tope]));
        }
    }
    
    public static void main(String[] args) {
        
        PilaEjemplo p=new PilaEjemplo();
        
        int opcion=Integer.parseInt(JOptionPane.showInputDialog("1. insertar\n2. eliminar\n3. mostrar\n4. salir\n\ningrese opcion"));
        
        while(opcion<4){
            switch(opcion){
                case 1: 
                    p.insertar();
                    opcion=Integer.parseInt(JOptionPane.showInputDialog("1. insertar\n2. eliminar\n3. mostrar\n4. salir\n\ningrese opcion"));
                break;
                case 2: 
                    p.eliminar();
                    opcion=Integer.parseInt(JOptionPane.showInputDialog("1. insertar\n2. eliminar\n3. mostrar\n4. salir\n\n"
                            + "ingrese opcion"));
                break;
                case 3:
                    p.mostrar();
                    opcion=Integer.parseInt(JOptionPane.showInputDialog("1. insertar\n2. eliminar\n3. mostrar\n4. salir\n\ningrese opcion"));
                    break;
                case 4:
                    //JOptionPane.showMessageDialog(null,"");
                default:
                    System.out.println();
            }
            
        }
        if(opcion>4){
                System.out.println("error");
            }
            else{
                System.out.println("saliendo");
            }
    }
    
}
