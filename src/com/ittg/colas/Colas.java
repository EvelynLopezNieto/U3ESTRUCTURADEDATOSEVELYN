
package com.ittg.colas;

import javax.swing.JOptionPane;

public class Colas implements IColas {
    
    private int tam;
    private int frente;
    private int fin;
    private int[] cola;

    public Colas() {
        frente=0;
        fin=-1;
        
    }
    
    public void crearCola(){
        cola=new int[Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de su cola"))];
    }
    
    @Override
    public void insertar() {
        
        if(fin==cola.length-1){
            JOptionPane.showMessageDialog(null,"La cola esta llena");
        }
        else{
       int item=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        cola[++fin]=item;
        }
    }
    
    @Override
    public void imprimir() {
    
        if(!(fin==-1)){
            System.out.println("La cola de tamaño "+cola.length+" contiene "+(fin+1)+" elementos");
        for(int i=frente; i<=fin; i++){
        
           System.out.println("Elemento ["+i+"]="+cola[i]);
        }
        }
        else{
            JOptionPane.showMessageDialog(null,"Cola vacia");
        }
    }
    
    @Override
    public void quitar() {
        //!(frente-1>0):frente++
        if(!(fin==-1)){
            for(int j=frente; j<=fin-1; j++){
                cola[j]=cola[j+1];
            }
            fin--;
            
            JOptionPane.showMessageDialog(null,"Elemento eliminado");
        }
        else{
            JOptionPane.showMessageDialog(null,"No hay datos para eliminar");
        }
                
    }
        
    @Override
    public void llena(){
        if(!estaVacia()){
            JOptionPane.showMessageDialog(null,"Hay "+(fin+1)+" elementos en cola");
        }
        else{
            JOptionPane.showMessageDialog(null,"La cola no tiene ningun elemento...");
        }
        
    }
    
    public boolean estaVacia(){
        if(fin==-1){
            return true;
        }else{
            return false;
        }
    }
    @Override
    public void vacia(){
        if(estaVacia()){
            JOptionPane.showMessageDialog(null,"La cola esta vacia");
        }else{
            JOptionPane.showMessageDialog(null,"La cola tiene elementos... ingrese a la\n"
                    + "opcion de esta llena para ver cuantos datos tiene.");
        }
    }
    
    @Override
    public void menu() {
        Colas c=new Colas();
        
        do{
        int opcion=Integer.parseInt(JOptionPane.showInputDialog("Colas\n"
                + "1. Crear cola\n"
                + "2. Insertar\n"
                + "3. Imprimir elementos\n"
                + "4. Quitar elemento\n"
                + "5. Esta llena\n"
                + "6. Esta vacia\n"
                + "7. SALIR\n\n"
                + "Seleccione opcion"));
        switch(opcion){
        
            case 1:c.crearCola();
                break;
            case 2:c.insertar();
                break;
            case 3:c.imprimir();
                break;
            case 4:c.quitar();                
                break;
            case 5:c.llena();
                break;
            case 6:c.vacia();
                break;
            case 7:
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
