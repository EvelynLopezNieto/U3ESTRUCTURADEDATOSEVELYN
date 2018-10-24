/*
                INSTITUTO TECNOLOGICO DE TUXTLA GUTIERREZ
                        EXT. VENUSTIANO CARRANZA
                     ING. SISTEMAS COMPUTACIONALES
                           ESTRUCTURA DE DATOS
                            EVELYN LOPEZ NIETO
                              3er SEMESTRE
23/10/2018 */
//Clase que crea una cola con sus metodos principales de ejecucion
package com.ittg.colas;

//este paquete nos sirve para presentar los mensajes en ventanas graficas
import javax.swing.JOptionPane;

//la clase implementa los metodos la interface IColas
public class Colas implements IColas {
    
    //variables de la clase
    private int frente;//sirve para marcar el limite en la parte frontal de la cola
    private int fin;//sirve para marcar el limite en la parte trasera de la cola
    private int[] cola;//arreglo para crear la cola

    //constructor con los parametros de la clase
    public Colas() {
        frente=0;//como el arreglo comienza desde la posicion cero, el frente sera cero
        fin=-1;//como el arreglo comienza desde cero, entonces no toma en cuenta la ultima posicion
        
    }
    
    //metodo que crea la cola a partir de una entrada del usuario
    @Override
    public void crearCola(){
        //el usuario ingresa el tamaño de la cola
        cola=new int[Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de su cola"))];
    }
    
    //aqui se hace la insercion de datos a la cola
    @Override
    public void insertar() {
        
        if(fin==cola.length-1){/*si existe un dato final en la cola, entonces la cola esta llena aunque tenga solo
            un dato*/
            JOptionPane.showMessageDialog(null,"La cola esta llena");
        }
        else{//si no se cumple la condicion, entonces la pila esta vacia y se pedira al usuario ingrese datos
       int item=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        cola[++fin]=item;
        }
    }
    
    //aqui se imprime los datos que contiene la cola
    @Override
    public void imprimir() {
    
        if(!(fin==-1)){//si la pila no esta vacia, imprimira los datos de la cola
            String mensaje;
            mensaje=("La cola de tamaño "+cola.length+" contiene "+(fin+1)+" elementos\n\n");
        for(int i=frente; i<=fin; i++){
        
           mensaje=mensaje+("Elemento ["+i+"]="+cola[i]+"\n");
        }
        JOptionPane.showMessageDialog(null,mensaje);
        }
        else{//en caso contrario, se enviara un mensaje al usuario de que la cola esta vacia
            JOptionPane.showMessageDialog(null,"Cola vacia");
        }
    }
    
    //aqui se lleva a cabo la eliminacion de un dato de la cola
    @Override
    public void quitar() {     
        if(!(fin==-1)){/*si la cola tiene datos, podra eliminar uno a uno empezando por el primer dato
            que se ingreso*/
            for(int j=frente; j<=fin-1; j++){
                cola[j]=cola[j+1];
            }
            fin--;
            
            JOptionPane.showMessageDialog(null,"Elemento eliminado");
        }
        else{//en caso de que la cola este vacia, se le enviara un mensaje al usuario de que no hay datos
            JOptionPane.showMessageDialog(null,"No hay datos para eliminar");
        }
                
    }
    
    //este metodo sirve para informar al usuario si la cola esta llena
    @Override
    public void llena(){
        if(!estaVacia()){//si el metodo booleano es diferente, se le indicara al usuario que hay elementos en cola
            JOptionPane.showMessageDialog(null,"Hay "+(fin+1)+" elementos en cola");
        }
        else{//en caso contrario, se le indicara que no hay datos
            JOptionPane.showMessageDialog(null,"La cola no tiene ningun elemento...");
        }
        
    }
    
    //este metodo fue creado para que pueda ser utilizado como un verificador cuando la cola este llena o vacia
    public boolean estaVacia(){
        if(fin==-1){
            return true;
        }else{
            return false;
        }
    }
    
    //aqui envia un mensaje si la cola esta vacia 
    @Override
    public void vacia(){
        if(estaVacia()){//si la cola esta vacia
            JOptionPane.showMessageDialog(null,"La cola esta vacia");
        }else{//en caso contrario, se le indica al usuario que revise los elementos que tiene la cola
            JOptionPane.showMessageDialog(null,"La cola tiene elementos... ingrese a la\n"
                    + "opcion de esta llena para ver cuantos datos tiene.");
        }
    }
    
    //aqui se crea un menu para poder ingresar a los metodos
    @Override
    public void menu() {
        Colas c=new Colas();//instanciamos la clase
        
        do{
            //creamos la variable para ingresar opcion
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
       
    //ejecucion de la clase Colas
    public static void main(String[] args){
        
        Colas c=new Colas();
        
        //ejecucion del programa
        c.menu();
    } 
    
}
