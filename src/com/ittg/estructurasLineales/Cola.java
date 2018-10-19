
package com.ittg.estructurasLineales;

import java.util.LinkedList;

public class Cola {


    public static void main(String[] args) {
        
        LinkedList cola=new LinkedList();
        
        if(cola.isEmpty()==true){
        for(int i=1; i<6; i++){
            cola.push(i);
        }
        while(cola.peek()!=null){
            
            System.out.println(cola.poll());
            
        }
        }
        else{
            
        }
    }
    
}
