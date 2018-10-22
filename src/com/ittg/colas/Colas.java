
package com.ittg.colas;

import javax.swing.JOptionPane;

public class Colas implements IColas {
    
    private int tam=5;
    private int frente;
    private int fin;
    private int[] cola;

    public Colas() {
        frente=0;
        fin=-1;
        cola=new int[tam];
    }
    
    @Override
    public void insertar() {
        
        if(fin==tam-1){
            JOptionPane.showMessageDialog(null,"La cola esta llena");
        }
        else{
       int item=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        cola[++fin]=item;
        }
    }

    @Override
    public void quitar() {
        if(!(fin==tam-1)){
            frente++;
            JOptionPane.showMessageDialog(null,"Elemento eliminado");
        }
        else{
            JOptionPane.showMessageDialog(null,"No hay datos para eliminar");
        }
        
    }
    
    @Override
    public void imprimir() {
    
        if(!(fin==-1)){
            System.out.println("La cola de tamaño: "+tam+" contiene "+(fin+1)+" elementos");
        for(int i=frente; i<=fin; i++){
        
           System.out.println("Elemento ["+i+"]="+cola[i]);
        }
        }
        else{
            JOptionPane.showMessageDialog(null,"Cola vacia");
        }
    }
    
    @Override
    public void menu() {
        Colas c=new Colas();
        
        do{
        int opcion=Integer.parseInt(JOptionPane.showInputDialog("Colas\n"
                + "1. Insertar\n"
                + "2. Imprimir elementos\n"
                + "3. Quitar elemento\n"
                + "4. Esta llena\n"
                + "5. Esta vacia\n"
                + "6. SALIR\n\n"
                + "Seleccione opcion"));
        switch(opcion){
        
            case 1:c.insertar();
                break;
            case 2:c.imprimir();
                break;
            case 3:c.quitar();
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                System.exit(0);
            default:
                
        }
        }
        while(true);
    }
        
    public static void main(String[] args){
        
        Colas c=new Colas();
        
        c.menu();
    } 

    
}
