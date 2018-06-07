package estructuras.pila;
import estructuras.Nodo;
import test.*;
import excepciones.LinkedListEmptyException;

public class Pila implements StackActions{   
    private Nodo peek;
    private int size;   
    
    
    public Pila(){
        peek = null;
        size = 0;
    }  
    public int size() {
        return size;
    } 
    public boolean isEmpty() {
        return (peek == null);
    }
    public void push(Object objectToPush) {
        Nodo n = new Nodo(objectToPush, peek);
        peek = n;
        size ++;
    } 
    public Object pop() throws LinkedListEmptyException {
        if (isEmpty())
            throw new LinkedListEmptyException();
            Object temporal = peek.dato;
            peek= peek.siguiente;
            size --;
            return temporal; 
    }
    
    public Object peek() throws LinkedListEmptyException {
        if (isEmpty())
            throw new LinkedListEmptyException();

       return peek.dato;
    }
}
