/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.cola;

/**
 *
 * @author ncalumno01
 */
public class Cola {
    
    class Nodo{
        char simbolo;
        Nodo siguiente;
        
    }
    
    private Nodo raiz;
    
    public Cola(){
        raiz=null;
    }
    
        public boolean isEmpty(){
            
        }

	void reset(){
            
        }

	void enqueue(Object o){
            
        }

	Object first() throws EmptyQueueException;

	Object dequeue() throws EmptyQueueException;
    
    
    
}
