/*
                INSTITUTO TECNOLOGICO DE TUXTLA GUTIERREZ
                        EXT. VENUSTIANO CARRANZA
                     ING. SISTEMAS COMPUTACIONALES
                           ESTRUCTURA DE DATOS
                            EVELYN LOPEZ NIETO
                              3er SEMESTRE
18/10/2018 */

package com.ittg.estructurasLineales;

import javax.swing.JOptionPane;

public class Pilas2 {
    private int tope, max;
    private int pila[];

    public Pilas2(int m) {
        
        max = m;
        pila = new int[max];
        tope = 0;
        JOptionPane.showMessageDialog(null, "Se creo pila de: " + max + " elementos");
    }

    private void agregarElemento(int n) {
        if (tope < max) {
            pila[tope] = n;
            tope++;
            JOptionPane.showMessageDialog(null, "Dato agregado correctamente...");
        } else {
            JOptionPane.showMessageDialog(null, "no hay espacio disponible");
        }
    }

    private void eliminar() {
        if (tope > 0) {
            tope--;
            JOptionPane.showMessageDialog(null, "Dato eliminado");
        } else {
            JOptionPane.showMessageDialog(null, "No hay datos por eliminar");
        }
    }

    private void imprimirPila() {
        
        if(!isVacia()){
        System.out.println("\nLa pila contiene los siguientes elementos:");
        for (int i = tope - 1; i >= 0; i--) {
            System.out.println("[" + pila[i] + "]");
        }
        }
        else{
            JOptionPane.showMessageDialog(null,"La pila está vacía... ingrese datos\n"
                    + "para llenar la pila");
        }
    }

    private boolean isVacia() {
        
        if(tope == 0){
            return true;
            }
        else{
        return false;
        }
        }
    
    private void verificar(){
        
        if(tope==0){
            JOptionPane.showMessageDialog(null,"La pila está vacia");
        }
        else{
            JOptionPane.showMessageDialog(null,"La pila tiene datos");
        }
    }

    public static void main(String[] args) {
        int opcion;
        Pilas2 p = new Pilas2(Integer.parseInt(JOptionPane.showInputDialog("Escribe el tamaño de la pila:")));
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu:\n"
                    + "1. Verificar si la pila esta vacia\n"
                    + "2. Insertar elemento\n"
                    + "3. Quitar elemento\n"
                    + "4. Imprimir pila\n"
                    + "5. Salir\n"));
            switch (opcion) {
                
                case 1:
                    p.verificar();
                    break;
                case 2:
                    p.agregarElemento(Integer.parseInt(JOptionPane.showInputDialog("ingrese numero")));
                    break;
                case 3:
                    p.eliminar();
                    break;
                case 4:
                    p.imprimirPila();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "opcion invalida");
            }
        } while (true);
    }
}
