/*
                INSTITUTO TECNOLOGICO DE TUXTLA GUTIERREZ
                        EXT. VENUSTIANO CARRANZA
                     ING. SISTEMAS COMPUTACIONALES
                           ESTRUCTURA DE DATOS
                            EVELYN LOPEZ NIETO
                              3er SEMESTRE
18/10/2018 */
//Clase que ejecuta una pila con todos sus metodos: agregar, eliminar, mostrar, pila vacia
package com.ittg.estructurasLineales;
//con esto mostraremos los resultados con ventanas graficas
import javax.swing.JOptionPane;
public class Pilas2 {
    
    private int tope, max;//determina el limite de parada
    private int pila[];//creacion del arrglo

    //constructor con los parametros de la clase
    public Pilas2(int m) {
        
        max = m;
        pila = new int[max];
        tope = 0;//como es un arreglo, se terminara en posicion cero
        JOptionPane.showMessageDialog(null, "Se creo pila de: " + max + " elementos");
    }

    //metodo para poder llenar la pila
    private void agregarElemento(int n) {
        if (tope < max) {//si el tope es menor que el limite de lugares, se llenara la pila
            pila[tope] = n;
            tope++;
            JOptionPane.showMessageDialog(null, "Dato agregado correctamente...");
        } else {//si la pila ya contiene datos, se le informa al usuario que ya no hay espacio
            JOptionPane.showMessageDialog(null, "no hay espacio disponible");
        }
    }

    //metodo para poder eliminar un dato de la pila
    private void eliminar() {
        if (tope > 0) {/*si el tope es mayor de cero, es decir, posicion mayor de cero, se comenzara a eliminar
            a partir del ultimo dato ingresado*/
            tope--;
            JOptionPane.showMessageDialog(null, "Dato eliminado");
        } else {//en caso contrario, la pila esta vacia y no hay datos que eliminar
            JOptionPane.showMessageDialog(null, "No hay datos por eliminar");
        }
    }

    //metodo que imprime la pila
    private void imprimirPila() {
        
        if(!isVacia()){//si el metodo booleano es diferente, la pila tiene datos y seran imprimidos
        System.out.println("\nLa pila contiene los siguientes elementos:");
        for (int i = tope - 1; i >= 0; i--) {//el bucle recorrera el arreglo
            System.out.println("[" + pila[i] + "]");
        }
        }
        else{//en caso contrario, mensaje de que la pila no tiene datos
            JOptionPane.showMessageDialog(null,"La pila está vacía... ingrese datos\n"
                    + "para llenar la pila");
        }
    }

    //metodo booleano que ayuda a verficar si la pila esta vacia
    private boolean isVacia() {
        
        if(tope == 0){
            return true;
            }
        else{
        return false;
        }
        }
    
    //metodo verificar
    private void verificar(){
        
        if(tope==0){//si no hay posiciones mayores de cero, la pila esta vacia
            JOptionPane.showMessageDialog(null,"La pila está vacia");
        }
        else{//en caso contrario, la pila esta llena
            JOptionPane.showMessageDialog(null,"La pila tiene datos");
        }
    }

    //metodo principal
    public static void main(String[] args) {
        
        int opcion;//variable para poder ingresar a los metodos por un menu
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
